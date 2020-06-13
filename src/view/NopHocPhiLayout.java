/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import controller.*;
import java.text.NumberFormat;

/**
 *
 * @author Admin
 */
public class NopHocPhiLayout extends javax.swing.JPanel {

    /**
     * Creates new form NopHocPhiLayout
     */
    Connect conn = new Connect();
    HoaDonController hdcon = new HoaDonController();

    public NopHocPhiLayout() {
        setSize(1000, 1000);
        initComponents();
        hdcon.hienThiHD(jTable1, "select * from hoadon");
    }

    String getDateNow() {
        Date today = new Date();
        DateFormat da = new SimpleDateFormat("dd/MM/yyyy");
        String dat = da.format(today);
        return dat;
    }

    //return the new mahoadon to into datebase
    int createKeyMahd() {
        ResultSet rs = conn.queryData("select max(mahd) from hoadon");
        try {
            if (rs.next()) {
                int key = rs.getInt("max(mahd)");
                return key + 5;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NopHocPhiLayout.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNop = new javax.swing.JButton();
        txtMsv = new javax.swing.JTextField();
        txtSoTien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKiHoc = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();
        tbl_hoadon = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mã sinh viên : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Số tiền đóng : ");

        btnNop.setBackground(new java.awt.Color(255, 255, 51));
        btnNop.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNop.setText("Nộp");
        btnNop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNopActionPerformed(evt);
            }
        });

        txtMsv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtSoTien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Kì học :");

        txtKiHoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_timkiem.setBackground(new java.awt.Color(255, 255, 51));
        btn_timkiem.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_timkiem.setText("Tìm kiếm");
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_hoadon.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(txtMsv, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(txtKiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnNop, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tbl_hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(txtMsv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(txtKiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNop)
                    .addComponent(btn_timkiem))
                .addGap(28, 28, 28)
                .addComponent(tbl_hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNopActionPerformed
        String masv = txtMsv.getText();
        String sotien = txtSoTien.getText();
        String kihoc = txtKiHoc.getText();
        ResultSet rs = conn.queryData("select * from sinhvien where masv = " + masv);
        if (masv.equals("") || sotien.equals("") || kihoc.equals("")) {
            JOptionPane.showMessageDialog(txtSoTien, "Không được để trống");
        } else {
            try {
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(txtSoTien, "Mã sinh viên không tồn tại");
                } else {
                    int Mahd = createKeyMahd();
                    System.out.println(Mahd + "----");
                    String ngay = getDateNow();
                    String sql = "insert into hoadon values(" + Mahd + "," + masv + "," + sotien + ",'" + ngay + "'," + kihoc + ")";
                    System.out.println(sql);
                    int check = conn.UpdateData(sql);
                    if (check == 1) {
                        JOptionPane.showMessageDialog(txtSoTien, "Thêm hoá đơn thành công");
                    } else {
                        JOptionPane.showMessageDialog(txtSoTien, "Không thể thêm hoá đơn");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(NopHocPhiLayout.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        hdcon.hienThiHD(jTable1, "select * from hoadon");
    }//GEN-LAST:event_btnNopActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        String masv = txtMsv.getText();
        if (masv.equals("")) {
            JOptionPane.showMessageDialog(txtSoTien, "Không được để trống mã sinh viên !");
        }
        hdcon.hienThiHD(jTable1, "select * from hoadon where masv = " + masv);
    }//GEN-LAST:event_btn_timkiemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNop;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tbl_hoadon;
    private javax.swing.JTextField txtKiHoc;
    private javax.swing.JTextField txtMsv;
    private javax.swing.JTextField txtSoTien;
    // End of variables declaration//GEN-END:variables
}
