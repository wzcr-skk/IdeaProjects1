package com.crmeeting.mapper;

import com.crmeeting.entity.ChatImage;
import java.util.List;

public interface ChatImageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ChatImage record);

    ChatImage selectByPrimaryKey(Long id);

    List<ChatImage> selectAll();

    int updateByPrimaryKey(ChatImage record);
}