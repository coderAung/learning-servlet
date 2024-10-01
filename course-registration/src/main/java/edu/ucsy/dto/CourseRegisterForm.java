package edu.ucsy.dto;

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
		return null;
	}

}
