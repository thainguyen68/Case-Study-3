package com.example.casestudy3.DAO;

import com.example.casestudy3.DAO.connection.MyConnection;
import com.example.casestudy3.model.Likes;
import com.example.casestudy3.model.Posts;
import com.example.casestudy3.model.User;
import com.example.casestudy3.service.PostsService;
import com.example.casestudy3.service.UserService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LikesDAO {

    private final Connection connection;
    private final UserService userService = UserService.getInstance();

    private final String SELECT_USER = "select likes.user_id from likes where posts_id = ?";
    private final String SELECT_LIKE_COUNT = "select count(*) as like_count from likes where post_id = ?";
    private final String INSERT_INTO = "insert into likes (user_id , posts_id) value (?,?)";
    private final String DELETE_BY_ID = "delete from likes where id = ?";
    private final String FIND_BY_USER_AND_POST = "select * from likes where user_id = ? and post_id = ?";

    public LikesDAO() {
        connection = MyConnection.getConnection();
    }

    public List<Likes> displayUser() {
        List<Likes> likesList = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                User user = userService.getById(userId);
                Likes likes = new Likes(user);
                likesList.add(likes);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return likesList;
    }

    public int displayCount(int id) {
        int likeCount = 0;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_LIKE_COUNT)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                likeCount = resultSet.getInt("like_count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return likeCount;
    }

    public void createLike(Likes likes) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO)) {
            preparedStatement.setInt(1, likes.getUser().getId());
            preparedStatement.setInt(2, likes.getPosts().getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteLike(int id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Likes findByUserAndPost(Likes likes) {
        Likes like = new Likes();
        try (PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_USER_AND_POST)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int userId = resultSet.getInt("user_id");
                int postId = resultSet.getInt("posts_id");
                User user = userService.getById(userId);
                Posts posts = new Posts();
                like = new Likes(id, user,posts);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return like;
    }
}

