package com.example.springboot.controller;

import com.example.springboot.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

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
    @ResponseBody
    public int[] bubbleSoft(HttpServletRequest request){
        int[] arry = {5,88,9,8,7,22,33,6,7};
        arry = demoService.bubbleSoft(arry,request.getParameter("type"));
        new ArrayList<>();
        return arry;
    }
}
