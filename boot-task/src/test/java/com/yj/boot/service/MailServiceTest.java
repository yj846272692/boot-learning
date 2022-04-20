package com.yj.boot.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import javax.mail.MessagingException;


@SpringBootTest
@ExtendWith(SpringExtension.class)
class MailServiceTest {
    @Resource
    MailService mailService;

    @Test
    void sendSimpleMail() {
        mailService.sendSimpleMail("1294898797@qq.com","测试邮件","123123");
    }

    @Test
    void sendHtmlMail() throws MessagingException {
        mailService.sendHtmlMail("574139122@qq.com","111", "<!DOCTYPE html>\n" +
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
        mailService.sendAttachmentsMail("16422802@qq.com","来自 杨晶 的定时邮件","冲！",
                "D:\\soft2176\\test.html");
    }
}

