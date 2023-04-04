package com.example.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Liuzhonghao
 * @version 1.0
 * @Description
 * @date 2023/3/27 10:44
 */
@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /*super.addViewControllers(registry);*/
        registry.addViewController("/bubbleSoft").setViewName("/success");
    }

    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter webMvcConfigurerAdapter = new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                /*super.addViewControllers(registry);*/
                registry.addViewController("/bubbleSoft").setViewName("/success");
            }
        };
        return webMvcConfigurerAdapter;
    }
}
