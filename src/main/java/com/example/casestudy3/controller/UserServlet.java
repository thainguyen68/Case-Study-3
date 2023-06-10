package com.example.casestudy3.controller;

import com.example.casestudy3.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "UserServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    private final UserService userService = UserService.getInstance();

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

            case "information":
                informationGet(request, response);
                break;
            case "update":
                updateGet(request, response);
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
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/user");
        request.setAttribute("user", userService.displayInfo(request));
        requestDispatcher.forward(request, response);
    }

    private void createGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/Login/register.jsp");
    }

    private void createPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userService.save(request);
        response.sendRedirect("/login");
    }

    private void informationGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        if (userService.checkById(id)){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/User/userInfor.jsp");
            request.setAttribute("user", userService.getById(id));
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect("/404.jsp");
        }
    }

    private void updateGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        if (userService.checkById(id)){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/User/userUpdate.jsp");
            request.setAttribute("user", userService.getById(id));
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect("/404.jsp");
        }
    }

    private void updatePost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        if (userService.checkById(id)) {
            userService.save(request);
            response.sendRedirect("/home?id="+id);
        } else {
            response.sendRedirect("/404.jsp");
        }
    }

    }
