package com.gwd.mapper.user;

import com.gwd.model.user.User;

public interface UserMapper {
    User selectByPrimaryKey(Integer id);
}