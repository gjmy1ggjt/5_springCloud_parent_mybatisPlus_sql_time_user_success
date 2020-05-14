package com.example.product.server.controller;

import com.example.common.entity.User;
import com.example.product.server.service.SendMessageService;
import com.example.product.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SendMessageService sendMessageService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") Integer id) {

        for (int i = 0; i < 100; i ++) {

            sendMessageService.sendMessage("yyyyy" + i);

        }

        return userService.getUserById(id);

    }
}
