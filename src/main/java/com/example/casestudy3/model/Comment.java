package com.example.casestudy3.model;

public class Comment {
    private int id;
    private User user;
    private Posts posts;
    private String comment;

    public Comment() {
    }

    public Comment(int id, User user, Posts posts, String comment) {
        this.id = id;
        this.user = user;
        this.posts = posts;
        this.comment = comment;
    }

    public Comment(User user, Posts posts, String comment) {
        this.user = user;
        this.posts = posts;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

