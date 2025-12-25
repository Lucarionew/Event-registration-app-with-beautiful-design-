package com.eventapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eventapp.dao.UserDao;
import com.eventapp.model.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private UserDao userDao = new UserDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String event = request.getParameter("event");

        User user = new User(name, email, phone, event);

        try {
            userDao.saveUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("register.jsp?success=true");
    }
}