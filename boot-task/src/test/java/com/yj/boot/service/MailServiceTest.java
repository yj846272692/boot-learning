package com.yj.boot.service;

import com.yj.boot.entity.Article;
import freemarker.template.Template;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;


import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.util.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ExtendWith(SpringExtension.class)
class MailServiceTest {
    @Resource
    MailService mailService;

    @Resource
    FreeMarkerConfigurer freeMarkerConfigurer;

    @Test
    void sendSimpleMail() {
        mailService.sendSimpleMail("1294898797@qq.com","测试邮件","123123");
    }

    @Test
    void sendHtmlMail() throws MessagingException {
        mailService.sendHtmlMail("846272692@qq.com","111", "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>这是一个HTML5的网页</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>Hello HTML5</p>\n" +
                "</body>\n" +
                "</html>");
    }

    @Test
    void sendAttachmentsMail() throws MessagingException {
        mailService.sendAttachmentsMail("846272692@qq.com","附件HTML邮件","附件HTML邮件！",
                "D:\\soft2176\\test.html");
    }

    @Test
    public void sendTemplateMail() throws Exception {
        // 添加动态数据，替换模版里面的占位符
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1L, "YG", "今天星期一", "内容一", new Date()));
        articles.add(new Article(2L, "YG", "今天下雨天", "内容二", new Date()));
        Template template = freeMarkerConfigurer.getConfiguration().getTemplate("freemarker-temp.ftl");
        //将模版文件及数据渲染完成后，转换为html字符串
        Map<String, Object> model = new HashMap<>();
        model.put("articles", articles);
        String templateHtml = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
        // 发送邮件
        mailService.sendHtmlMail("846272692@qq.com", "这是一封freemarker模版的html测试邮件",templateHtml);
    }


}

