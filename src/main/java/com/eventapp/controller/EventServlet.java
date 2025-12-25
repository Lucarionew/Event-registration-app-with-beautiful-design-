package com.eventapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eventapp.dao.UserDao;
import com.eventapp.model.User;

@WebServlet("/EventServlet")
public class EventServlet extends HttpServlet {
    private UserDao userDao = new UserDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<User> users = userDao.getAllUsers();
            request.setAttribute("users", users);
            RequestDispatcher dispatcher = request.getRequestDispatcher("registrations.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error");
        }
    }
}