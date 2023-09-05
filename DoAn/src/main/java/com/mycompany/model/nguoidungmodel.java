/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author admin
 */
public class nguoidungmodel {
    private int ID;
    private String TenNguoiDung;
    private String Email;
    private String Pass;

    public nguoidungmodel(int ID, String TenNguoiDung, String Email, String Pass) {
        this.ID = ID;
        this.TenNguoiDung = TenNguoiDung;
        this.Email = Email;
        this.Pass = Pass;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenNguoiDung() {
        return TenNguoiDung;
    }

    public void setTenNguoiDung(String TenNguoiDung) {
        this.TenNguoiDung = TenNguoiDung;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    
}
