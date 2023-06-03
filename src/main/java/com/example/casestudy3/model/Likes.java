package com.example.casestudy3.model;

public class Likes {
    private int id ;
    private User user;
    private Posts posts;

    public Likes() {
    }

    public Likes(int id, User user, Posts posts) {
        this.id = id;
        this.user = user;
        this.posts = posts;
    }

    public Likes(User user, Posts posts) {
        this.user = user;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }
}

