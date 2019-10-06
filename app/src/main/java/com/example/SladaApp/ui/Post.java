package com.example.SladaApp.ui;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {
    private String nameToSend;

    @SerializedName("id")
    @Expose
    private String login;

    public String getID() {
        return login;
    }

    public void setNameToSend(String nameToSend) {
        this.login = login;
    }

}
