package com.comparatorinjava;

import java.util.Comparator;

public class DescendingOrderBasedOnAge implements Comparator<Employee>{

	@Override			//CURRENT OBJ	//EXISTING OJB
	public int compare(Employee e1, 	Employee e2) {

		
		return e1.getAge() - e2.getAge();
	}

}
