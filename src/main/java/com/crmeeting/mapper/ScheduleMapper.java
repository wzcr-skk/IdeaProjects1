package com.crmeeting.mapper;

import com.crmeeting.entity.Schedule;
import java.util.List;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Schedule record);

    Schedule selectByPrimaryKey(Long id);

    List<Schedule> selectAll();

    int updateByPrimaryKey(Schedule record);
}