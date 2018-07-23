package com.crmeeting.entity;

import java.util.Date;

public class CompanyFile {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Date uploadOrSaveTime;

    private String fileAddress;

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

    public Date getUploadOrSaveTime() {
        return uploadOrSaveTime;
    }

    public void setUploadOrSaveTime(Date uploadOrSaveTime) {
        this.uploadOrSaveTime = uploadOrSaveTime;
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}