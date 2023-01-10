package com.usth.instagramclone.Activities;

public class User {
    private String id;
    private String username;
    private String profilePictureUrl;

    public User(String id, String username, String profilePictureUrl) {
        this.id = id;
        this.username = username;
        this.profilePictureUrl = profilePictureUrl;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }
}

