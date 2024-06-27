package org.core.model.impl;

import java.sql.SQLException;
import java.util.List;

import org.core.database.DatabaseManager;
import org.core.entity.User;
import org.core.entity.User.Role;
import org.core.model.AbstractModel;

public class UserModel extends AbstractModel<User> {

	public UserModel(DatabaseManager manager) {
		super(manager);
	}

	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findById(int id) {
		var sql = """
				select users.*, roles.name as role from users 
				join roles on roles.id=users.role_id where users.id=?
				""";
		
		try (var conn = manager.getConnection();
				var stmt = conn.prepareStatement(sql)) {
			
			stmt.setInt(1, id);
			var result = stmt.executeQuery();
			
			while (result.next()) {
				return new User(result.getInt(1),
						result.getString(2),
						result.getString(3),
						result.getString(4),
						Role.valueOf(result.getString("role").toUpperCase()));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User findById(String id) {
		var sql = """
				select users.*, roles.name as role from users 
				join roles on roles.id=users.role_id where users.email=?
				""";
		
		try (var conn = manager.getConnection();
				var stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, id);
			var result = stmt.executeQuery();
			
			while (result.next()) {
				return new User(result.getInt(1),
						result.getString(2),
						result.getString(3),
						result.getString(4),
						Role.valueOf(result.getString("role").toUpperCase()));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
