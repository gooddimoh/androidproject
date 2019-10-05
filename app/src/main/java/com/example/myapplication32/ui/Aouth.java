package com.example.myapplication.ui;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Aouth {
    @SerializedName("Login")
    @Expose
    private String login;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("NameToSend")
    @Expose
    private String nameToSend;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getNameToSend() {
        return nameToSend;
    }

    public void setNameToSend(String nameToSend) {
        this.nameToSend = nameToSend;
    }
}
