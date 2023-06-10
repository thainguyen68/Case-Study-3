package com.example.casestudy3.DAO;

import com.example.casestudy3.DAO.connection.MyConnection;
import com.example.casestudy3.model.Posts;
import com.example.casestudy3.model.User;
import com.example.casestudy3.service.UserService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PostsDAO {
    private  final Connection connection;
    private final UserService userService = UserService.getInstance();
    private final String INSERT_INTO = "insert into posts(user_id,content,img_posts) value (?,?,?);";
    private final String SELECT_ALL = "select * from posts;";
    private final String SELECT_BY_ID = "select * from posts where id = ?;";
    private final String UPDATE_BY_ID = "update posts set content = ?,img_posts=? where id = ?;";
    private final String DELETE_BY_ID = "delete from posts where id = ?";
    private final String SELECT_ALL_POSTS1 = "SELECT posts.*, COUNT(likes.id) AS num_likes FROM posts LEFT JOIN likes ON posts.id = likes.posts_id GROUP BY posts.id;";

    private final String DELETE_LIKE = "delete from likes where posts_id = ?";
    private final String DELETE_COMMENT = "delete from comment where posts_id = ?";


    public PostsDAO() {
        connection = MyConnection.getConnection();
    }





    public List<Posts> findAllPosts() {
        List<Posts> posts = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_POSTS1)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int userId = resultSet.getInt("user_id");
                User user = userService.getById(userId);
                String img_url = resultSet.getString("img_posts");
                String content = resultSet.getString("content");
                int likeCount = resultSet.getInt("num_likes");
                Posts post = new Posts(id, user, content, img_url,likeCount);
                posts.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return posts;
    }


    public List<Posts> findAll() {
        List<Posts> posts = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)) {
            convertResultSetToList(posts, preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return posts;
    }
    public Posts findById(int id) {
        Posts posts = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int userId = resultSet.getInt("user_id");
                User user = userService.getById(userId);
                String content = resultSet.getString("content");
                String img_url = resultSet.getString("img_posts");
                posts = new Posts(id, user, content, img_url);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return posts;
    }
    private void convertResultSetToList(List<Posts> productList, PreparedStatement preparedStatement) throws SQLException {
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int userId = resultSet.getInt("user_id");
            User user = userService.getById(userId);
            String content = resultSet.getString("content");
            String img_url = resultSet.getString("img_posts");
            int likeCount = resultSet.getInt("like_count");
            Posts posts = new Posts(id, user, content, img_url,likeCount);
            productList.add(posts);
        }
    }
    public void addPost(Posts posts) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO)) {
            preparedStatement.setInt(1, posts.getUser().getId());
            preparedStatement.setString(2, posts.getContent());
            preparedStatement.setString(3, posts.getImgUrl());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePost(Posts posts) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID)) {
            preparedStatement.setString(1, posts.getContent());
            preparedStatement.setString(2, posts.getImgUrl());
            preparedStatement.setInt(3, posts.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(int id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deleteLikeByPost(int id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_LIKE)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteCommentByPost(int id){
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_COMMENT)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
