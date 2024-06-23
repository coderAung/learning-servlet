package org.core.blog.controller.article;

import org.core.blog.controller.AbstractController;
import org.core.blog.model.service.ArticleService;
import org.core.blog.model.service.CommentService;

public class ArticleCreateController extends AbstractController {

	private static final long serialVersionUID = 1L;

    private ArticleService articleService;
    private CommentService commentService;

    private int createArticle() {
        return 0;
    }

}