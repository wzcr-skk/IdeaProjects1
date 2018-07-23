package com.crmeeting.entity;

import java.util.Date;

public class ChatFile {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String fileAddress;

    private Long groupChatRecordId;

    private Long groupId;

    private Long privateChatRecordId;

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

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public Long getGroupChatRecordId() {
        return groupChatRecordId;
    }

    public void setGroupChatRecordId(Long groupChatRecordId) {
        this.groupChatRecordId = groupChatRecordId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getPrivateChatRecordId() {
        return privateChatRecordId;
    }

    public void setPrivateChatRecordId(Long privateChatRecordId) {
        this.privateChatRecordId = privateChatRecordId;
    }
}