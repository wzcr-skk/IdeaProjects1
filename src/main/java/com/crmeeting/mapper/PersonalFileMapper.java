package com.crmeeting.mapper;

import com.crmeeting.entity.PersonalFile;
import java.util.List;

public interface PersonalFileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PersonalFile record);

    PersonalFile selectByPrimaryKey(Long id);

    List<PersonalFile> selectAll();

    int updateByPrimaryKey(PersonalFile record);
}