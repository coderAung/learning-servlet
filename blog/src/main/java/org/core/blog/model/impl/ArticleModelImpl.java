package org.core.blog.model.impl;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.core.blog.model.ArticleModel;
import org.core.blog.model.entity.Article;

public class ArticleModelImpl implements ArticleModel {

	private DataSource dataSource;

	@Override
	public Article findById(int id) {
		return null;
	}

	@Override
	public Article findAll() {
		return null;
	}

	@Override
	public int create(Article article) {

		return 0;
	}

	@Override
	public int delete(Article article) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}



}