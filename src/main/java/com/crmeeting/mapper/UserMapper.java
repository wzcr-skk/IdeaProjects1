package com.crmeeting.mapper;

import com.crmeeting.entity.User;
import java.util.List;

public interface UserMapper {
    int insert(User record);

    List<User> selectAll();
}