package org.manager.taskorganizer.util;

public final class Util {
	
	private Util() {
		throw new IllegalStateException(this.getClass().getName() + " cannot be instantiated.");
	}

	public static final LogUtil LOG = LogUtil.INSTANCE;
	public static final JsonUtil JSON = JsonUtil.INSTANCE;
}
