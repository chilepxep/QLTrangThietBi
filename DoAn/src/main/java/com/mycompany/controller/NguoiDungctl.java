/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.model.Databases;
import com.mycompany.model.nguoidungmodel;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class NguoiDungctl {
    private Databases databases;
    public NguoiDungctl()
    {
         databases = new Databases();
    }
    
    public boolean ThemNguoiDung(nguoidungmodel nd){
        try(PreparedStatement statement = databases.connection.prepareStatement("Insert INTO NguoiDung (TenNguoiDung,Email,passND) VALUES (?,?,?)")) {
            statement.setString(1, nd.getTenNguoiDung());
            statement.setString(2, nd.getEmail());
            statement.setString(3, nd.getPass());
            int rowsAffected = statement.executeUpdate();
            return  rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean SuaNguoiDung(nguoidungmodel nd){
        try (PreparedStatement statement = databases.connection.prepareStatement("Update NguoiDung SET TenNguoiDung=?, Email=?, passND=? Where ID=?")) {
            statement.setString(1, nd.getTenNguoiDung());
            statement.setString(2, nd.getEmail());
            statement.setString(3, nd.getPass());
            statement.setInt(4, nd.getID());
            int rowAffected = statement.executeUpdate();
            return rowAffected >0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return  false;
        }
    }
    
    public boolean XoaNguoiDung(int ID){
        try(PreparedStatement statement = databases.connection.prepareStatement("DELETE From NguoiDung where ID=?")) {
            statement.setInt(1, ID);
            int rowAffected  = statement.executeUpdate();
            return rowAffected > 0; 
        } catch (SQLException ex) {
            ex.printStackTrace();
            return  false;
        }
    }
    
     public List<nguoidungmodel> DanhSachNguoiDung()
    {
        List<nguoidungmodel> listnd = new ArrayList<>();
        try(Statement statement = databases.connection.createStatement();
              ResultSet resultset = statement.executeQuery("Select * from NguoiDung")) {
           while(resultset.next())
           {
               int ID = resultset.getInt("ID");
               String TenNguoiDung = resultset.getString("TenNguoiDung");
               String Email = resultset.getString("Email");
               String PassND = resultset.getString("passND");
               
               listnd.add(new nguoidungmodel(ID,TenNguoiDung,Email,PassND));
           }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  
        return  listnd;
    }
     
    public void InDanhSachPhieuMuon(List<nguoidungmodel> listnguoidung) {
    try (FileWriter writer = new FileWriter("D:\\nguoidung.txt")) {
        for (nguoidungmodel nd : listnguoidung) {
            writer.write(nd.getID() + "\t");
            writer.write(nd.getTenNguoiDung()+ "\t");
            writer.write(nd.getEmail()+ "\t");
            writer.write(nd.getPass()+ "\t");
        }
        JOptionPane.showMessageDialog(null, "Dữ liệu đã được in ra file 'nguoidung.txt'");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi in dữ liệu ra file!");
    }
    }
    
    
    public List<nguoidungmodel> TimKiemNguoiDung(String keyword) {
    List<nguoidungmodel> ketQuaTimKiem = new ArrayList<>();
    try (PreparedStatement preparedStatement = databases.connection.prepareStatement(
            "SELECT * FROM NguoiDung WHERE ID = ?")) {
        int id;
        try {
            id = Integer.parseInt(keyword);
        } catch (NumberFormatException e) {
            id = -1; // Nếu không thể chuyển đổi thành số, gán giá trị id = -1 để không tìm theo ID
        }

        // Thiết lập giá trị tham số cho câu truy vấn
        preparedStatement.setInt(1, id);

        // Thực thi câu truy vấn
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String TenNguoiDung = resultSet.getString("TenNguoiDung");
                String Email = resultSet.getString("Email");
                String PassND = resultSet.getString("passND");

                ketQuaTimKiem.add(new nguoidungmodel(ID, TenNguoiDung, Email, PassND));
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return ketQuaTimKiem;
}

    
}
