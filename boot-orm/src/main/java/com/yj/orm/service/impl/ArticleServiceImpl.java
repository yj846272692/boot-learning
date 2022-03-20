package com.yj.orm.service.impl;

import com.yj.orm.dao.ArticleDao;
import com.yj.orm.entity.Article;
import com.yj.orm.service.ArticleService;


import javax.annotation.Resource;
import java.util.List;

/**
 * @program: boot-learning
 * @description:
 * @author: SYH
 * @create: 2022-03-18 12:58
 **/
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleDao articleDao;

    @Override
    public Article saveArticle(Article article) {
        int n = articleDao.save(article);
        if (n != 0) {
            return article;
        } else {
            return null;
        }
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public List<Article> selectAll() {
        return null;
    }

    @Override
    public Article findById(int id) {
        return null;
    }

    @Override
    public List<Article> findByAuthor(String author) {
        return null;
    }
}
