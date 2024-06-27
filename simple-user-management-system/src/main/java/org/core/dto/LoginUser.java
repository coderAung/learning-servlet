package org.core.dto;

import org.core.entity.User.Role;

public class LoginUser {

	private int id;
	private String loginEmail;
	private Role role;

	public LoginUser(int id, String loginEmail, Role role) {
		this.id = id;
		this.loginEmail = loginEmail;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
