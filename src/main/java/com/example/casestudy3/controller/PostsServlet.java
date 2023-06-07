package com.example.casestudy3.controller;

import com.example.casestudy3.model.User;
import com.example.casestudy3.service.CommentService;
import com.example.casestudy3.service.LikesService;
import com.example.casestudy3.service.PostsService;
import com.example.casestudy3.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PostsServlet", value = "/posts")
public class PostsServlet extends HttpServlet {
    private final PostsService postsService = PostsService.getInstance();
    private final UserService userService = UserService.getInstance();
    private final LikesService likesService = LikesService.getInstance();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createGet(request, response);
                break;
            case "update":
                updateGet(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                findAll(request, response);
                break;
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createPost(request, response);
                break;
            case "update":
                updatePost(request, response);
                break;
        }

    }

    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int id = Integer.parseInt(request.getParameter("id"));
       request.setAttribute("user", userService.getById(id));
        request.setAttribute("posts", postsService.getAllPost());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
        requestDispatcher.forward(request, response);
    }

    private void createGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/post/create.jsp");
        requestDispatcher.forward(request, response);
    }

    private void createPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        if (userService.checkById(userId)) {
            postsService.save(request);
            request.setAttribute("posts", postsService.getAllPost());
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect("/404.jsp");
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        postsService.deleteById(request);
        response.sendRedirect("/posts");

    }

    private void updateGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int postId = Integer.parseInt(request.getParameter("postId"));
        if (postsService.checkById(postId)) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/post/update.jsp");
            request.setAttribute("post", postsService.getById(postId));
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect("404.jsp");
        }
    }

    private void updatePost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int postId = Integer.parseInt(request.getParameter("postId"));
        int userId = Integer.parseInt(request.getParameter("userId"));
        if (postsService.checkById(postId) && userService.checkById(userId)) {
            postsService.save(request);
            response.sendRedirect("/posts");
        }

    }
}
