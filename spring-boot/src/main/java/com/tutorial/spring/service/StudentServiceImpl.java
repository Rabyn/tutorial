package com.tutorial.spring.service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tutorial.spring.model.Course;
import com.tutorial.spring.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	private static List<Student> students = new ArrayList();
	
	static {
		//Initialize Data
				Course course1 = new Course(1, "Spring", "10 Steps", Arrays
						.asList("Learn Maven", "Import Project", "First Example",
								"Second Example"));
				Course course2 = new Course(2, "Spring MVC", "10 Examples",
						Arrays.asList("Learn Maven", "Import Project", "First Example",
								"Second Example"));
				Course course3 = new Course(3, "Spring Boot", "6K Students",
						Arrays.asList("Learn Maven", "Learn Spring",
								"Learn Spring MVC", "First Example", "Second Example"));
				Course course4 = new Course(4, "Maven",
						"Most popular maven course on internet!", Arrays.asList(
								"Pom.xml", "Build Life Cycle", "Parent POM",
								"Importing into Eclipse"));

				Student ranga = new Student(1, "Ranga Karanam",
						"Hiker, Programmer and Architect", new ArrayList<>(Arrays
								.asList(course1, course2, course3, course4)));

				Student satish = new Student(2, "Satish T",
						"Hiker, Programmer and Architect", new ArrayList<>(Arrays
								.asList(course1, course2, course3, course4)));

				students.add(ranga);
				students.add(satish);
		
	}

	@Override
	public List<Student> retrieveAllStudents() {
		return students;
	}

	@Override
	public Student retrieveStudent(int studentId) {
		for(Student student : students) {
			if(student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}

	@Override
	public List<Course> retrieveAllCourses(int studentId) {
		Student student = retrieveStudent(studentId);
		if(student == null) {
			return null;
		}
		
		return student.getCourses();
	}

	@Override
	public Course retrieveCourse(int studentId, int courseId) {
		Student student = retrieveStudent(studentId);
		if(student == null) {
			return null;
		}
		for(Course course:student.getCourses()) {
			if(course.getCourseId() == courseId) {
				return course;
			}
		}
		
		return null;
	}
	
	private SecureRandom random = new SecureRandom();
	
	public Course addCourse(int studentId, Course course) {
		Student student = retrieveStudent(studentId);

		if (student == null) {
			return null;
		}

		int randomId = new BigInteger(130, random).intValue();
		course.setCourseId(randomId);

		student.getCourses().add(course);

		return course;
	}
}
