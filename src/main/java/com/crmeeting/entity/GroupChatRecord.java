package com.crmeeting.entity;

import java.util.Date;

public class GroupChatRecord {
    private Long id;

    private Long groupId;

    private Date gmtCreate;

    private Date gmtModified;

    private Long sender;

    private Date datetime;

    private Short haveRead;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
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

    public Long getSender() {
        return sender;
    }

    public void setSender(Long sender) {
        this.sender = sender;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Short getHaveRead() {
        return haveRead;
    }

    public void setHaveRead(Short haveRead) {
        this.haveRead = haveRead;
    }
}