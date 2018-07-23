package com.crmeeting.entity;

import java.util.Date;

public class ChatEmoticon {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String emoticonAddress;

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

    public String getEmoticonAddress() {
        return emoticonAddress;
    }

    public void setEmoticonAddress(String emoticonAddress) {
        this.emoticonAddress = emoticonAddress;
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