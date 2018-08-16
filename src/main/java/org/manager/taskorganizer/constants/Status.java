package org.manager.taskorganizer.constants;

public enum Status {
	COMPLETED, IN_PROGRESS, NOT_STARTED, CANCELLED, MISSED;
	public String getSqlName() {
		return this.name().toLowerCase();
	}
	
	public static Status fromSqlName(String name) {
		return Status.valueOf(name.toUpperCase());
	}
}
