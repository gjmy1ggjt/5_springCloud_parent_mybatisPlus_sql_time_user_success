package com.example.common.customer.server.controller.test;

import com.example.common.customer.server.feign.product.UserService;
import com.example.common.customer.server.service.TeacherService;
import com.example.common.customer.server.utils.RedisUtil;
import com.example.common.entity.Teacher;
import com.example.common.entity.User;
import com.example.common.utils.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by Administrator on 2020/1/22.
 */
@RestController
@RequestMapping(value = "/user")
public class CustomerController {

    @Autowired
    private UserService userService;

    @Autowired
    private TeacherService teacherService;

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") Integer id) {

        return userService.getUserById(id);

    }

    @RequestMapping(value = "/get/{key}", method = RequestMethod.GET)
    public String getRedisByKey(@PathVariable("key") String key) {

        return redisUtil.get(key).toString();

    }

    @RequestMapping(value = "/teacher/save", method = RequestMethod.POST)
    public DataGrid<String> teacher() {

        Teacher teacher = new Teacher();

//        teacher.setId(UUID.randomUUID().toString());

        teacher.setUserCode(UUID.randomUUID().toString());

        teacher.setUserName("主键自动生成数据库保存");

        teacher.setUserPassword("1231231");

        teacher.setUserState("333");

        return teacherService.save(teacher);

    }




    public static void main(String[] args) {


    }
}
