package com.eventapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.eventapp.model.User;
import com.eventapp.util.DBConnection;

public class UserDao {

    public void saveUser(User user) throws SQLException {
        String sql = "INSERT INTO users (name, email, phone, event) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPhone());
            pstmt.setString(4, user.getEvent());
            pstmt.executeUpdate();
        }
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                User user = new User();
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                user.setEvent(rs.getString("event"));
                users.add(user);
            }
        }
        return users;
    }
}