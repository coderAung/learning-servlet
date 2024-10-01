package edu.ucsy.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import edu.ucsy.model.entity.Course;

public class CourseRegisterForm {
	private String courseId;
	private String courseName;
	private int period;
	private String timeStart;
	private String teacherName;

	public CourseRegisterForm(String courseId, String courseName, int period, String timeStart, String teacherName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.period = period;
		this.timeStart = timeStart;
		this.teacherName = teacherName;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public Course getCourse() {
		
		Course course = new Course();
		
		course.setCourseId(this.courseId);
		course.setCourseName(this.courseName);
		course.setPeriod(this.period);
		course.setTeacherName(this.teacherName);
		
		// convert String timeStart to LocalDate
		LocalDate timeStartAsLocalDate = LocalDate.parse(timeStart, DateTimeFormatter.ofPattern("yyyy-MM-dd")); // 2024-10-01
		
		// using period, calculate timeEnd
		LocalDate timeEnd = timeStartAsLocalDate.plusMonths(period);
		
		course.setTimeStart(timeStartAsLocalDate);
		course.setTimeEnd(timeEnd);
		
		return course;
	}

}
