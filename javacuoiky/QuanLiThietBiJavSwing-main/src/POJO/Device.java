/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author QuanLDM
 */
public class Device {
    private String ma32;
    private String ten32;
    private String loai32;
    private String tinhtrang32;
    private String trangthai32;

    public Device() {
    }

    public Device(String ma32, String ten32, String loai32, String tinhtrang32, String trangthai32) {
        this.ma32 = ma32;
        this.ten32 = ten32;
        this.loai32 = loai32;
        this.tinhtrang32 = tinhtrang32;
        this.trangthai32 = trangthai32;
    }

    public String getMa32() {
        return ma32;
    }

    public void setMa32(String ma32) {
        this.ma32 = ma32;
    }

    public String getTen32() {
        return ten32;
    }

    public void setTen32(String ten32) {
        this.ten32 = ten32;
    }

    public String getLoai32() {
        return loai32;
    }

    public void setLoai32(String loai32) {
        this.loai32 = loai32;
    }

    public String getTinhtrang32() {
        return tinhtrang32;
    }

    public void setTinhtrang32(String tinhtrang32) {
        this.tinhtrang32 = tinhtrang32;
    }

    public String getTrangthai32() {
        return trangthai32;
    }

    public void setTrangthai32(String trangthai32) {
        this.trangthai32 = trangthai32;
    }

    
   
    
}
