package com.example.casestudy3.controller;

import com.example.casestudy3.service.PostsService;
import com.example.casestudy3.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    private final UserService userService = UserService.getInstance();
    private final PostsService postsService = PostsService.getInstance();



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
        request.setAttribute("posts", postsService.getAllPost());
        request.setAttribute("user", userService.getById(id));
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
