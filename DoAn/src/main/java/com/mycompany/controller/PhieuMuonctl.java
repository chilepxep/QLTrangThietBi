/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;
import com.mycompany.controller.ThietBictl;
import com.mycompany.controller.PhieuMuonctl;
import com.mycompany.model.Databases;
import com.mycompany.model.phieumuonmodel;
import com.mycompany.model.thietbimodel;
import com.mycompany.model.thongkechuatra;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class PhieuMuonctl {
    private Databases databses;
    private ThietBictl tbctl;

    
    public PhieuMuonctl ()
    {
        databses = new Databases();
        tbctl = new ThietBictl();

    }
    
    public boolean ThemPhieuMuon(phieumuonmodel pm){
        try(PreparedStatement statement = databses.connection.prepareStatement("Insert INTO PhieuMuon (ID_ND,ID_TB,NgayMuon,NgayHenTra,SoLuong) VALUES (?,?,?,?,?)")) 
        {
           statement.setInt(1, pm.getID_ND());
           statement.setInt(2, pm.getID_TB());
           statement.setDate(3, new java.sql.Date(pm.getNgayMuon().getTime()));
           statement.setDate(4, new java.sql.Date(pm.getNgayHenTra().getTime()));
           statement.setInt(5, pm.getSoLuong());
           
           thietbimodel thietBi = tbctl.getThietBiByID(pm.getID_TB(), databses);
            if (thietBi != null && thietBi.getSoLuong() > 0) {
                int soLuongConLai = thietBi.getSoLuong() - pm.getSoLuong();
                thietBi.setSoLuong(soLuongConLai);
                tbctl.SuaThietBi(thietBi);
            }
            else {
                JOptionPane.showMessageDialog(null, "Hết thiết bị");
            }
           
           int rowAffected  = statement.executeUpdate();
           return  rowAffected >0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return  false;
        }
    }
    
    
    public boolean  SuaPhieuMuon(phieumuonmodel pm){
        try(PreparedStatement statement = databses.connection.prepareStatement("Update PhieuMuon SET ID_ND=?, ID_TB=?, NgayMuon=?, NgayHenTra=?, SoLuong=? where ID=?")) {
            statement.setInt(1, pm.getID_ND());
            statement.setInt(2, pm.getID_TB());
            statement.setDate(3, new java.sql.Date(pm.getNgayMuon().getTime()));
            statement.setDate(4, new java.sql.Date(pm.getNgayHenTra().getTime()));
            statement.setInt(5, pm.getSoLuong());
             statement.setInt(6, pm.getID()); 
             
             thietbimodel thietBi = tbctl.getThietBiByID(pm.getID_TB(), databses);
            if (thietBi != null && thietBi.getSoLuong() > 0) {
                int soLuongConLai = thietBi.getSoLuong() - pm.getSoLuong();
                thietBi.setSoLuong(soLuongConLai);
                tbctl.SuaThietBi(thietBi);
            }
            else {
                JOptionPane.showMessageDialog(null, "Hết thiết bị");
            }
             
            int rowAffected  = statement.executeUpdate();
            return rowAffected > 0;
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean XoaPhieuMuon(int ID){
       try (PreparedStatement statement = databses.connection.prepareStatement("SELECT * FROM PhieuMuon WHERE ID = ?")) {
        statement.setInt(1, ID);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                int thietBiID = resultSet.getInt("ID_TB"); // Lấy ID của thiết bị liên quan
                int soLuong = resultSet.getInt("SoLuong"); // Lấy số lượng được mượn

                // Xóa phiếu mượn
                try (PreparedStatement deleteStatement = databses.connection.prepareStatement("DELETE FROM PhieuMuon WHERE ID = ?")) {
                    deleteStatement.setInt(1, ID);
                    int rowAffected = deleteStatement.executeUpdate();
                    if (rowAffected > 0) {
                        // Cập nhật số lượng thiết bị
                        thietbimodel thietBi = tbctl.getThietBiByID(thietBiID, databses);
                        if (thietBi != null) {
                            thietBi.setSoLuong(thietBi.getSoLuong() + soLuong); // Tăng số lượng
                            tbctl.SuaThietBi(thietBi); // Cập nhật thông tin thiết bị
                            return true; // Xóa phiếu và cập nhật số lượng thành công
                        } else {
                            // Không tìm thấy thiết bị
                            JOptionPane.showMessageDialog(null, "không tìm thấy thiết bị");
                            return false;
                        }
                    } else {
                        // Xóa phiếu mượn thất bại
                        JOptionPane.showMessageDialog(null, "xoá thất bại!");
                        return false;
                    }
                }
            } else {
                // Không tìm thấy phiếu mượn
                JOptionPane.showMessageDialog(null, "không tìm thấy phiếu mượn!");
                return false;
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
    }
    
    public List<phieumuonmodel> DanhSachPhieuMuon()
    {
        List<phieumuonmodel> listpm = new ArrayList<>();
        try(Statement statement = databses.connection.createStatement();
              ResultSet resultset = statement.executeQuery("Select * from PhieuMuon")) {
           while(resultset.next())
           {
               int ID = resultset.getInt("ID");
               int ID_ND = resultset.getInt("ID_ND");
               int ID_TB = resultset.getInt("ID_TB");
               Date NgayMuon = resultset.getDate("NgayMuon");
               Date NgayHenTra = resultset.getDate("NgayHenTra");
               int SoLuong = resultset.getInt("SoLuong");
               
               listpm.add(new phieumuonmodel(ID,ID_ND,ID_TB,NgayMuon,NgayHenTra,SoLuong));
           }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  
        return  listpm;
    }
    
    public void InDanhSachPhieuMuon(List<phieumuonmodel> listPhieuMuon) {
    try (FileWriter writer = new FileWriter("D:\\phieumuon.txt")) {
        for (phieumuonmodel pm : listPhieuMuon) {
            writer.write(pm.getID() + "\t");
            writer.write(pm.getID_ND() + "\t");
            writer.write(pm.getID_TB() + "\t");
            writer.write(pm.getNgayMuon() + "\t");
            writer.write(pm.getNgayHenTra() + "\t");
            writer.write(pm.getSoLuong() + "\n");
        }
        JOptionPane.showMessageDialog(null, "Dữ liệu đã được in ra file 'phieumuon.txt'");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi in dữ liệu ra file!");
    }
    }
    
    

    public List<thongkechuatra> DanhSachPhieuMuonChuaTra() {
    List<thongkechuatra> danhSachThongKe = new ArrayList<>();
    try (Statement statement = databses.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PhieuMuon")) {
        while (resultSet.next()) {
            int phieuMuonID = resultSet.getInt("ID");
            
            // Kiểm tra trong bảng PhieuTra xem phiếu mượn đã được trả chưa
            boolean daTra = KiemTraPhieuTra(phieuMuonID);
            
            if (!daTra) {
                int ID_TB = resultSet.getInt("ID_TB");
                thietbimodel thietBi = tbctl.getThietBiByID(ID_TB, databses);
                if (thietBi != null) {
                    int ID = resultSet.getInt("ID");
                    int ID_ND = resultSet.getInt("ID_ND");
                    thongkechuatra thongKe = new thongkechuatra(ID_TB, thietBi.getTenThietBi(), ID_ND, ID);
                    danhSachThongKe.add(thongKe);
                }
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return danhSachThongKe;
}


public boolean KiemTraPhieuTra(int phieuMuonID) {
    try (PreparedStatement statement = databses.connection.prepareStatement("SELECT * FROM PhieuTra WHERE ID_PM = ?")) {
        statement.setInt(1, phieuMuonID);
        try (ResultSet resultSet = statement.executeQuery()) {
            return resultSet.next(); // Nếu có kết quả trong bảng PhieuTra, phiếu đã được trả
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
}

 
}
