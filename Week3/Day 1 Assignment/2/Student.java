package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("chandru");

	}
	public void studentDept() {
		System.out.println("Mech");

	}
	public void studentId() {
		System.out.println("54321");

	}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		stu.deptName();
		stu.collegeName();
		stu.collegeRank();
		stu.collegeCode();
		

	}

}
