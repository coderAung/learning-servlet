package org.core.blog.controller.article;

import org.core.blog.controller.AbstractController;
import org.core.blog.model.service.ArticleService;
import org.core.blog.model.service.CommentService;
import org.core.blog.view.ArticleDetailView;
import org.core.blog.view.ArticleView;

public class ArticleReadController extends AbstractController {

	private static final long serialVersionUID = 1L;

	private ArticleService articleService;
    private CommentService commentService;

    private ArticleDetailView articleDetail(int id) {
    
    	return null;
    }

    private ArticleView getAllArticles() {
        return null;
    }
    private ArticleView getArticlesByUserId(int id) {
        return null;
    }

}