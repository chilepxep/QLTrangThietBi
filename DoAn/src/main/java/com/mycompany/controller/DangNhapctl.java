/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.model.Databases;
import com.mycompany.model.quanlymodel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class DangNhapctl {
   private Databases databases;

    public DangNhapctl() {
        databases = new Databases();
    }

    public quanlymodel dangNhap(String Ten, String Pass) {
        quanlymodel quanLy = null;
        String query = "SELECT * FROM QuanLy WHERE TenQuanLy = ? AND PassQL = ?";
        try (PreparedStatement preparedStatement = databases.connection.prepareStatement(query)) {
            preparedStatement.setString(1, Ten);
            preparedStatement.setString(2, Pass);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int ID = resultSet.getInt("ID");
                    String ChucVu = resultSet.getString("ChucVu");
                    quanLy = new quanlymodel(ID, Ten, Pass, ChucVu);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return quanLy;
    } 
}
