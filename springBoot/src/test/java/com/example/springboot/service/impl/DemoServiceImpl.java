package com.example.springboot.service.impl;

import com.example.springboot.service.IDemoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liuzhonghao
 * @version 1.0
 * @Description
 * @date 2023/3/22 16:34
 */
@Service("demoService")
public class DemoServiceImpl implements IDemoService {

    @Override
    public int[] bubbleSoft(int[] arry,String type) {
        for(int i=0;i<arry.length;i++){
            for(int j=0;j<arry.length-i;j++){
                if(arry[i]>arry[j] && "10".equals(type)){
                    //不需要转换的临时变量
                    arry[i] = arry[i] + arry[j];
                    arry[j] = arry[i] - arry[j];
                    arry[i] = arry[i] - arry[j];
                }else if(arry[i]>arry[j] && "20".equals(type)){
                    //需要转换的临时变量
                    int temp = 0;
                    temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        return arry;
    }
}
