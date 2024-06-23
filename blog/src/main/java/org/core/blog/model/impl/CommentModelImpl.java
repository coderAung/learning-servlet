package org.core.blog.model.impl;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.core.blog.model.CommentModel;
import org.core.blog.model.entity.Comment;

public class CommentModelImpl implements CommentModel {

    private DataSource dataSource;

	@Override
	public Comment findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment findByArticleId(int id) {

		return null;
	}

	@Override
	public int create(Comment comment) {

		return 0;
	}

	@Override
	public int delete(Comment comment) {

		return 0;
	}

	@Override
	public int delete(int id) {

		return 0;
	}


}