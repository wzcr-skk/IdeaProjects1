package com.crmeeting.mapper;

import com.crmeeting.entity.GroupChatRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupChatRecordMapper {
    int deleteByPrimaryKey(@Param("id") Long id, @Param("groupId") Long groupId);

    int insert(GroupChatRecord record);

    GroupChatRecord selectByPrimaryKey(@Param("id") Long id, @Param("groupId") Long groupId);

    List<GroupChatRecord> selectAll();

    int updateByPrimaryKey(GroupChatRecord record);
}