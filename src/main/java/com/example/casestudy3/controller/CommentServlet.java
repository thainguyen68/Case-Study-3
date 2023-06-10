package com.example.casestudy3.controller;

import com.example.casestudy3.service.CommentService;
import com.example.casestudy3.service.PostsService;
import com.example.casestudy3.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CommentServlet", urlPatterns = "/comments")
public class CommentServlet extends HttpServlet {
    private final CommentService commentService = CommentService.getInstance();
    private final UserService userService = UserService.getInstance();
    private final PostsService postsService = PostsService.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                delete(request, response);
                break;
            case "update" :
                updateGet(request,response);
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
            case "update":
                updatePost(request, response);
                break;
            case "create":
                createPost(request, response);
                break;
        }
    }
    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("comments", commentService.getComment());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
        requestDispatcher.forward(request, response);
    }
    private void createPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        int postId = Integer.parseInt(request.getParameter("postId"));
        if (userService.checkById(userId)) {
            commentService.save(request);
            request.setAttribute("comments", commentService.getByIdPost(postId));
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home?id="+userId);
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect("/404.jsp");
        }
    }
    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        response.sendRedirect("/posts?id=" + id);
        commentService.deleteById(request);
    }
    private void updatePost (HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        int commentId = Integer.parseInt(request.getParameter("commentId"));
        int userId = Integer.parseInt(request.getParameter("userId"));
        if (commentService.checkById(commentId) && userService.checkById(userId)) {
            commentService.save(request);
            response.sendRedirect("/posts");
        }

    }
    private void updateGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int commentId = Integer.parseInt(request.getParameter("commentId"));
        if (commentService.checkById(commentId)) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/home.jsp");
            request.setAttribute("comments", commentService.getById(commentId));
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect("404.jsp");
        }
    }
}