package com.example.product.server.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.common.entity.UserYYY;
import com.example.product.server.bean.Test;
import org.apache.ibatis.annotations.Param;


public interface TestMapperDao extends BaseMapper<Test>{

    Test selectByPrimaryKey(@Param("id") Integer id);

    String getTestById(@Param("id") Integer id);

    UserYYY getUserById(@Param("id") Integer id);
}
