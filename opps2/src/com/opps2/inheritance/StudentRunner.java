package com.opps2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		//Student student = new Student();
		//student.setName("Ranga");
		//student.setEmail("kemiambaliya@hmail.com");
		/*
		 * Person person = new Person(); String value = person.toString();
		 * System.out.println(value); System.out.println(person);
		 */
		Employee employee = new Employee("kemi","programmer Analyst");
		//
		employee.setEmail("kemiambaliya803@gmail.com");
		employee.setPhoneNumber("313-681-6978");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");
		
		System.out.println(employee);
		
	}

}
