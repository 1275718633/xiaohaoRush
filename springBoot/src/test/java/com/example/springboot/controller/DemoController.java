package com.example.springboot.controller;

import com.example.springboot.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Liuzhonghao
 * @version 1.0
 * @Description
 * @date 2023/3/22 16:28
 */
@RequestMapping("/demo")
@Controller
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @RequestMapping("/bubbleSoft")
    public int[] bubbleSoft(HttpServletRequest request){
        int[] arry = {5,88,9,8,7,22,33,6,7};
        arry = demoService.bubbleSoft(arry,request.getParameter("type"));
        return arry;
    }
}
