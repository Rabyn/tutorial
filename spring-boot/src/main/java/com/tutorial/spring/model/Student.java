package com.tutorial.spring.model;

import java.util.List;

public class Student {

	private int studentId;
	private String studentName;
	private String studentDescription;
	private List<Course> courses;
	
	public Student() {
		
	}
	
	public Student(int studentId, String studentName, String studentDescription, List<Course> courses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDescription = studentDescription;
		this.courses = courses;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDescription() {
		return studentDescription;
	}
	public void setStudentDescription(String studentDescription) {
		this.studentDescription = studentDescription;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDescription="
				+ studentDescription + ", courses=" + courses + "]";
	}
	
}
