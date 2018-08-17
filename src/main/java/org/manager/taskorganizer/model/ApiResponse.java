package org.manager.taskorganizer.model;

import java.util.List;

import org.manager.taskorganizer.model.tasks.Task;

public class ApiResponse {
	private List<Task> tasks;

	public final List<Task> getTasks() {
		return tasks;
	}

	public final ApiResponse setTasks(List<Task> tasks) {
		this.tasks = tasks;
		return this;
	}
	
	
}
