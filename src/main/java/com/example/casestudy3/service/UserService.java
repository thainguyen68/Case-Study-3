package com.example.casestudy3.service;

import com.example.casestudy3.DAO.UserDAO;
import com.example.casestudy3.model.User;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    public User displayInfo(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        return userDAO.findById(id);
    }

    public List<User> findAllI(){
        return userDAO.findAll();
    }

    public void save(HttpServletRequest request) {
        String id = request.getParameter("id");
        String avatar = request.getParameter("avatar");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String fullName = request.getParameter("fullName");
        String numberPhone = request.getParameter("numberPhone");
        LocalDate date = LocalDate.parse(request.getParameter("dateOfBirth"));
        String favorite = request.getParameter("favorite");
        String address = request.getParameter("address");
        if (id != null) {
            int idUpdate = Integer.parseInt(id);
            userDAO.updateInfo(new User(idUpdate,avatar, username, password, fullName, numberPhone, date, favorite, address));
        } else {
           userDAO.addUser(new User(avatar, username, password, fullName, numberPhone, date, favorite, address));
        }
    }

    public void updatePassword(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String password =request.getParameter("password");
        userDAO.editPassWord(new User(id,password));
    }


    public User getById(int id) {
        return userDAO.findById(id);
    }
    public boolean checkById(int id) {
        User user = userDAO.findById(id);
        return user != null;
    }
}
