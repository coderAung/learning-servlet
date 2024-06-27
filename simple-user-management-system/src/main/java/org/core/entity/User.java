package org.core.entity;

public record User(int id, String email, String name, String password, Role role) {


	public enum Role {
		ADMIN, MANAGER, MEMBER
	}
}
