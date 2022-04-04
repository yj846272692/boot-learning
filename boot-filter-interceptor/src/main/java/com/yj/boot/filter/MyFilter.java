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
@WebFilter(filterName = "myFilter", urlPatterns = {"/*"})
@Slf4j
public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("myFilter 初始化");
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {
        log.info("myFilter 销毁");
        Filter.super.destroy();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("myFilter 请求处理之前----doFilter方法之前过滤请求");
        filterChain.doFilter (servletRequest, servletResponse   );
        log.info("myFilter 请求处理之后----doFilter方法之后处理响应");
    }
}
