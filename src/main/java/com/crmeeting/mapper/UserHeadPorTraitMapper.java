package com.crmeeting.mapper;

import com.crmeeting.entity.UserHeadPorTrait;
import java.util.List;

public interface UserHeadPorTraitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserHeadPorTrait record);

    UserHeadPorTrait selectByPrimaryKey(Long id);

    List<UserHeadPorTrait> selectAll();

    int updateByPrimaryKey(UserHeadPorTrait record);
}