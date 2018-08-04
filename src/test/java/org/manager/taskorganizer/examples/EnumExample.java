package org.manager.taskorganizer.examples;

public class EnumExample {

	public static void main(String[] args) {
		System.out.printf("GET3=%d,\tGET10=%d", OverridableEnum.GET3.getMyNumber(), OverridableEnum.GET10.getMyNumber());
	}

	public enum OverridableEnum {
		GET3() {
			@Override
			public int getMyNumber() {
				return 3;
			}
		},
		GET10() {
			@Override
			public int getMyNumber() {
				return 10;
			}
		};
		public int getMyNumber() {
			return Integer.MIN_VALUE;
		}
	}
}
