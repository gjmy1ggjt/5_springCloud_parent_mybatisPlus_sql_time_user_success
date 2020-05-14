package com.example.product.server.service.impl;

import com.example.common.entity.User;
import com.example.common.entity.UserYYY;
import com.example.product.server.dao.UserMapperDao;
import com.example.product.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2020/1/22.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapperDao userMapperDao;

    @Override
    public User getUserById(Integer id) {
        return userMapperDao.selectById(id);
    }
}
