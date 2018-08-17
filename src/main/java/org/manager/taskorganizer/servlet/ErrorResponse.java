package org.manager.taskorganizer.servlet;

import java.time.LocalDateTime;

import org.manager.taskorganizer.util.Util;

public class ErrorResponse {
	private LocalDateTime timestamp;
	private String servletName;
	private String message;

	public ErrorResponse() {}
	
	public static ErrorResponse build() {return new ErrorResponse(null,null);}

	public ErrorResponse(String servletName, String message) {
		this.timestamp = LocalDateTime.now();
		this.servletName = servletName;
		this.message = message;
	}

	public final LocalDateTime getTimestamp() {
		return timestamp;
	}

	public final ErrorResponse setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	public final String getServletName() {
		return servletName;
	}

	public final ErrorResponse setServletName(String servletName) {
		this.servletName = servletName;
		return this;
	}

	public final String getMessage() {
		return message;
	}

	public final ErrorResponse setMessage(String message) {
		this.message = message;
		return this;
	}
	
	public String toJson() {
		return Util.JSON.toJson(this);
	}

}
