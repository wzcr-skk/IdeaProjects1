package com.crmeeting.mapper;

import com.crmeeting.entity.ChatText;
import java.util.List;

public interface ChatTextMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChatText record);

    ChatText selectByPrimaryKey(Long id);

    List<ChatText> selectAll();

    int updateByPrimaryKey(ChatText record);
}