package com.zxy.learning.designPattern.proAndcon;

public class Resource {

	private final int intData;

	public Resource(int d) {
		intData = d;
	}

	public Resource(String d) {
		intData = Integer.valueOf(d);
	}

	public int getData() {
		return intData;
	}

	@Override
	public String toString() {
		return "data:" + intData;
	}
}
