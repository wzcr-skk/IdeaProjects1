package com.crmeeting.mapper;

import com.crmeeting.entity.RecordedFile;
import java.util.List;

public interface RecordedFileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RecordedFile record);

    RecordedFile selectByPrimaryKey(Long id);

    List<RecordedFile> selectAll();

    int updateByPrimaryKey(RecordedFile record);
}