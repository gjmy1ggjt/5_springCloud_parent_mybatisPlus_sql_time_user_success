package com.example.product.server.controller;


import com.example.common.entity.UserYYY;
import com.example.product.server.service.SendMessageService;
import com.example.product.server.service.impl.TestServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestServiceImpl testService;

    @RequestMapping(value = "/one/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") Integer id) {
        return testService.getTestById(id);

    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public UserYYY getUser(@PathVariable("id") Integer id) {
        return testService.getUserById(id);

    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save() {

        testService.save();

        return "success22";
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String delete() {

        testService.delete();

        return "success3";

    }

    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String update() {

        testService.delete();

        return "success3";

    }


}
