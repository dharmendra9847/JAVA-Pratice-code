package com.wildcardgenericssolution;

import java.util.List;

public class WildCardLaunch {

	public static void main(String[] args) {
		
		List<?> data = new Services().readData();
		
		for(int i = 0; i < data.size(); i++) {
			Object x = data.get(i);
			if(x instanceof Integer) {
				Integer num = (Integer) x;
				System.out.print(num + " ");
			}else {
				String name = (String) x;
				System.out.print(name + " ");
			}
		}
	}
}
