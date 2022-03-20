package com.yj.orm.dao;

import com.yj.orm.entity.Article;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;


/**
 * @program: boot-learning
 * @description:
 * @author: YG
 * @create: 2022-03-18
 **/
@Component
public class ArticleDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public int save(Article article) {
        String sql = "INSERT INTO article(author, title, content, create_time) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql,
                article.getAuthor(),
                article.getTitle(),
                article.getContent(),
                article.getCreateTime());
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM article WHERE id = ?", id);
    }

    public int updateById(Article article) {
        String sql = "UPDATE article SET author = ? ,title = ? ,content = ?, create_time = ? WHERE id = ?";
        return jdbcTemplate.update(sql,
                article.getAuthor(),
                article.getTitle(),
                article.getContent(),
                article.getCreateTime());
    }

    public Article findById(Long id) {
        String sql = "SELECT * FROM article WHERE id = ? ";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Article.class), id);
    }

    public List<Article> findAll() {
        String sql = "SELECT * FROM article";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Article.class));
    }
}
