package com.example.casestudy3.service;

import com.example.casestudy3.DAO.UserDAO;
<<<<<<< HEAD
import com.example.casestudy3.model.User;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
=======
import com.example.casestudy3.model.Posts;
import com.example.casestudy3.model.User;

>>>>>>> post
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
<<<<<<< HEAD

    public List<User> displayInfo() {
        return userDAO.displayInfo();
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
        String password =request.getParameter("password");
        userDAO.editPassWord(new User(id,password));
    }

    public void updateInfo(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        String avatar = request.getParameter("avatar");
        String fullName = request.getParameter("fullName");
        String date = request.getParameter("date");
        LocalDate datOfBirth = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        String address = request.getParameter("address");
        String numberPhone = request.getParameter("numberPhone");
        String favorite = request.getParameter("favorite");
        userDAO.updateInfo(new User(avatar,fullName,datOfBirth,numberPhone,favorite,address));
    }


=======
    public User getById(int id) {
        return userDAO.findById(id);
    }
    public List<User> getUser() {
        return userDAO.findAll();
    }
    public boolean checkById(int id) {
        User user = userDAO.findById(id);
        return user != null;
    }
>>>>>>> post
}
