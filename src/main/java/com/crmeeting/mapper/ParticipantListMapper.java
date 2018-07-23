package com.crmeeting.mapper;

import com.crmeeting.entity.ParticipantList;
import java.util.List;

public interface ParticipantListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ParticipantList record);

    ParticipantList selectByPrimaryKey(Long id);

    List<ParticipantList> selectAll();

    int updateByPrimaryKey(ParticipantList record);
}