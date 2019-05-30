package com.example.evgen.ghuserlistener;

import java.util.Date;

public class User {
    private String name;
    private String fullName;
    private int image;
    private int followers;
    private Date joined;

    public User(String name, String fullName, int image){

        this.name=name;
        this.fullName = fullName;
        this.image = image;
        this.followers = followers;
        this.joined = joined;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getImage() {
        return this.image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getFollowers() {
        return this.followers;
    }
    public Date getJoined() {
        return this.joined;
    }
}
