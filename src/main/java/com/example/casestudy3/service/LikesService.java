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
    private static LikesService likesService;
    private final LikesDAO likesDAO;
    private UserDAO userDAO;

    private PostsDAO postsDAO;

    private LikesService() {
        likesDAO = new LikesDAO();
        userService = UserService.getInstance();
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

    public void likes(HttpServletRequest request, int UserId, int PostId) {
        String id = request.getParameter("id");
        User user = userDAO.displayById(UserId);
        Posts post = postsDAO.DisplayPostById(PostId);
        if (id != null) {
            int idDelete = Integer.parseInt(id);
            likesDAO.deleteLike(idDelete);
        } else {
            likesDAO.createLike(new Likes(user.getId(),post.getId()));
        }
    }

    public void deleteLikes(int id){

    }
}
