/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.util.Date;

/**
 *
 * @author admin
 */
public class phieumuonmodel {
    private int ID;
    private int ID_ND;
    private int ID_TB;
    private Date NgayMuon;
    private Date NgayHenTra;
    private int SoLuong;

    public phieumuonmodel(int ID, int ID_ND, int ID_TB, Date NgayMuon, Date NgayHenTra, int SoLuong) {
        this.ID = ID;
        this.ID_ND = ID_ND;
        this.ID_TB = ID_TB;
        this.NgayMuon = NgayMuon;
        this.NgayHenTra = NgayHenTra;
        this.SoLuong = SoLuong;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_ND() {
        return ID_ND;
    }

    public void setID_ND(int ID_ND) {
        this.ID_ND = ID_ND;
    }

    public int getID_TB() {
        return ID_TB;
    }

    public void setID_TB(int ID_TB) {
        this.ID_TB = ID_TB;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getNgayHenTra() {
        return NgayHenTra;
    }

    public void setNgayHenTra(Date NgayHenTra) {
        this.NgayHenTra = NgayHenTra;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
}
