package com.tutorial.spring.service;

import java.util.List;

import com.tutorial.spring.model.Course;
import com.tutorial.spring.model.Student;

public interface StudentService {

	public List<Student> retrieveAllStudents();
	public Student retrieveStudent(int studentId);
	public List<Course> retrieveAllCourses(int studentId);
	public Course retrieveCourse(int studentId, int courseId);
	public Course addCourse(int studentId, Course newCourse);
}
