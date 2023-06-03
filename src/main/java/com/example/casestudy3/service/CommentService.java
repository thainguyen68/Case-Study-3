package com.example.casestudy3.service;

import com.example.casestudy3.DAO.CommentDAO;
import com.example.casestudy3.DAO.PostsDAO;
import com.example.casestudy3.model.Comment;
import com.example.casestudy3.model.Posts;
import com.example.casestudy3.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class CommentService {
    private final CommentDAO commentDAO;
    private static CommentService commentService;
    private static PostsService postsService;
    private static UserService userService;

    private CommentService() {
        commentDAO = new CommentDAO();
        userService = UserService.getInstance();
        postsService= PostsService.getInstance();
    }
    public static CommentService getInstance() {
        if (commentService == null) {
            commentService = new CommentService();
        }
        return commentService;
    }
    public List<Comment> getPost() {
        return commentDAO.findAll();
    }
    public void save(HttpServletRequest request) {
        String id = request.getParameter("id");
        int userId = Integer.parseInt(request.getParameter("userId"));
        User user = userService.getById(userId);
        int postId = Integer.parseInt("postId");
        Posts posts = postsService.getById(postId);
        String comment = request.getParameter("comment");
        if (id != null) {
            int idUpdate = Integer.parseInt(id);
            commentDAO.updatePost(new Comment(idUpdate, user,posts,comment));
        } else {
            commentDAO.addPost(new Comment(user, posts, comment));
        }
    }
    public Comment getById(int id) {
        return commentDAO.findById(id);
    }
    public void deleteById(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        commentDAO.deleteById(id);
    }
    public boolean checkById(int id) {
        Comment comment = commentDAO.findById(id);
        return comment != null;
    }
}
