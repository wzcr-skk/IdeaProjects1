package com.crmeeting.mapper;

import com.crmeeting.entity.Contact;
import java.util.List;

public interface ContactMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Contact record);

    Contact selectByPrimaryKey(Long id);

    List<Contact> selectAll();

    int updateByPrimaryKey(Contact record);
}