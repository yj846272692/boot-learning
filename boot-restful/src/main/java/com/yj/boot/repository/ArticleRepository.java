package com.yj.boot.repository;


import com.yj.boot.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/1
 */
@RepositoryRestResource(path = "articles")
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    /**
     * 根据id查询文章
     *
     * @param id
     * @return article
     */
    Article findArticleById(Integer id);


}
