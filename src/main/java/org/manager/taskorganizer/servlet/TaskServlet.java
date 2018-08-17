package org.manager.taskorganizer.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.manager.taskorganizer.model.ApiResponse;
import org.manager.taskorganizer.model.tasks.Task;
import org.manager.taskorganizer.repository.TaskRepository;
import org.manager.taskorganizer.repository.TaskRepositoryImpl;
import org.manager.taskorganizer.util.Util;

public class TaskServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8983130060342535866L;

	private String username,password,url;
	private ServletContext servletContext;
	
	@Override
	public void init() throws ServletException {
		this.servletContext = this.getServletContext();
		this.username = this.servletContext.getInitParameter("datasource.username");
		this.password = this.servletContext.getInitParameter("datasource.password");
		this.url = this.servletContext.getInitParameter("datasource.url");
		Util.LOG.info("JDBC:\nUsername:%s\nPassword:%s\nUrl:%s"
			,firstLast(this.username)
			,firstLast(this.password)
			,this.url
		);
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			Util.LOG.error("Failed to initialize task service:%s", e);
			System.exit(-1);
		} 
	}

	private String firstLast(String string) {
		return string.charAt(0)+"***"+string.charAt(string.length()-1);
	}
	
	private Connection getConnection() throws SQLException {
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			Util.LOG.error("Failed to establish data connection: %s.", e);
			throw e;
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		try {
			TaskRepository repo = TaskRepositoryImpl.newInstance(getConnection());
			String parameter = req.getParameter("accountId");
			if(this.validAccountId(parameter)) {
				List<Task> tasksForUser = repo.getTasksForUser(Long.parseLong(parameter));
				ApiResponse response = new ApiResponse().setTasks(tasksForUser);
				writer.println(Util.JSON.toJson(response));
			}else {
				writer.println(error("Invalid input."));
			}
		} catch (Exception e) {
			writer.println(error("Failed completely."));
		}
	}

	private String error(String msg ) {
		return ErrorResponse.build().setServletName(this.getServletName()).setMessage(msg).toJson();
	}
	
	Pattern accountNumber = Pattern.compile("^\\d+$");
	
	private boolean validAccountId(String param) {
		return param != null && accountNumber.matcher(param).matches();
	}
	
	
}
