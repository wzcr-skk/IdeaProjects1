package com.crmeeting.mapper;

import com.crmeeting.entity.Group;
import java.util.List;

public interface GroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Group record);

    Group selectByPrimaryKey(Long id);

    List<Group> selectAll();

    int updateByPrimaryKey(Group record);
}