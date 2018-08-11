package org.manager.taskorganizer.model.tasks;

import java.util.List;

public class ViewConfiguration {
	private String viewName;
	private List<Task> tasks;

	public final String getViewName() {
		return viewName;
	}

	public final void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public final List<Task> getTasks() {
		return tasks;
	}

	public final void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}
