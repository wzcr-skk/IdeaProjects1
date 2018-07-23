package com.crmeeting.mapper;

import com.crmeeting.entity.PrivateChatRecord;
import java.util.List;

public interface PrivateChatRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PrivateChatRecord record);

    PrivateChatRecord selectByPrimaryKey(Long id);

    List<PrivateChatRecord> selectAll();

    int updateByPrimaryKey(PrivateChatRecord record);
}