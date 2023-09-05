/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import java.sql.PreparedStatement;
import com.mycompany.model.Databases;
import com.mycompany.model.loaithietbi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class LoaiThietBictl {
    
    private Databases databases; // Thêm thuộc tính Databases

    public LoaiThietBictl() {
        databases = new Databases(); // Khởi tạo đối tượng Databases để lấy kết nối
    }

    // Các phương thức xử lý dữ liệu khác ở đây...
    
    
    
    public boolean ThemLoaiThietBi(loaithietbi ltb){
        try(PreparedStatement statement = databases.connection.prepareStatement("Insert INTO LoaiThietBi (TenLoai) VALUES (?)")) {
            statement.setString(1, ltb.getTenLoai());
            int rowsAffected = statement.executeUpdate();
            return  rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean SuaLoaiThietBi(loaithietbi ltb){
        try (PreparedStatement statement = databases.connection.prepareStatement("Update LoaiThieTBi SET TenLoai =? Where IDl=?")) {
            statement.setString(1, ltb.getTenLoai());
            statement.setInt(2, ltb.getIDl());
            int rowAffected = statement.executeUpdate();
            return rowAffected >0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return  false;
        }
    }

    public boolean XoaLoaiThietBi(int IDl){
        try( PreparedStatement statement = databases.connection.prepareStatement("DELETE From LoaiThietBi where IDl=?")) {
            statement.setInt(1,IDl);
            int rowAffected = statement.executeUpdate();
            return rowAffected >0;
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
    public List<loaithietbi> DanhSachLoaiThietBi() {
        List<loaithietbi> listltb = new ArrayList<>();
        try(Statement statement = databases.connection.createStatement();
                ResultSet resultset = statement.executeQuery("Select * from LoaiThietBi")) {
            while(resultset.next())
            {
                int IDl = resultset.getInt("IDl");
                String TenLoai = resultset.getString("TenLoai");
                listltb.add(new loaithietbi(IDl, TenLoai));
            }           
        }catch(SQLException ex){
                    ex.printStackTrace();
            }
            return listltb;
    }
    
    
}
