/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author admin
 */
public class quanlymodel {
    private int ID;
    private String TenQuanLy;
    private String PassQL;
    private String ChucVu;

    public quanlymodel(int ID, String TenQuanLy, String PassQL, String ChucVu) {
        this.ID = ID;
        this.TenQuanLy = TenQuanLy;
        this.PassQL = PassQL;
        this.ChucVu = ChucVu;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenQuanLy() {
        return TenQuanLy;
    }

    public void setTenQuanLy(String TenQuanLy) {
        this.TenQuanLy = TenQuanLy;
    }

    public String getPassQL() {
        return PassQL;
    }

    public void setPassQL(String PassQL) {
        this.PassQL = PassQL;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }
    
    
}
