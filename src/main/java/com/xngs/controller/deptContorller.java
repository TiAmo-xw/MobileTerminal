package com.xngs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     //声明为控制器，实例创建交给Spring管理
@RequestMapping("/dept")    //根命名空间，用于区分不同模块对应的请求
public class deptContorller {
    public String findById(){

        return null;
    }
}
