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

	public final Task setId(long id) {
		this.id = id;
		return this;
	}

	public final long getParentId() {
		return parentId;
	}

	public final Task setParentId(long parentId) {
		this.parentId = parentId;
		return this;
	}

	public final String getName() {
		return name;
	}

	public final Task setName(String name) {
		this.name = name;
		return this;
	}

	public final Status getStatus() {
		return status;
	}

	public final Task setStatus(Status status) {
		this.status = status;
		return this;
	}

	public final Type getType() {
		return type;
	}

	public final Task setType(Type type) {
		this.type = type;
		return this;
	}

	public final LocalDateTime getDueTimeStamp() {
		return dueTimeStamp;
	}

	public final Task setDueTimeStamp(LocalDateTime dueTimeStamp) {
		this.dueTimeStamp = dueTimeStamp;
		return this;
	}

	public final LocalDateTime getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public final Task setCreatedTimeStamp(LocalDateTime createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
		return this;
	}

	public final LocalDateTime getCompletedTimeStamp() {
		return completedTimeStamp;
	}

	public final Task setCompletedTimeStamp(LocalDateTime completedTimeStamp) {
		this.completedTimeStamp = completedTimeStamp;
		return this;
	}

	public final List<Task> getSubTasks() {
		return subTasks;
	}

	public final Task setSubTasks(List<Task> subTasks) {
		this.subTasks = subTasks;
		return this;
	}

	public final List<Note> getNotes() {
		return notes;
	}

	public final Task setNotes(List<Note> notes) {
		this.notes = notes;
		return this;
	}

	public final List<String> getCategories() {
		return categories;
	}

	public final Task setCategories(List<String> categories) {
		this.categories = categories;
		return this;
	}

	public final FrequencySetting getFrequencySetting() {
		return frequencySetting;
	}

	public final Task setFrequencySetting(FrequencySetting frequencySetting) {
		this.frequencySetting = frequencySetting;
		return this;
	}

	public final boolean isHasParent() {
		return hasParent;
	}

	public final Task setHasParent(boolean hasParent) {
		this.hasParent = hasParent;
		return this;
	}

	public final boolean isHasChildren() {
		return hasChildren;
	}

	public final Task setHasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
		return this;
	}

}
