package org.manager.taskorganizer.exception;

public class DefaultHandler {
	private DefaultHandler() {
		DefaultHandler.illegalConstruction(getClass());
	}
	
	public static final void illegalConstruction(Class<?> type) {
		throw new IllegalStateException(type.getName()+" cannot be instantiated.");
	}	
	
	public static final UnsupportedOperationException notSupported() {
		return new UnsupportedOperationException("Method not supported.");
	}
}
