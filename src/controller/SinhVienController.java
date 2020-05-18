/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;

/**
 *
 * @author quyen
 */
public class SinhVienController {
    public static void themSinhVien(SinhVien sv){
          
    }
    public static void themLop(){
          
    }
    public static void getSV(String masv,JTable table){
        List<SinhVien> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        if(masv==null || masv.equals("")){             
              list.add(new SinhVien("SV01","Son tit", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001","0"));
              list.add(new SinhVien("SV01","Son tit", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001","0"));
              list.add(new SinhVien("SV01","Son tit", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001","0"));
              list.add(new SinhVien("SV01","Son tit", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001","0"));
              list.add(new SinhVien("SV01","Son tit", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001","0"));
              list.add(new SinhVien("SV01","Son tit", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001","0"));
        }
        for(SinhVien i : list){
            Object[] row = { i.getMasv(), i.getHoten(),i.getNgaysinh(),i.getGioitinh(),i.getQuequan() ,i.getSdt(),i.getGmail(),i.getMalop(),i.getCongno()};       
            model.addRow(row);
        }
        
    }
}

