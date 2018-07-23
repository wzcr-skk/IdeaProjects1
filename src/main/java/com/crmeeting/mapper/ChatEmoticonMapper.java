package com.crmeeting.mapper;

import com.crmeeting.entity.ChatEmoticon;
import java.util.List;

public interface ChatEmoticonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChatEmoticon record);

    ChatEmoticon selectByPrimaryKey(Long id);

    List<ChatEmoticon> selectAll();

    int updateByPrimaryKey(ChatEmoticon record);
}