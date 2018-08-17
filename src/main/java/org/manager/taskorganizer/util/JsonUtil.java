package org.manager.taskorganizer.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public enum JsonUtil {
	INSTANCE;
	private ObjectMapper mapper = new ObjectMapper();
	public final String toJson(Object obj) {
		try {
			return mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			Util.LOG.error("Failed to serialize obj=[{}].", obj);
			return null;
		}
	}
}
