package org.college;

public class Student {
	
	public static void main(String[] args) {
		
		College college = new College();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		
		Department department = new Department();
		department.deptName();
		
		Student student = new Student();
		student.studentName();
		student.studentDept();
		student.studentId();
	}
	
	public void studentName()
	{
		System.out.println("Revathi Sathishkumar");
	}
	
	public void studentDept()
	{
		System.out.println("Information Technology");
	}
	
	public void studentId()
	{
		System.out.println("1196182");
	}

}
