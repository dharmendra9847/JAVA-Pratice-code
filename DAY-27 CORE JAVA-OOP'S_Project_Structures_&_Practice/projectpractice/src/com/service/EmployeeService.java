package com.service;
import com.dto.EmployeeDTO;

public class EmployeeService {
	
	public int addEmployee(EmployeeDTO edto) {
		//DATA PROCESSING:
		
		int res = validateEmployee(edto);
		if(res == 100) {
			//DAO LAYER : LATER
			return res;// JUST TO GET RID OF ERROR
		}else {
			return res;
		}
	}
	
	
	public int validateEmployee(EmployeeDTO edto) {
		//DATA PROCESSING:
		
		if(edto.getEid() < 1 || edto.getEid() >  99) {
			return 4041;
		}
		else if(edto.getEage() < 18 || edto.getEage() > 40) {
			//19 to 39 ko allow kar rahe hai
			return 4042;
		}
		else if(edto.getEpincode() < 100000 || edto.getEpincode() > 999999) {
			return 4043;
		}
		else {
			return 100;
		}
	}
	
	public void test() {
		//AUR IS METHOD SE BHI SERVICE CALL HONE WALA HAI
	}
}
