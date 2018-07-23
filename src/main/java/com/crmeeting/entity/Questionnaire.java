package com.crmeeting.entity;

import java.util.Date;

public class Questionnaire {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Date createOrUploadTime;

    private Date deadline;

    private String questionnaireAddress;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getCreateOrUploadTime() {
        return createOrUploadTime;
    }

    public void setCreateOrUploadTime(Date createOrUploadTime) {
        this.createOrUploadTime = createOrUploadTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getQuestionnaireAddress() {
        return questionnaireAddress;
    }

    public void setQuestionnaireAddress(String questionnaireAddress) {
        this.questionnaireAddress = questionnaireAddress;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}