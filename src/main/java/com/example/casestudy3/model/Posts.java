package com.example.casestudy3.model;

public class Posts {
    private int id;
    private User user;
    private String content;
    private String img_url;
    private int likeCount;

    public Posts() {
    }

    public Posts(int id, User user, String content, int likeCount) {
        this.id = id;
        this.user = user;
        this.content = content;
        this.likeCount = likeCount;
    }

    public Posts(User user, String content, int likeCount) {
        this.user = user;
        this.content = content;
        this.likeCount = likeCount;
    }

    public Posts(int id, User user, String content, String img_url, int likeCount) {
        this.id = id;
        this.user = user;
        this.content = content;
        this.img_url = img_url;
        this.likeCount = likeCount;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
