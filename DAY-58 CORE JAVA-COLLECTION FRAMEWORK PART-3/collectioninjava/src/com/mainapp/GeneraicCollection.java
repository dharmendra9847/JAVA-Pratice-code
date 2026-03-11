package com.mainapp;

import java.util.ArrayList;

public class GeneraicCollection {

	public static void main(String[] args) {
		
		//GENERIC COLLECTION
		ArrayList <String> al = new ArrayList <String> ();
		al.add("XYZ1");
		al.add("XYZ2");
		al.add("XYZ3");
		al.add("XYZ4");

		for(int i = 0; i < al.size(); i++) {
			String names = al.get(i);
			System.out.println(names);
		}
	}

}
