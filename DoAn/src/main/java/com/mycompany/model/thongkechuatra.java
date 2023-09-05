/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author admin
 */
public class thongkechuatra {
    private int ID_TB;
    private String TenThietBi;
    private int ID_ND;
    private int ID_PM;

    public thongkechuatra(int ID_TB, String TenThietBi, int ID_ND, int ID_PM) {
        this.ID_TB = ID_TB;
        this.TenThietBi = TenThietBi;
        this.ID_ND = ID_ND;
        this.ID_PM = ID_PM;
    }

    public int getID_TB() {
        return ID_TB;
    }

    public void setID_TB(int ID_TB) {
        this.ID_TB = ID_TB;
    }

    public String getTenThietBi() {
        return TenThietBi;
    }

    public void setTenThietBi(String TenThietBi) {
        this.TenThietBi = TenThietBi;
    }

    public int getID_ND() {
        return ID_ND;
    }

    public void setID_ND(int ID_ND) {
        this.ID_ND = ID_ND;
    }

    public int getID_PM() {
        return ID_PM;
    }

    public void setID_PM(int ID_PM) {
        this.ID_PM = ID_PM;
    }
    
    
}
