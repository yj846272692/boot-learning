package com.yj.boot.redis.service.impl;

import com.yj.boot.redis.dao.ArticleDao;
import com.yj.boot.redis.model.Article;
import com.yj.boot.redis.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/17
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleDao articleDao;

    @Override
    @Transactional(rollbackFor = {Exception.class})
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
        return articleDao.findAll();
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
