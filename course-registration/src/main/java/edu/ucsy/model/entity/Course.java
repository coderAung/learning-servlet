package edu.ucsy.model.entity;

import java.time.LocalDate;

public class Course {

	private String courseId;
	private String courseName;
	private int period;
	private LocalDate timeStart;
	private LocalDate timeEnd;
	private String teacherName;
	
	public Course() {
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

	public LocalDate getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(LocalDate timeStart) {
		this.timeStart = timeStart;
	}

	public LocalDate getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(LocalDate timeEnd) {
		this.timeEnd = timeEnd;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

}
