package com.crmeeting.mapper;

import com.crmeeting.entity.ChatFile;
import java.util.List;

public interface ChatFileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChatFile record);

    ChatFile selectByPrimaryKey(Long id);

    List<ChatFile> selectAll();

    int updateByPrimaryKey(ChatFile record);
}