package com.example.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Liuzhonghao
 * @version 1.0
 * @Description
 * @date 2023/4/4 14:28
 */
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=================初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("=================doFilter，正在执行");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("=================摧毁");
    }
}
