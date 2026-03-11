package com.comparatointerfacesolution;

import java.util.Comparator;

public class SortingOrderBasedOnSalary implements Comparator<Employee>{

	@Override		//CURR. OBJ. 	// EXISTING OBJ.
	public int compare(Employee o1, Employee o2) {
		
		//return o1.getSalary() - o2.getSalary(); // ASCENDING ORDER
		return o2.getSalary() - o1.getSalary(); // DESCENDING ORDER
	}

}
