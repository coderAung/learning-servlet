package org.core.blog.model;

import org.core.blog.model.entity.Comment;

public interface CommentModel {

    public Comment findById(int id);

    public Comment findByArticleId(int id);

    public int create(Comment comment);

    public int delete(Comment comment);

    public int delete(int id);

}