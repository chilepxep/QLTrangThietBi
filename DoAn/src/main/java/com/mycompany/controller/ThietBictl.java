/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import java.sql.PreparedStatement;
import com.mycompany.model.Databases;
import com.mycompany.model.thietbimodel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class ThietBictl {
    private Databases databases;
    
    public ThietBictl(){
        databases = new Databases();
    }
    
      public boolean ThemThietBi(thietbimodel tb){
        try(PreparedStatement statement = databases.connection.prepareStatement("Insert INTO ThietBi (TenThietBi,Loai,SoLuong,TinhTrang,GhiChu,Phong,Anh) VALUES (?,?,?,?,?,?,?)")) {
            statement.setString(1, tb.getTenThietBi());
            statement.setInt(2, tb.getLoai());
            statement.setInt(3, tb.getSoLuong());
            statement.setString(4, tb.getTinhTrang());
            statement.setString(5, tb.getGhiChu());
            statement.setString(6,tb.getPhong());
            String tenAnh = tb.getAnh();
            String duongDanAnh = "/D:/HocTap/LTJava/DoAn/src/main/java/image/" + new File(tenAnh).getName();            
            statement.setString(7, duongDanAnh);
            int rowsAffected = statement.executeUpdate();
            return  rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
      
     public boolean SuaThietBi(thietbimodel tb){
        try (PreparedStatement statement = databases.connection.prepareStatement("Update ThieTBi SET TenThietBi=?, Loai=?, SoLuong=?, TinhTrang=?, GhiChu=?, Phong=?, Anh=? Where ID=?")) {
            statement.setString(1, tb.getTenThietBi());
            statement.setInt(2, tb.getLoai());
            statement.setInt(3, tb.getSoLuong());
            statement.setString(4, tb.getTinhTrang());
            statement.setString(5, tb.getGhiChu());
            statement.setString(6,tb.getPhong());
            String tenAnh = tb.getAnh();
            String duongDanAnh = "/D:/HocTap/LTJava/DoAn/src/main/java/image/" + new File(tenAnh).getName();
            statement.setString(7, duongDanAnh);
            statement.setInt(8, tb.getID());
            int rowAffected = statement.executeUpdate();
            return rowAffected >0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return  false;
        }
    }
     
    public boolean XoaLoaiThietBi(int ID){
        try( PreparedStatement statement = databases.connection.prepareStatement("DELETE From ThietBi where ID=?")) {
            statement.setInt(1,ID);
            int rowAffected = statement.executeUpdate();
            return rowAffected >0;
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
    public List<thietbimodel> DanhSachThietBi() {
        List<thietbimodel> listtb = new ArrayList<>();
        try(Statement statement = databases.connection.createStatement();
                ResultSet resultset = statement.executeQuery("Select * from ThietBi")) {
            while(resultset.next())
            {
                int ID = resultset.getInt("ID");
                String TenThietBi = resultset.getString("TenThietBi");
                int Loai = resultset.getInt("Loai");
                int SoLuong = resultset.getInt("SoLuong");
                String TinhTrang = resultset.getString("TinhTrang");
                String GhiChu = resultset.getString("GhiChu");
                String Phong = resultset.getString("Phong");
                String Anh = resultset.getString("Anh");
                listtb.add(new thietbimodel(ID, TenThietBi,Loai,SoLuong,TinhTrang,GhiChu,Phong,Anh));
            }           
        }catch(SQLException ex){
                    ex.printStackTrace();
            }
            return listtb;
    }
    
    public void InDanhSachThietBi(List<thietbimodel> listtb){
       try (FileWriter writer = new FileWriter("D:\\thietbi.txt")) {
        for (thietbimodel tb : listtb) {
            writer.write(tb.getID() + "\t");
            writer.write(tb.getTenThietBi() + "\t");
            writer.write(tb.getLoai() + "\t");
            writer.write(tb.getSoLuong() + "\t");
            writer.write(tb.getTinhTrang() + "\t");
            writer.write(tb.getGhiChu() + "\t");
            writer.write(tb.getPhong() + "\t");
            writer.write(tb.getAnh() + "\n");
        }
        JOptionPane.showMessageDialog(null, "Dữ liệu đã được in ra file 'thietbi.txt'");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi in dữ liệu ra file!");
    }  
    }
    
    public thietbimodel getThietBiByID(int ID, Databases databases) {
        thietbimodel thietBi = null;

        String query = "SELECT * FROM ThietBi WHERE ID = ?";
        try (PreparedStatement preparedStatement = databases.connection.prepareStatement(query)) {
            preparedStatement.setInt(1, ID);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("ID");
                    String tenThietBi = resultSet.getString("TenThietBi");
                    int loai = resultSet.getInt("Loai");
                    int soLuong = resultSet.getInt("SoLuong");
                    String tinhTrang = resultSet.getString("TinhTrang");
                    String ghiChu = resultSet.getString("GhiChu");
                    String phong = resultSet.getString("Phong");
                    String anh = resultSet.getString("Anh");

                    thietBi = new thietbimodel(id, tenThietBi, loai, soLuong, tinhTrang, ghiChu, phong, anh);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return thietBi;
    }
}
