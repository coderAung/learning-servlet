package org.core.blog.model;

import org.core.blog.model.entity.Article;

public interface ArticleModel {

    public Article findById(int id);

    public Article findAll();

    public int create(Article article);

    public int delete(Article article);

    public int delete(int id);

}