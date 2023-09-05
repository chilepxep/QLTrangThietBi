/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author admin
 */
public class thietbimodel {
    private int ID;
    private String TenThietBi;
    private int Loai;
    private int SoLuong;
    private String TinhTrang;
    private String GhiChu;
    private String Phong;
    private String Anh;  

    public thietbimodel(int ID, String TenThietBi, int Loai, int SoLuong, String TinhTrang, String GhiChu, String Phong, String Anh) {
        this.ID = ID;
        this.TenThietBi = TenThietBi;
        this.Loai = Loai;
        this.SoLuong = SoLuong;
        this.TinhTrang = TinhTrang;
        this.GhiChu = GhiChu;
        this.Phong = Phong;
        this.Anh = Anh;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenThietBi() {
        return TenThietBi;
    }

    public void setTenThietBi(String TenThietBi) {
        this.TenThietBi = TenThietBi;
    }

    public int getLoai() {
        return Loai;
    }

    public void setLoai(int Loai) {
        this.Loai = Loai;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getPhong() {
        return Phong;
    }

    public void setPhong(String Phong) {
        this.Phong = Phong;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }  
}
