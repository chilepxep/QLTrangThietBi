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
public class phieutramodel {
    private int ID;
    private int ID_PM;
    private int ID_QL;
    private Date NgayTra;
    private String GhiChu;

    public phieutramodel(int ID, int ID_PM, int ID_QL, Date NgayTra, String GhiChu) {
        this.ID = ID;
        this.ID_PM = ID_PM;
        this.ID_QL = ID_QL;
        this.NgayTra = NgayTra;
        this.GhiChu = GhiChu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_PM() {
        return ID_PM;
    }

    public void setID_PM(int ID_PM) {
        this.ID_PM = ID_PM;
    }

    public int getID_QL() {
        return ID_QL;
    }

    public void setID_QL(int ID_QL) {
        this.ID_QL = ID_QL;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
    
}
