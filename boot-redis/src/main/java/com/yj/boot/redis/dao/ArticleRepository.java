package com.yj.boot.redis.dao;

import com.yj.boot.redis.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/17
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    /**
     * 注意这个方法的名称，JPA会根据方法名自动生成SQL执行
     * 等同于：SELECT * FROM article WHERE author = ?
     *
     * @param author author
     * @return List<Article>
     */
    List<Article> findByAuthor(String author);
}
