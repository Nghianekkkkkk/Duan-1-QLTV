/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Hi
 */
public class NguoiDung {
    private String MaND;
    private String MatKhau;
    private String HoTen;
    private Boolean VaiTro;

    public NguoiDung() {
    }

    public NguoiDung(String MaND, String MatKhau, String HoTen, Boolean VaiTro) {
        this.MaND = MaND;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.VaiTro = VaiTro;
    }
    
    public String getMaND() {
        return MaND;
    }

    public void setMaND(String MaND) {
        this.MaND = MaND;
    }

    public String getMatKhau() {
        return MatKhau;
    }
    

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Boolean getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(Boolean VaiTro) {
        this.VaiTro = VaiTro;
    }
    
}
