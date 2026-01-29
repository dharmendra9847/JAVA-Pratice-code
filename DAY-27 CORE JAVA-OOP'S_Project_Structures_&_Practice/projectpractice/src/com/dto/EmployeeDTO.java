package com.dto;
public class EmployeeDTO {
	
	private int eid;
	private int eage;
	private int epincode;
	
	// DEFAULT CONTRUCTOR
	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	// PARAMETERIZED CONTRUCTOR
	public EmployeeDTO(int eid, int eage, int epincode) {
		super();
		this.eid = eid;
		this.eage = eage;
		this.epincode = epincode;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public int getEpincode() {
		return epincode;
	}

	public void setEpincode(int epincode) {
		this.epincode = epincode;
	}
}
