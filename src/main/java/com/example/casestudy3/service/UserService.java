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

    public List<User> displayInfo() {
        return userDAO.displayInfo();
    }

    public User getById(int id) {
        return userDAO.displayById(id);
    }

    public void addUser(HttpServletRequest request) {
        String avatar = request.getParameter("avatar");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String fullName = request.getParameter("fullName");
        String numberPhone = request.getParameter("numberPhone");
        LocalDate date = LocalDate.parse(request.getParameter("date"));
        String address = request.getParameter("address");
        String favorite = request.getParameter("favorite");
        userDAO.addUser(new User(avatar, username, password, fullName, numberPhone, date, favorite, address));
    }

    public void updatePassword(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String password = request.getParameter("password");
        userDAO.editPassWord(new User(id, password));
    }

    public void updateInfo(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String avatar = request.getParameter("avatar");
        String fullName = request.getParameter("fullName");
        LocalDate date = LocalDate.parse(request.getParameter("date"));
        String address = request.getParameter("address");
        String numberPhone = request.getParameter("numberPhone");
        String favorite = request.getParameter("favorite");
        userDAO.updateInfo(new User(avatar, fullName, date, numberPhone, favorite, address));
    }


}
