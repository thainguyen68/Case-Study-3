package com.example.casestudy3.DAO;

import com.example.casestudy3.DAO.connection.MyConnection;
import com.example.casestudy3.model.Comment;
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

public class CommentDAO {
    private  final Connection connection;
    private final UserService userService = UserService.getInstance();
    private final PostsService postsService = PostsService.getInstance();

    private final String INSERT_INTO = "insert into comments(user_id,post_id,comment) value (?,?,?);";
    private final String SELECT_ALL = "select * from post;";
    private final String SELECT_BY_ID = "select * from post where id = ?;";
    private final String UPDATE_BY_ID = "update post set comment = ? where id = ?;";
    private final String DELETE_BY_ID = "delete from post where id = ?";

    public CommentDAO() {
        connection = MyConnection.getConnection();
    }
    public List<Comment> findAll() {
        List<Comment> comments = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)) {
            convertResultSetToList(comments, preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }
    public Comment findById(int id) {
        Comment comments = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int userId = resultSet.getInt("userId");
                User user = userService.getById(userId);
                int postId = resultSet.getInt("postId");
                Posts posts = postsService.getById(postId);
                String comment = resultSet.getString("comment");
                comments = new Comment(id,user,posts,comment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }
    private void convertResultSetToList(List<Comment> productList, PreparedStatement preparedStatement) throws SQLException {
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int userId = resultSet.getInt("userId");
            User user = userService.getById(userId);
            int postId = resultSet.getInt("postId");
            Posts posts = postsService.getById(postId);
            String comment = resultSet.getString("comment");
            Comment comments = new Comment(id, user, posts, comment);
            productList.add(comments);
        }
    }
    public void addPost(Comment comment) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO)) {
            preparedStatement.setInt(1, comment.getUser().getId());
            preparedStatement.setInt(2, comment.getPosts().getId());
            preparedStatement.setString(3, comment.getComment());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updatePost(Comment comment) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID)) {
            preparedStatement.setInt(1, comment.getUser().getId());
            preparedStatement.setInt(2, comment.getPosts().getId());
            preparedStatement.setString(3, comment.getComment());
            preparedStatement.setInt(5, comment.getId());
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
}
