package com.crmeeting.mapper;

import com.crmeeting.entity.UserInformation;
import java.util.List;

public interface UserInformationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInformation record);

    UserInformation selectByPrimaryKey(Long id);

    List<UserInformation> selectAll();

    int updateByPrimaryKey(UserInformation record);
}