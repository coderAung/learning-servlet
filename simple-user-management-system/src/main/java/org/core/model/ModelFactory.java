package org.core.model;

import org.core.database.DatabaseManager;
import org.core.entity.User;
import org.core.model.impl.UserModel;

public abstract class ModelFactory {
	
	static DatabaseManager manager;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			manager = DatabaseManager.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Model<User> getUserModel() {
		return new UserModel(manager);
	}
}
