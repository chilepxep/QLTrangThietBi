/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author admin
 */
public class loaithietbi {
    private int IDl;
    private String TenLoai;

    public loaithietbi(int IDl, String TenLoai) {
        this.IDl = IDl;
        this.TenLoai = TenLoai;
    }

    public int getIDl() {
        return IDl;
    }

    public void setIDl(int IDl) {
        this.IDl = IDl;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
    
    
}
