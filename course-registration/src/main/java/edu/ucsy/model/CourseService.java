package edu.ucsy.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.ucsy.dto.CourseRegisterForm;
import edu.ucsy.model.entity.Course;

public class CourseService {

	public boolean register(CourseRegisterForm form) {
		Course course = form.getCourse();
		
		String sql = """
				
				insert into courses (course_id, course_name, period, time_start, time_end, teacher_name)
				values (?, ?, ?, ?, ?, ?)
				
				""";
		
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_db", "root", "admin");
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, course.getCourseId());
			stmt.setString(2, course.getCourseName());
			stmt.setInt(3, course.getPeriod());
			stmt.setDate(4, Date.valueOf(course.getTimeStart()));
			stmt.setDate(5, Date.valueOf(course.getTimeEnd()));
			stmt.setString(6, course.getTeacherName());
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
