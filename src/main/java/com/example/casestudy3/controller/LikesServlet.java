package com.example.casestudy3.controller;

import com.example.casestudy3.service.LikesService;
import com.example.casestudy3.service.PostsService;
import com.example.casestudy3.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LikesServlet", value = "/likes")
public class LikesServlet extends HttpServlet {

    private final PostsService postsService = PostsService.getInstance();
    private final UserService userService = UserService.getInstance();
    private final LikesService likesService = LikesService.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "like":
                like(request, response);
                break;
        }
    }

    private void like(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        likesService.likes(request);
        int id = Integer.parseInt(request.getParameter("id"));
        response.sendRedirect("/posts?id=" + id);
    }
}

