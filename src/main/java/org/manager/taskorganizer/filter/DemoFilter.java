package org.manager.taskorganizer.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.manager.taskorganizer.util.Util;

/**
 * Filters run before servlets.
 * 
 * @author will
 *
 */
public class DemoFilter implements Filter {

	private FilterConfig filterConfig;

	public void init(FilterConfig filterConfig) throws ServletException {
		Util.LOG.info(filterConfig.getFilterName() + " initialized.");
		this.filterConfig = filterConfig;
	}

	public void destroy() {
		Util.LOG.info(filterConfig.getFilterName() + " destroyed.");
		this.filterConfig = null;
	}

	/**
	 * 1 Request/Response context read/modify 2 Invoke next filter 3 Other crap
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

	}

}
