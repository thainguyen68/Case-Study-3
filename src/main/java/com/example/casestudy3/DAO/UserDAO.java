package com.example.casestudy3.DAO;

import com.example.casestudy3.DAO.connection.MyConnection;
import com.example.casestudy3.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private final Connection connection;
    private final String SELECT_ALL = "select * from user;";
    private final String SELECT_BY_ID = "select * from user where id = ?;";
    private final String INSERT_INTO = "insert into user(username,pasword,numberPhone,date_of_birth) value (?,?,?,?);";
    private final String UPDATE_BY_ID = "update user set  password = ?  where id = ?;";


    public UserDAO() {
        connection = MyConnection.getConnection();
    }

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)) {
            convertResultSetToList(users, preparedStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
    public User findById(int id) {
        User user = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String avatar = resultSet.getString("avatar");
                String username = resultSet.getNString("username");
                String password = resultSet.getString("password");
                String fullName = resultSet.getString("fullname");
                String numberPhone = resultSet.getString("numberPhone");
                Date dateOfBirth = resultSet.getDate("dateofbirth");
                String favorite = resultSet.getString("favorite");
                String address = resultSet.getString("address");
                user = new User(avatar,username,password,fullName,numberPhone,dateOfBirth,favorite,address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    private void convertResultSetToList(List<User> productList, PreparedStatement preparedStatement) throws SQLException {
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String avatar = resultSet.getString("avatar");
            String username = resultSet.getNString("username");
            String password = resultSet.getString("password");
            String fullName = resultSet.getString("fullname");
            String numberPhone = resultSet.getString("numberPhone");
            Date dateOfBirth = resultSet.getDate("dateofbirth");
            String favorite = resultSet.getString("favorite");
            String address = resultSet.getString("address");
            User user = new User(avatar,username,password,fullName,numberPhone,dateOfBirth,favorite,address);
            productList.add(user);
        }
    }

    public void addUser(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getNumberPhone());
            preparedStatement.setDate(4, user.getDateOfBirth());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID)) {
            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setInt(2, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
