package org.manager.taskorganizer.examples;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EnumToJsonExample {

	public static void main(String[] args) {
		try {
			System.out.println("Json output of Person: " + new ObjectMapper().writeValueAsString(Person.WILL));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	@JsonFormat(shape=JsonFormat.Shape.OBJECT)
	public enum Person {
		WILL("William", 23), DAVID("David", 20);
		private final String name;
		private final int age;

		private Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public final String getName() {
			return name;
		}

		public final int getAge() {
			return age;
		}

	}

}
