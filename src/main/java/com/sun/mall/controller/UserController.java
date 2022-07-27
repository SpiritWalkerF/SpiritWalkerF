package com.sun.mall.controller;


import com.sun.mall.model.User;
import com.sun.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    /**
     * 将UserService注入controller层
     */
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/show")
    public String show(){
        //返回user页面显示内容
        return "user";
    }

    @PostMapping(value = "/getUser")
    public String getUser(Integer id, Model model) {
        User user = userService.selectUserById(id);
        model.addAttribute("users",user);
        if(user!=null){
            return "getUser";
        }else {
            return "error";
        }
    }

}
