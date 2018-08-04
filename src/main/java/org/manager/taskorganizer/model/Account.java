package org.manager.taskorganizer.model;

public class Account {
	private long id;
	private String username;
	private String password;

	public final long getId() {
		return id;
	}

	public final void setId(long id) {
		this.id = id;
	}

	public final String getUsername() {
		return username;
	}

	public final void setUsername(String username) {
		this.username = username;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}
}
