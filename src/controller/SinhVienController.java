/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;

/**
 *
 * @author quyen
 */
public class SinhVienController {

    Connect connect = new Connect();

    public SinhVienController() {
    }

    public static void themSinhVien(SinhVien sv) {

    }

    public int deleteSV(String masv) {
        String sqlDelete = "delete from sinhvien where masv = " + masv;
        return connect.UpdateData(sqlDelete);
    }

    public void getSV(String masv, JTable table) {
        masv = masv.trim();
        List<SinhVien> list = new ArrayList<>();
        list.clear();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        ResultSet resultset = connect.queryData("select * from sinhvien");
        try {
            while (resultset.next()) {
                SinhVien sv = new SinhVien(resultset.getString("masv"), resultset.getString("hoten"), resultset.getString("ngaysinh"), resultset.getString("gioitinh"), resultset.getString("quequan"), resultset.getString("sdt"), resultset.getString("gmail"), resultset.getString("malop"), resultset.getInt("congno") + "");
                list.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (masv.equals("")) {
            for (SinhVien i : list) {

                Object[] row = {i.getMasv(), i.getHoten(), i.getNgaysinh(), i.getGioitinh(), i.getQuequan(), i.getSdt(), i.getGmail(), i.getMalop(), i.getCongno()};
                model.addRow(row);

            }
        } else {
            boolean have = false;
            for (SinhVien i : list) {
                if (masv.equalsIgnoreCase(i.getMasv())) {
                    Object[] row = {i.getMasv(), i.getHoten(), i.getNgaysinh(), i.getGioitinh(), i.getQuequan(), i.getSdt(), i.getGmail(), i.getMalop(), i.getCongno()};
                    model.addRow(row);
                    have = true;
                    break;
                }

            }
            if (!have) {
                JOptionPane.showMessageDialog(table, " Không tìm thấy  sinh viên có mã " + masv);
            }
        }
    }
}
