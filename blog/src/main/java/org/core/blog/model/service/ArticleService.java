package org.core.blog.model.service;

import org.core.blog.model.ArticleModel;
import org.core.blog.view.ArticleDetailView;
import org.core.blog.view.form.ArticleForm;

public class ArticleService {
	
    private ArticleModel articleModel;

    public int create(ArticleForm articleForm) {

        return 0;
    }

    public int delete(int id) {
        // TODO implement here
        return 0;
        
    }

    /**
     * @param articleView 
     * @return
     */
    public int delete(ArticleDetailView articleView) {
        // TODO implement here
        return 0;
    }

    /**
     * @param id 
     * @return
     */
    public ArticleDetailView getArticleDetailView(int id) {
        // TODO implement here
        return null;
    }

}