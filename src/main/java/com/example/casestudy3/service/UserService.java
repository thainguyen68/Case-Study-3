package com.example.casestudy3.service;

import com.example.casestudy3.DAO.UserDAO;
import com.example.casestudy3.model.User;

import java.util.List;

public class UserService {
    private final UserDAO userDAO;
    private static UserService userService;

    private UserService() {
        userDAO = new UserDAO();
    }

    public static UserService getInstance() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }
    public User getById(int id) {
        return userDAO.findById(id);
    }
}
