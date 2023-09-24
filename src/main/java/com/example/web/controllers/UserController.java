package com.example.web.controllers;

import com.example.web.domain.User;
import com.example.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Jorge on 8/21/16.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

//TODO tambien se puede inyectar desde el controller
//    @Autowired
//    UserMapper userMapper;

    @RequestMapping("/users")
    public String users(Model model) {
        User user = new User();
        user.setId_user(1L);
        user.setName("Jorge Silva");

        model.addAttribute("user", user);
        return "users";
    }

    @RequestMapping("/usersall")
    public String usersall(Model model) {
        List<User> users = userService.selectAll();
        model.addAttribute("users", users);
        return "usersall";
    }

    @ResponseBody
    @RequestMapping("/")
    String entry() {
        return "My Spring Boot App";
    }

}
