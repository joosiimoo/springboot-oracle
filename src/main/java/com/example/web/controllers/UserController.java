package com.example.web.controllers;

import com.example.web.mappers.UsersMapper;
import com.example.web.model.Users;
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
public class UsersController {

    @Autowired
    UsersMapper usersMapper;

    @RequestMapping("/users")
    public String users(Model model) {
        Users users = new Users();
        users.setId_user(1L);
        users.setName("Jorge Silva");

        model.addAttribute("users", users);
        return "users";
    }

    @RequestMapping("/usersall")
    public String usersall(Model model) {
        List<Users> users = usersMapper.getAllUsers();
        model.addAttribute("users", users);
        return "usersall";
    }

    @ResponseBody
    @RequestMapping("/")
    String entry() {
        return "My Spring Boot App";
    }

}
