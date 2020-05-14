package com.example.common.customer.server.service;

import com.example.common.entity.Teacher;
import com.example.common.utils.DataGrid;

/**
 * Created by Administrator on 2020/1/25.
 */
public interface TeacherService {

    DataGrid<String> save(Teacher teacher);
}
