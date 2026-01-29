package com.controller;
import com.dto.EmployeeDTO;

import com.service.EmployeeService;

public class MyController {
	
	//FIELD
	private EmployeeService employeeSerice;   //NULL BY DEFALT
	
	
	//DEFAULT ONSTRUCTOR
	public MyController() {
		// TODO Auto-generated constructor stub
		employeeSerice = new EmployeeService(); //OBJECT
	}

	public int addEmployee(EmployeeDTO edto) {
		//AUR IS METHOD SE BHI SERVICE CALL HONE WALA HAI
		
		//SERVIE
//		EmployeeService eService = new EmployeeService();
		int res = employeeSerice.addEmployee(edto);
		return res;
	}
	
	public void test() {
		//AUR IS METHOD SE BHI SERVICE CALL HONE WALA HAI
		employeeSerice.test();
	}
}
