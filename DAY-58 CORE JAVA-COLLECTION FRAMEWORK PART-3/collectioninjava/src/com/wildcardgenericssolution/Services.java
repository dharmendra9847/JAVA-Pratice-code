package com.wildcardgenericssolution;

import java.util.List;

public class Services {

	public List<?>  readData() {
		
		ReadMyData read = new ReadMyData();
		return read.readData(5);
	}
}
