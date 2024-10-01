package edu.ucsy.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ucsy.dto.CourseRegisterForm;
import edu.ucsy.model.entity.Course;
import edu.ucsy.util.DatabaseConnector;

public class CourseService {

	public boolean register(CourseRegisterForm form) {
		Course course = form.getCourse();
		
		String sql = """
				
				insert into courses (course_id, course_name, period, time_start, time_end, teacher_name)
				values (?, ?, ?, ?, ?, ?)
				
				""";
		
		try(Connection conn = DatabaseConnector.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, course.getCourseId());
			stmt.setString(2, course.getCourseName());
			stmt.setInt(3, course.getPeriod());
			stmt.setDate(4, Date.valueOf(course.getTimeStart()));
			stmt.setDate(5, Date.valueOf(course.getTimeEnd()));
			stmt.setString(6, course.getTeacherName());
			
			int rows = stmt.executeUpdate();
			if(rows > 0) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public List<Course> searchCourseByTeacherName(String teacherName) {
	
		String sql = """
					select course_id, course_name, period,
							time_start, time_end, teacher_name
					from courses where teacher_name like ?
				"""; // like %word%
		
		try(Connection conn = DatabaseConnector.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, "%".concat(teacherName).concat("%"));
			
			ResultSet rs = stmt.executeQuery();
			
			List<Course> courseList = new ArrayList<Course>();
			
			while(rs.next()) {
				Course course = new Course();
				course.setCourseId(rs.getString("course_id"));
				course.setCourseName(rs.getString("course_name"));
				course.setPeriod(rs.getInt("period"));
				course.setTeacherName(rs.getString("teacher_name"));
				course.setTimeStart(rs.getDate("time_start").toLocalDate());
				course.setTimeEnd(rs.getDate("time_end").toLocalDate());
				
				courseList.add(course);
			}
			
			return courseList;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
