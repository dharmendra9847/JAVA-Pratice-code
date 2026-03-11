package com.wildcardgenericsproblem;

import java.util.Arrays;
import java.util.List;

public class ReadMyData {
	
	List <String> list1 = Arrays.asList("L1", "L2", "L3");
	List <Integer> list2 = Arrays.asList(11, 22, 33);
	
	public void readData(int key) {
		if(key == 1) {
			return list1;
		}else {
			return list2;
		}
	}
}
