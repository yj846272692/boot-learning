package com.yj.boot.template.controller;

import com.yj.boot.template.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

/**
 * @program: boot-resources-template
 * @description:
 * @author: SYH
 * @create: 2022-04-04 10:26
 **/

@Controller
@RequestMapping("/template")
public class TemplateController {

    @GetMapping("/freemarker")
    public String freemarkerIndex(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "小杨", "Java"),
                new Article(2, "大杨", "Spring"),
                new Article(3, "老杨", "SpringBoot")
        );
        model.addAttribute("articles", articles);
        System.out.println(articles);
        // 模版名称，实际的目录为:resources/templates/freemarker-demo.ftl
        return "freemarker-demo";
    }

    @GetMapping("/thymeleaf")
    public String thymeleafIndex(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "小杨", "Java"),
                new Article(2, "小杨", "Spring"),
                new Article(3, "小杨", "SpringBoot")
        );
        model.addAttribute("articles", articles);
        return "thymeleaf-demo";
    }
}
