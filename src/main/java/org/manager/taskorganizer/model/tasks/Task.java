package org.manager.taskorganizer.model.tasks;

import java.time.LocalDateTime;
import java.util.List;

import org.manager.taskorganizer.constants.Status;
import org.manager.taskorganizer.constants.Type;

public class Task {
	private long id;
	private long parentId;
	private String name;
	private Status status;
	private Type type;
	private LocalDateTime dueTimeStamp;
	private LocalDateTime createdTimeStamp;
	private LocalDateTime completedTimeStamp;
	private List<Task> subTasks;
	private List<Note> notes;
	private List<String> categories;
	private FrequencySetting frequencySetting;
	private boolean hasParent;
	private boolean hasChildren;

	public final long getId() {
		return id;
	}

	public final void setId(long id) {
		this.id = id;
	}

	public final long getParentId() {
		return parentId;
	}

	public final void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final Status getStatus() {
		return status;
	}

	public final void setStatus(Status status) {
		this.status = status;
	}

	public final Type getType() {
		return type;
	}

	public final void setType(Type type) {
		this.type = type;
	}

	public final LocalDateTime getDueTimeStamp() {
		return dueTimeStamp;
	}

	public final void setDueTimeStamp(LocalDateTime dueTimeStamp) {
		this.dueTimeStamp = dueTimeStamp;
	}

	public final LocalDateTime getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public final void setCreatedTimeStamp(LocalDateTime createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public final LocalDateTime getCompletedTimeStamp() {
		return completedTimeStamp;
	}

	public final void setCompletedTimeStamp(LocalDateTime completedTimeStamp) {
		this.completedTimeStamp = completedTimeStamp;
	}

	public final List<Task> getSubTasks() {
		return subTasks;
	}

	public final void setSubTasks(List<Task> subTasks) {
		this.subTasks = subTasks;
	}

	public final List<Note> getNotes() {
		return notes;
	}

	public final void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public final List<String> getCategories() {
		return categories;
	}

	public final void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public final FrequencySetting getFrequencySetting() {
		return frequencySetting;
	}

	public final void setFrequencySetting(FrequencySetting frequencySetting) {
		this.frequencySetting = frequencySetting;
	}

	public final boolean isHasParent() {
		return hasParent;
	}

	public final void setHasParent(boolean hasParent) {
		this.hasParent = hasParent;
	}

	public final boolean isHasChildren() {
		return hasChildren;
	}

	public final void setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

}
