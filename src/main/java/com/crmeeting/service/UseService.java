package com.crmeeting.service;

import com.crmeeting.entity.User;
import com.crmeeting.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: zhao quan
 * @Date: 2018/7/23 11:57
 * @PACKAGE_NAME: com.crmeeting.service
 * @Description:
 */
@Service
public class UseService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllOne(){
        return userMapper.selectAll();
    }

}
