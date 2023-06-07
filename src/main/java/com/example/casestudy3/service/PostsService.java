package com.example.casestudy3.service;

import com.example.casestudy3.DAO.PostsDAO;
import com.example.casestudy3.model.Posts;
import com.example.casestudy3.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class PostsService {
    private final PostsDAO postsDAO;
    private static PostsService postsService;
    private static UserService userService;

    private PostsService() {
        postsDAO = new PostsDAO();
        userService = UserService.getInstance();
    }
    public static PostsService getInstance() {
        if (postsService == null) {
            postsService = new PostsService();
        }
        return postsService;
    }
    public List<Posts> getAllPost() {
        return postsDAO.findAllPosts();
    }
//    public List<User> getAllUserPost() {
//        return postsDAO.findAllUserPost();
//    }
    public List<Posts> getPost() {
        return postsDAO.findAll();
    }
    public void save(HttpServletRequest request) {
        String id = request.getParameter("postId");
        String content = request.getParameter("content");
        String img_url = request.getParameter("imgUrl");
        int userId = Integer.parseInt(request.getParameter("userId"));
        User user = userService.getById(userId);
        if (id != null) {
            int idUpdate = Integer.parseInt(id);
            postsDAO.updatePost(new Posts(idUpdate, user,content,img_url));
        } else {
            postsDAO.addPost(new Posts(user, content, img_url));
        }
    }
    public Posts getById(int id) {
        return postsDAO.findById(id);
    }
    public void deleteById(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        postsDAO.deleteById(id);
    }
    public boolean checkById(int id) {
        Posts posts = postsDAO.findById(id);
        return posts != null;
    }
}
