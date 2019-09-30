//Question 2 => B)
package com.assign;

public class TestStudentDetails {

	public static void main(String[] args) {
		
		//creating a instance
		StudentDetails studentDetails = new StudentDetails();
		
		//assigning the values
		studentDetails.setName("Alex");
		studentDetails.setAge(23);
		studentDetails.setName("sam");
		studentDetails.setAge(23);
		
		//displaying output
		System.out.println(studentDetails.getName() + " is " + studentDetails.getAge() + " old.");
	}

}
