package org.manager.taskorganizer.servlet;

import java.time.LocalDateTime;

public class ErrorResponse {
	private LocalDateTime timestamp;
	private String servletName;
	private String message;

	public ErrorResponse() {}

	public ErrorResponse(String servletName, String message) {
		this.timestamp = LocalDateTime.now();
		this.servletName = servletName;
		this.message = message;
	}

	public final LocalDateTime getTimestamp() {
		return timestamp;
	}

	public final void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public final String getServletName() {
		return servletName;
	}

	public final void setServletName(String servletName) {
		this.servletName = servletName;
	}

	public final String getMessage() {
		return message;
	}

	public final void setMessage(String message) {
		this.message = message;
	}

}
