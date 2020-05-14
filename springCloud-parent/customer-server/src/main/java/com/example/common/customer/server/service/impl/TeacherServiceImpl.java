package com.example.common.customer.server.service.impl;

/**
 * Created by Administrator on 2020/1/25.
 */
import com.example.common.customer.server.dao.TeacherMapperDao;
import com.example.common.customer.server.service.TeacherService;
import com.example.common.entity.Teacher;
import com.example.common.utils.DataGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapperDao teacherMapperDao;


    @Override
    public DataGrid<String> save(Teacher teacher) {
        return new DataGrid<>(true, teacherMapperDao.insert(teacher));
    }
}
