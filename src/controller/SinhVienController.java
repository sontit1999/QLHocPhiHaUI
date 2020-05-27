/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;
import utils.Constant;

/**
 *
 * @author quyen
 */
public class SinhVienController {
    public static String USERNAME = "root";
    public static String PASSWORD = "";
    public static String DATABASEURL = "jdbc:mysql://localhost:3306/thuhocphisv";
    public static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    public static void themSinhVien(SinhVien sv) {

    }

    public static void themLop() {

    }

    public static void getSV(String masv, JTable table) {
        List<SinhVien> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        Connection connection = null;
        Statement statement = null;
        
        try {
            Class.forName(jdbcDriver);
            System.out.println("Đang kết nối csdl");
            connection = DriverManager.getConnection(DATABASEURL,USERNAME,PASSWORD);
            if(connection!=null){
                System.out.println("Connect thành công");
            }else{
               System.out.println("Connect fail");
            }
            // truy vấn
            statement = connection.createStatement();
            String sql = "select * from sinhvien";
            ResultSet result = statement.executeQuery(sql);
            
            
            
            
            /*
            if (masv.equals("")) {
            for (SinhVien i : list) {
            Object[] row = {i.getMasv(), i.getHoten(), i.getNgaysinh(), i.getGioitinh(), i.getQuequan(), i.getSdt(), i.getGmail(), i.getMalop(), i.getCongno()};
            model.addRow(row);
            };
            } else {
            for (SinhVien i : list) {
            if (masv.trim().equalsIgnoreCase(i.getMasv())) {
            Object[] row = {i.getMasv(), i.getHoten(), i.getNgaysinh(), i.getGioitinh(), i.getQuequan(), i.getSdt(), i.getGmail(), i.getMalop(), i.getCongno()};
            model.addRow(row);
            break;
            };
            }
            }
            
            // lấy tất dssv
            /*
            list.add(new SinhVien("SV01", "Son tit 1", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001", "0"));
            list.add(new SinhVien("SV02", "Son tit 2", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001", "0"));
            list.add(new SinhVien("SV03", "Son tit 3", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001", "0"));
            list.add(new SinhVien("SV04", "Son tit 4", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001", "0"));
            list.add(new SinhVien("SV05", "Son tit 5", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001", "0"));
            list.add(new SinhVien("SV06", "Son tit 6", "06/10/1999", "Nam", "Ha Tay", "0335275330", "tvson999@gmail.com", "L001", "0"));
            */
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
}
