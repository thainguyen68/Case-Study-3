package com.example.casestudy3.controller;

import com.example.casestudy3.service.CommentService;
import com.example.casestudy3.service.PostsService;
import com.example.casestudy3.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CommentServlet", value = "/comments")
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
                findAdd(request, response);
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
    private void findAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("comment",commentService.getComment());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/comment/home.jsp");
        requestDispatcher.forward(request, response);
    }
    private void createGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("post", commentService.getComment());
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/comment/create.jsp");
        requestDispatcher.forward(request, response);
    }
    private void createPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int postId = Integer.parseInt(request.getParameter("post"));
        if (commentService.checkById(postId)) {
            commentService.save(request);
            response.sendRedirect("/comments");
        }
    }

    private void updateGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        if (commentService.checkById(id)) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/comment/update.jsp");
            request.setAttribute("comment", commentService.getById(id));
            request.setAttribute("user", userService.getUser());
            request.setAttribute("post", postsService.getPost());
            requestDispatcher.forward(request, response);
        }
    }

    private void updatePost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int postId = Integer.parseInt(request.getParameter("post"));
        int userId = Integer.parseInt(request.getParameter("user"));
        int commentId = Integer.parseInt(request.getParameter("comment"));
        if (postsService.checkById(postId) && commentService.checkById(commentId) && userService.checkById(userId)) {
            commentService.save(request);
            response.sendRedirect("/comments");
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        commentService.deleteById(request);
        response.sendRedirect("/comments");
    }
}
