package com.crmeeting.mapper;

import com.crmeeting.entity.Questionnaire;
import java.util.List;

public interface QuestionnaireMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Questionnaire record);

    Questionnaire selectByPrimaryKey(Long id);

    List<Questionnaire> selectAll();

    int updateByPrimaryKey(Questionnaire record);
}