package com.example.casestudy3.controller;

import com.example.casestudy3.service.CommentService;
import com.example.casestudy3.service.PostsService;
import com.example.casestudy3.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PostsServlet", value = "/posts")
public class PostsServlet extends HttpServlet {
    private final PostsService postsService = PostsService.getInstance();
    private final CommentService commentService = CommentService.getInstance();
    private final UserService userService = UserService.getInstance();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createGet(request,response);
                break;
            case "update":
                updateGet(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
                findAdd(request,response);
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
                createPost(request,response);
                break;
            case "update":
                updatePost(request,response);
                break;
        }
    }
    private void findAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("post",postsService.getPost());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/post/home.jsp");
        requestDispatcher.forward(request, response);
    }
    private void createGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("user", userService.getUser());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/post/create.jsp");
        requestDispatcher.forward(request, response);
    }
    private void createPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int userId = Integer.parseInt(request.getParameter("user"));
        if (userService.checkById(userId)) {
            postsService.save(request);
            response.sendRedirect("/posts");
        }
    }

    private void updateGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        if (postsService.checkById(id)) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/post/update.jsp");
            request.setAttribute("post", postsService.getById(id));
            request.setAttribute("user",userService.getUser());
            requestDispatcher.forward(request, response);
        }
    }

    private void updatePost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int postId = Integer.parseInt(request.getParameter("post"));
        int userId = Integer.parseInt(request.getParameter("user"));
        if (postsService.checkById(postId) && userService.checkById(userId)) {
            postsService.save(request);
            response.sendRedirect("/posts");
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        postsService.deleteById(request);
        response.sendRedirect("/posts");
    }
}
