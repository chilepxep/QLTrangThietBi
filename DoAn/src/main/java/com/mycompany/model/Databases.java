/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class Databases {
    public Connection connection;

    public Databases() {
        // Thực hiện kết nối JDBC đến cơ sở dữ liệu
        String url = "jdbc:mysql://localhost:3306/doanjava";
        String dbUser = "root";
        String dbPassword = "01213400027";

        try {
            connection = DriverManager.getConnection(url, dbUser, dbPassword);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

