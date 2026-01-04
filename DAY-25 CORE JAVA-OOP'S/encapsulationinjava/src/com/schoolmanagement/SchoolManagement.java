package com.schoolmanagement;
import com.mainapp.*;
import java.util.Scanner;

public class SchoolManagement {
	
	public void studentsDetails(StudentsInfo student) {
		System.out.println("YOUR ROLL IS: " + student.roll);
		System.out.println("YOUR AGE IS: " + student.age);
		System.out.println("YOUR GENDER IS: " + student.gender);
		System.out.println("PHYSICALLY CHALLENGE: " + student.pc);
		System.out.println("YOUR PCM PERCENTAGE IS: " + student.pcmPer);
	}
}
