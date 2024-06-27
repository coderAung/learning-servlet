package org.core.dto.view;

import org.core.entity.User;
import org.core.entity.User.Role;

public class ProfileView {
	private String name;
	private String email;
	private Role role;

	public ProfileView(User user) {
		super();
		this.name = user.name();
		this.email = user.email();
		this.role = user.role();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
