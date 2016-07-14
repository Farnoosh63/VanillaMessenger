package com.epicodus.vanillamessenger.models;

import org.parceler.Parcel;



@Parcel
public class User {

    String name;
    String email;
    private String pushId;

    public User(){}


    public User(String name, String email){
        this.name = name;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }
}
