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
    private final String INSERT_INTO = "insert into user(avatar,username,pasword,full_name,number_Phone,date_of_birth,favorite,address) value (?,?,?,?,?,?,?,?);";
    private final String UPDATE_PASSWORD_BY_ID = "update user set  password = ?  where id = ?;";
    private final String UPDATE_INFO_BY_ID = "update user set  avatar = ?, full_name = ? ,date_of_birth = ?, address = ? , number_phone = ? , favorite = ?  where id = ?;";
    private final String SELECT_INFO = "select user.avatar , user.full_name ,user.date_of_birth,user.address , user.number_phone , user.favorite from user where id = ?";
    private final String SELECT_BY_ID = "select * from user where id = ?;";

    public UserDAO() {
        connection = MyConnection.getConnection();
    }

    public List<User> displayInfo() {
        List<User> userList = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_INFO)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String avatar = resultSet.getString("avatar");
                String fullName = resultSet.getString("full_name");
                LocalDate dateOfBirth = resultSet.getDate("date_of_birth").toLocalDate();
                String address = resultSet.getString("address");
                String numberPhone = resultSet.getString("numberPhone");
                String favorite = resultSet.getString("favorite");
                userList.add(new User(avatar, fullName, dateOfBirth, numberPhone, favorite, address));
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
            preparedStatement.setString(2, user.getFullName());
            LocalDate dob = user.getDateOfBirth();
            Date sqlDate = Date.valueOf(dob);
            preparedStatement.setDate(3, sqlDate);
            preparedStatement.setString(4, user.getAddress());
            preparedStatement.setString(5, user.getNumberPhone());
            preparedStatement.setString(6, user.getFavorite());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
