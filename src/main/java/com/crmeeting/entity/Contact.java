package com.crmeeting.entity;

import java.util.Date;

public class Contact {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Long userId;

    private Long contactId;

    private Byte isFavorite;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Byte getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Byte isFavorite) {
        this.isFavorite = isFavorite;
    }
}