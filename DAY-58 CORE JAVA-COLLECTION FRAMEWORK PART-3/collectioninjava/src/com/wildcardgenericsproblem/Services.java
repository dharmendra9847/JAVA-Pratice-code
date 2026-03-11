package com.wildcardgenericsproblem;

public class Services {

	public void readData() {
		
		ReadMyData read = new ReadMyData();
		return read.readData(5);
	}
}
