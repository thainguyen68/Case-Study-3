package com.example.casestudy3.controller;

import com.example.casestudy3.model.User;
import com.example.casestudy3.service.CommentService;
import com.example.casestudy3.service.PostsService;
import com.example.casestudy3.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Login", urlPatterns = "/login")
public class Login extends HttpServlet {
    private final UserService userService = UserService.getInstance();
    private final PostsService postsService = PostsService.getInstance();
    private final CommentService commentService =CommentService.getInstance();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("Login/login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "login":
                loginPost(request, response);
                break;
            case "logOut":
                loginOutPost(request, response);
                break;
        }
    }
    private void loginPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("userName");
        String password = request.getParameter("passWord");
        List<User> userList = userService.findAllI();
        boolean check = false;
        for (User u : userList) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                check = true;
                request.setAttribute("user", u);
                request.setAttribute("posts", postsService.getAllPost());
                request.setAttribute("comments", commentService.getComment());
                HttpSession session = request.getSession();
                session.setAttribute("userLogging",u);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
                requestDispatcher.forward(request, response);
            }
        }if (!check){
                response.sendRedirect("/4041.jsp");
        }
    }
    private void loginOutPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("/login");
    }

}
