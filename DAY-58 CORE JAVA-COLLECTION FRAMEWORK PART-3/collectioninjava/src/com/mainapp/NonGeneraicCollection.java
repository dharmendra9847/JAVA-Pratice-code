package com.mainapp;

import java.util.ArrayList;

public class NonGeneraicCollection {

	public static void main(String[] args) {
		
		//NON GENERIC COLLECTION
		ArrayList  al = new ArrayList();
		al.add("XYZ1");
		al.add("XYZ2");
		al.add("XYZ3");
		al.add("XYZ4");
		al.add('a');

		//ONE WAY
//		for(int i = 0; i < al.size(); i++) {
//			String names = (String) al.get(i);
//			System.out.println(names);			//ClassCastException
//		}
		
		//TO AVOID ClassCastException
		for(int i = 0; i < al.size(); i++) {
			Object object = al.get(i);
			if(object instanceof String) {
				String names = (String) object;
				System.out.println(names);
			}else {
				Character c = (Character) object;
				System.out.println(c);
			}
		}
	}

}
