package com.crmeeting.mapper;

import com.crmeeting.entity.UserHasGroup;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHasGroupMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("groupId") Long groupId);

    int insert(UserHasGroup record);

    List<UserHasGroup> selectAll();
}