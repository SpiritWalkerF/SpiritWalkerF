package com.sun.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * project copy from https://blog.csdn.net/weixin_42029450/article/details/111905746
 */
@Controller
@RequestMapping(value = "/hello")
public class TestController {

    @RequestMapping(value = "/test")
    public String test() {
        return "index";
    }
}
