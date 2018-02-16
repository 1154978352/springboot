package com.gwd.mapper.stu;

import com.gwd.model.stu.Stu;

public interface StuMapper {
    Stu selectByPrimaryKey(Integer id);
}