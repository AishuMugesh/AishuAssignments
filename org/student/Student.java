package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
	System.out.println("Student Name : Aishwarya");
	}
	public void studentDept()
	{
		System.out.println("Student Dept :B.E - Mech");
	}
	public void studentId()
	{
		System.out.println("Student ID :001123001");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println("/** Sample for Multi-level Inheritance **/");
		System.out.println("/** Methods called from Super Class **/");
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		System.out.println("/** Methods called from Sub Class 1 **/");
		st.deptName();
		System.out.println("/** Methods called from execution class **/");
		st.studentName();
		st.studentId();
		st.studentDept();
	}
}
