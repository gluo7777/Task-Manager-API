package org.manager.taskorganizer.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.manager.taskorganizer.model.Account;
import org.manager.taskorganizer.model.Task;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * URL: {root}/demo
 * 
 * @author root
 *
 */
public class DemoServlet extends HttpServlet {

	public static void main(String[] args) throws URISyntaxException {
		URI taskUri = URI.create("/demo/task");
		URI taskUri2 = new URI("/demo/task");
		System.out.println(taskUri.equals(taskUri2));

		Matcher matcher = Pattern.compile("/task/(?<taskId>\\d+)").matcher("/task/12345");
		if (matcher.matches())
			System.out.println(matcher.group("taskId"));
	}

	/**
	 * Generated Serial ID
	 */
	private static final long serialVersionUID = -1330673415951325220L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * 1 Parse req 2 log info 3 create TO with req id 4 serialize into json 5 write
		 * to servlet output
		 */
		PrintWriter writer = resp.getWriter();
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String[]> parameters = req.getParameterMap();
		Pattern tasks = Pattern.compile("/task/(?<id>\\d+)");
		Pattern accounts = Pattern.compile("/account/(?<id>\\d+)");
		try {
			Matcher matcher = null;
			long id = Long.MIN_VALUE;
			if ((matcher = tasks.matcher(req.getPathInfo())).matches()) {
				id = Long.parseLong(matcher.group("id"));
				Task task = new Task();
				task.setId(id);
				task.setName("Example task");
				String json = mapper.writeValueAsString(task);
				writer.println(json);
			} else if ((matcher = accounts.matcher(req.getPathInfo())).matches()) {
				id = Long.parseLong(matcher.group("id"));
				Account account = new Account();
				account.setId(id);
				account.setUsername("Stupid name");
				account.setPassword("Terrible password");
				String json = mapper.writeValueAsString(account);
				writer.println(json);
			} else {
				throw new ServletException("Invalid request.");
			}
			writer.flush();
		} catch (Exception e) {
			ErrorResponse error = new ErrorResponse(this.getServletName(), e.getMessage());
			String json = mapper.writeValueAsString(error);
			writer.println(json);
		}
	}
}
