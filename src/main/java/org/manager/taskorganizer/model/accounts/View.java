package org.manager.taskorganizer.model.accounts;

import java.sql.SQLXML;

public class View {
	private long id;
	private String name;
	private String description;
	private SQLXML configXml;

	public final long getId() {
		return id;
	}

	public final void setId(long id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final SQLXML getConfigXml() {
		return configXml;
	}

	public final void setConfigXml(SQLXML configXml) {
		this.configXml = configXml;
	}

}
