package com.crmeeting.mapper;

import com.crmeeting.entity.CompanyFile;
import java.util.List;

public interface CompanyFileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CompanyFile record);

    CompanyFile selectByPrimaryKey(Long id);

    List<CompanyFile> selectAll();

    int updateByPrimaryKey(CompanyFile record);
}