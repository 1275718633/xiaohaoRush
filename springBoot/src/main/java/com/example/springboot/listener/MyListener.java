package com.example.springboot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Liuzhonghao
 * @version 1.0
 * @Description
 * @date 2023/4/4 14:32
 */
public class MyListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("=========contextDestroyed 摧毁");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("=========contextInitialized 初始化");
    }
}
