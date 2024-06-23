package org.core.blog.model.impl;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.core.blog.model.UserModel;
import org.core.blog.model.entity.User;

public class UserModelImpl implements UserModel {

    private DataSource dataSource;

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findAll() {

		return null;
	}

	@Override
	public int create(User user) {

		return 0;
	}

	@Override
	public int delete(User user) {

		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}


}