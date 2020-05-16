/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author quyen
 */
public class HoaDon {
    private String maHD;
    private String masv;
    private String soTienNop;
    private String hocKi;

    public HoaDon() {
    }

    public HoaDon(String maHD, String masv, String soTienNop, String hocKi) {
        this.maHD = maHD;
        this.masv = masv;
        this.soTienNop = soTienNop;
        this.hocKi = hocKi;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getSoTienNop() {
        return soTienNop;
    }

    public void setSoTienNop(String soTienNop) {
        this.soTienNop = soTienNop;
    }

    public String getHocKi() {
        return hocKi;
    }

    public void setHocKi(String hocKi) {
        this.hocKi = hocKi;
    }
    
}
