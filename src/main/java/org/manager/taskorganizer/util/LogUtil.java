package org.manager.taskorganizer.util;

public enum LogUtil {
	INSTANCE;
	public void info(String msg) {
		System.out.println(String.format(msg));
	}

	public void info(String msg, Object... args) {
		System.out.println(String.format(msg, args));
	}

	public void error(String msg) {
		System.err.println(String.format(msg));
	}

	public void error(String msg, Object... args) {
		System.err.println(String.format(msg, args));
	}
}
