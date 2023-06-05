package com.example.casestudy3.DAO;

import com.example.casestudy3.DAO.connection.MyConnection;
import com.example.casestudy3.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class UserDAO {
    private final Connection connection;
    private final String INSERT_INTO = "insert into user(avatar,username,password,full_name,number_Phone,date_of_birth,favorite,address) value (?,?,?,?,?,?,?,?);";
    private final String UPDATE_PASSWORD_BY_ID = "update user set  password = ?  where id = ?;";
    private final String UPDATE_INFO_BY_ID = "update user set  avatar = ?, username = ?, password = ?, full_name = ? , number_phone = ? ,date_of_birth = ? , favorite = ? , address = ?  where id = ?;";
    private final String SELECT_BY_ID = "select * from user where id = ?;";

    private static UserDAO userDAO;

    public UserDAO() {
        connection = MyConnection.getConnection();
    }

    public static UserDAO getInstance() {
        if (userDAO == null) {
            userDAO = new UserDAO();
        }
        return userDAO;
    }

    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        String query = "SELECT * FROM user;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String avatar = resultSet.getString("avatar");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String fullName = resultSet.getString("full_name");
                String numberPhone = resultSet.getString("number_Phone");
                LocalDate dateOfBirth = resultSet.getDate("date_of_birth").toLocalDate();
                String favorite = resultSet.getString("favorite");
                String address = resultSet.getString("address");
                userList.add(new User(id, avatar, username, password, fullName,numberPhone,dateOfBirth,favorite,address));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }


    public void addUser(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO)) {
            preparedStatement.setString(1, user.getAvatar());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getFullName());
            preparedStatement.setString(5, user.getNumberPhone());
            LocalDate dob = user.getDateOfBirth();
            Date sqlDate = Date.valueOf(dob);
            preparedStatement.setDate(6, sqlDate);
            preparedStatement.setString(7, user.getFavorite());
            preparedStatement.setString(8, user.getAddress());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editPassWord(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PASSWORD_BY_ID)) {
            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setInt(2, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateInfo(User user) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_INFO_BY_ID)) {
            preparedStatement.setString(1, user.getAvatar());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getFullName());
            LocalDate dob = user.getDateOfBirth();
            Date sqlDate = Date.valueOf(dob);
            preparedStatement.setDate(5, sqlDate);
            preparedStatement.setString(6, user.getAddress());
            preparedStatement.setString(7, user.getNumberPhone());
            preparedStatement.setString(8, user.getFavorite());
            preparedStatement.setInt(9, user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User findById(int id) {
        User user = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID)) {
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String avatar = resultSet.getString("avatar");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String fullName = resultSet.getString("full_name");
                String numberPhone = resultSet.getString("number_Phone");
                LocalDate dateOfBirth = resultSet.getDate("date_of_birth").toLocalDate();
                String favorite = resultSet.getString("favorite");
                String address = resultSet.getString("address");
                user =  new User(id, avatar, username, password, fullName,numberPhone,dateOfBirth,favorite,address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

}
