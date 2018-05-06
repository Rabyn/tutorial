package com.tutorial.spring.model;

import java.util.List;

public class Course {

	private int courseId;
	private String courseName;
	private String courseDescription;
	private List<String> courseSteps;
	
	public Course() {
		
	}
	
	public Course(int courseId, String courseName, String courseDescription, List<String> courseSteps) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseSteps = courseSteps;
	}

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public List<String> getCourseSteps() {
		return courseSteps;
	}
	public void setCourseSteps(List<String> courseSteps) {
		this.courseSteps = courseSteps;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", courseSteps=" + courseSteps + "]";
	}
	
	
}
