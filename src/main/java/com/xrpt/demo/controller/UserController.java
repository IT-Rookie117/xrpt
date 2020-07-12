package com.xrpt.demo.controller;

import com.xrpt.demo.entity.User;
import com.xrpt.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author by wjx
 * @date 2020/7/12
 * @DESC: 测试mybaits整合情况,可直接用来做UserController
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAllUser")
    public ModelAndView queryAllUser(){
        System.out.println("查询所有");
        List<User> users = userService.queryAllUser();
        ModelAndView model = new ModelAndView();
        model.setViewName("list");
        model.addObject("users",users);
        return model;
    }
}