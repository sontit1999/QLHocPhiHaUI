/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class MonHocController {

    private static MonHocController instance;
    Connect conn = new Connect();
    private int soTien = 330000;

    public int getSoTien() {
        return soTien;
    }

    public static MonHocController getInstance() {
        if (instance == null) {
            instance = new MonHocController();
        }
        return instance;
    }

    public void hienThiMH(JTable tbl, String sql) {
        ResultSet rs = conn.queryData(sql);
        DefaultTableModel model = new DefaultTableModel();
        String header[] = {"Mã lớp học", "Tên môn học", "Số tín", "Số tiền"};
        model.setColumnIdentifiers(header);
        try {
            while (rs.next()) {
                String row[] = new String[5];
                row[0] = String.valueOf(rs.getInt("mamh"));
                row[1] = rs.getString("tenmh");
                row[2] = rs.getString("sotin");
                row[3] = rs.getString("sotien");
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        tbl.setModel(model);
    }
}
