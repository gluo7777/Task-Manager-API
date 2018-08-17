package org.manager.taskorganizer.model.tasks;

import java.util.HashSet;
import java.util.Set;

public class ViewConfiguration {
	private String viewName;
	private Set<Long> taskIds;

	public final String getViewName() {
		return viewName;
	}

	public final void setViewName(String viewName) {
		this.viewName = viewName;
	}

	public final Set<Long> getTaskIds() {
		return taskIds != null ? this.taskIds : new HashSet<>();
	}

	public final void setTaskIds(Set<Long> taskIds) {
		this.taskIds = taskIds;
	}

}
