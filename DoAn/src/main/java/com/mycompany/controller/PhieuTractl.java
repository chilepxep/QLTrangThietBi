/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.model.Databases;
import com.mycompany.model.phieutramodel;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
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
public class PhieuTractl {
    private Databases databases;
    
    public PhieuTractl()
    {
        databases = new Databases();
    }
    
    public boolean ThemPhieuTra(phieutramodel pt)
    {
        try(PreparedStatement statement = databases.connection.prepareStatement("Insert INTO PhieuTra (ID_PM,ID_QL,NgayTra,GhiChu) VALUES (?,?,?,?) "))
        {
            statement.setInt(1, pt.getID_PM());
            statement.setInt(2, pt.getID_QL());
            statement.setDate(3, new java.sql.Date(pt.getNgayTra().getTime()));
            statement.setString(4, pt.getGhiChu());
            int rowAffected = statement.executeUpdate();
            return rowAffected >0;
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            return  false;
        }
    }
    
    public boolean SuaPhieuTra(phieutramodel pt)
    {
        try(PreparedStatement statement = databases.connection.prepareStatement("Update PhieuTra SET ID_PM=?, ID_QL=?,NgayTra=?,GhiChu=? WHERE ID=?")) {
            statement.setInt(1,pt.getID_PM());
            statement.setInt(2, pt.getID_QL());
            statement.setDate(3, new java.sql.Date(pt.getNgayTra().getTime()));
            statement.setString(4, pt.getGhiChu());
            statement.setInt(5, pt.getID());
            int rowAffected = statement.executeUpdate();
            return rowAffected >0;
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean XoaPhieuTra(int ID)
    {
        try(PreparedStatement statement = databases.connection.prepareStatement("DELETE From PhieuTra where ID=?")) {
            statement.setInt(1, ID);
            int rowAffected = statement.executeUpdate();
            return rowAffected >0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return  false;
        }
    }
    
    public List<phieutramodel> DanhSachPhieuTra()
    {
        List<phieutramodel> listpt = new ArrayList<>();
        try(Statement statement = databases.connection.createStatement();
                ResultSet resultset = statement.executeQuery("Select * from PhieuTra")) {
                    while(resultset.next())
                    {
                        int ID = resultset.getInt("ID");
                        int ID_PM = resultset.getInt("ID_PM");
                        int ID_QL = resultset.getInt("ID_QL");
                        Date NgayTra = resultset.getDate("NgayTra");
                        String GhiChu = resultset.getString("GhiChu");
                        
                        listpt.add(new phieutramodel(ID,ID_PM,ID_QL,NgayTra,GhiChu));
                    } 
                }catch (SQLException ex)
                            {
                            ex.printStackTrace();
                            };
                return  listpt;
    }
    
    public void InDanhSachPhieuTra(List<phieutramodel> listphieutra) {
        try (FileWriter writer = new FileWriter("D:\\phieutra.txt")) {
            for (phieutramodel pt : listphieutra) {
                writer.write(pt.getID() + "\t");
                writer.write(pt.getID_PM() + "\t");
                writer.write(pt.getID_QL() + "\t");
                writer.write(pt.getNgayTra() + "\t");
                writer.write(pt.getGhiChu() + "\n");
            }
            JOptionPane.showMessageDialog(null, "Dữ liệu đã được in ra file 'phieutra.txt'");
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi in dữ liệu ra file!");
        }
    }
}
