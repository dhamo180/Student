package com.studentdetails.tester;

public class Student_Details {
	public void stdName() {
		System.out.println("Dinesh");
	}

	public void stdId() {
		System.out.println(01);
	}

	public void stdNumber() {
		System.out.println("9710226831");
	}

	public void stdSection() {
		System.out.println("A section");
	}

	public void stdMarks() {
		System.out.println("Tamil:35 and English:45 and Maths:55");
	}

	public static void main(String[] args) {
		Student_Details std = new Student_Details();
		std.stdName();
		std.stdId();
		std.stdNumber();
		std.stdSection();
		std.stdMarks();

	}

}
