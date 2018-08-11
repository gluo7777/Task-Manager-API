package org.manager.taskorganizer.model.tasks;

import java.time.LocalDateTime;

public class Note {
	private LocalDateTime lastUpdatedTimeStamp;
	private String text;

	public final LocalDateTime getLastUpdatedTimeStamp() {
		return lastUpdatedTimeStamp;
	}

	public final void setLastUpdatedTimeStamp(LocalDateTime lastUpdatedTimeStamp) {
		this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
	}

	public final String getText() {
		return text;
	}

	public final void setText(String text) {
		this.text = text;
	}

}
