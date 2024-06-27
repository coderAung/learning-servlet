package org.core.service;

import org.core.dto.LoginUser;
import org.core.dto.view.ProfileView;
import org.core.entity.User;
import org.core.model.Model;
import org.core.model.ModelFactory;

public class UserService {

	private Model<User> userModel;
	
	public UserService() {
		userModel = ModelFactory.getUserModel();
	}

	public LoginUser login(String email, String password) {
		
		var user = userModel.findById(email);
		if (user.password().equals(password)) {
			return new LoginUser(user.id(), user.email(), user.role());
		}
		
		return null;
	}

	public ProfileView getProfileView(int id) {
		var user = userModel.findById(id);
		if (null == user) {
			return null;
		}
		var profileView = new ProfileView(user);
		return profileView;
	}
	
}
