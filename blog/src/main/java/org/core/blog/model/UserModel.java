package org.core.blog.model;

import org.core.blog.model.entity.User;

public interface UserModel {

	public User findById(int id);

    public User findAll();

    public int create(User user);

    public int delete(User user);

    public int delete(int id);
    

}