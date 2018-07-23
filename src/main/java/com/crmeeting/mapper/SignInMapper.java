package com.crmeeting.mapper;

import com.crmeeting.entity.SignIn;
import java.util.List;

public interface SignInMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SignIn record);

    SignIn selectByPrimaryKey(Long id);

    List<SignIn> selectAll();

    int updateByPrimaryKey(SignIn record);
}