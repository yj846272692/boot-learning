package com.yj.boot.exception.controller;

import com.yj.boot.exception.entity.Article;
import com.yj.boot.exception.service.ExceptionService;
import com.yj.boot.exception.utils.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;


/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/11
 */
@RestController
public class ArticleController {
    @Resource
    private ExceptionService exceptionService;

    @GetMapping("/test/{id}")
    public AjaxResponse test(@PathVariable("id") int id) {
        if (id ==0){
            exceptionService.systemBizError(id);
        }
        exceptionService.userBizError(id);
        Article article = Article.builder()
                .id(id)
                .title("Java")
                .build();
        return AjaxResponse.success(article);
    }

    @PostMapping("/articles")
    public Article saveArticle(@Valid @RequestBody Article article) {
        return article;
    }
}
