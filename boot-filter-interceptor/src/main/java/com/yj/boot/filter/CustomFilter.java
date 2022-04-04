package com.yj.boot.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/4
 */
@WebFilter(filterName = "customFilter", urlPatterns = {"/*"})
@Slf4j
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("customFilter 初始化···");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("customFilter请求处理之前--doFilter方法之前过滤请求···");
        //链路直接传给下一个过滤器
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("customFilter请求处理之后--doFilter方法之后处理响应···");
    }

    @Override
    public void destroy() {
        log.info("customFilter 销毁");
    }
}
