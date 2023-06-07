package com.example.casestudy3.service;

import com.example.casestudy3.DAO.LikesDAO;
import com.example.casestudy3.DAO.PostsDAO;
import com.example.casestudy3.DAO.UserDAO;
import com.example.casestudy3.model.Likes;
import com.example.casestudy3.model.Posts;
import com.example.casestudy3.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class LikesService {
    private static UserService userService;
    private static PostsService postsService;
    private static LikesService likesService;
    private final LikesDAO likesDAO;
    private UserDAO userDAO;

    private PostsDAO postsDAO;

    private LikesService() {
        likesDAO = new LikesDAO();
        userService = UserService.getInstance();
        postsService = PostsService.getInstance();
        postsDAO = new PostsDAO();
        userDAO = new UserDAO();
    }

    public static LikesService getInstance() {
        if (likesService == null) {
            likesService = new LikesService();
        }
        return likesService;
    }

    public List<Likes> displayUser() {
        return likesDAO.displayUser();
    }

    public int displayLikeCount(int postsId) {
        return likesDAO.displayCount(postsId);
    }

    public void likes(HttpServletRequest request) {
        int userId =Integer.parseInt(request.getParameter("userId"));
        int postId =Integer.parseInt(request.getParameter("postId"));
//        Likes newLike = new Likes(userId,postId);
        Likes likes = likesDAO.findByUserAndPost(userId,postId);
        if (likes != null) {
            int idDelete = userId;
            likesDAO.deleteLike(idDelete);
        } else {
            User user = userService.getById(userId);
            Posts posts = postsService.getById(postId);
            likesDAO.createLike(new Likes(user,posts));
        }
    }
    public boolean checkById(int id) {
        Likes likes = likesDAO.findById(id);
        return likes != null;
    }
}
