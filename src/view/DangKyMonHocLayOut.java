/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MonHocController;
import database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DangKyMonHocLayOut extends javax.swing.JFrame {

    /**
     * Creates new form DangKyMonHocLayOut
     */
    Connect conn = new Connect();

    public DangKyMonHocLayOut() {
        initComponents();
        loadDataFromDB();
    }

    String malop, tenmon, sotin, sotien, ghichu;

    void getTxt() {
        malop = mamh.getText();
        tenmon = tenmh.getText();
        sotin = sotinchi.getText();
        sotien = sotienmon.getText();
        ghichu = gc.getText();
    }

    String getDateNow() {
        Date today = new Date();
        DateFormat da = new SimpleDateFormat("dd/MM/yyyy");
        String dat = da.format(today);
        return dat;
    }

    void loadDataFromDB() {
        MonHocController.getInstance().hienThiMH(jtbData, "select * from monhoc");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDangKy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbmalop = new javax.swing.JLabel();
        lbten = new javax.swing.JLabel();
        lbsotin = new javax.swing.JLabel();
        lbtengv = new javax.swing.JLabel();
        lbdiadiem = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnHuy = new javax.swing.JButton();
        mamh = new javax.swing.JLabel();
        tenmh = new javax.swing.JLabel();
        sotienmon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sotinchi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gc = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 110, 34));

        jtbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 186, 585, 165));

        jLabel1.setText("Mã môn học :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setText("Tên môn : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("Số tín :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setText("Bảng chọn lớp học :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 161, -1, -1));
        getContentPane().add(lbmalop, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 20, -1, -1));
        getContentPane().add(lbten, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 45, -1, -1));
        getContentPane().add(lbsotin, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 129, -1, -1));
        getContentPane().add(lbtengv, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 75, -1, -1));
        getContentPane().add(lbdiadiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 104, -1, -1));

        jToggleButton1.setText("Thoát");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 110, 30));

        btnHuy.setText("Huỷ môn học");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        getContentPane().add(btnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 110, 30));

        mamh.setText("-------");
        getContentPane().add(mamh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        tenmh.setText("------");
        getContentPane().add(tenmh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        sotienmon.setText("------");
        getContentPane().add(sotienmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel4.setText("Số tiền :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        sotinchi.setText("------");
        getContentPane().add(sotinchi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel6.setText("Ghi chú");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        gc.setColumns(20);
        gc.setRows(5);
        jScrollPane2.setViewportView(gc);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDataMouseClicked
        int row = jtbData.getSelectedRow();
        String[] r = new String[5];
        for (int i = 0; i < 4; i++) {
            r[i] = jtbData.getModel().getValueAt(row, i).toString();
        }
        mamh.setText(r[0]);
        tenmh.setText(r[1]);
        sotinchi.setText(r[2]);
        sotienmon.setText(r[3]);
    }//GEN-LAST:event_jtbDataMouseClicked

    DangNhapLayOut dn = new DangNhapLayOut();

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        getTxt();
        int check1 = 0;
        ResultSet rs = conn.queryData("select * from dangky where mamh = " + malop + " and masv = " + dn.tk);
        int giatien = 0;
        try {
            if (!rs.next()) {
                String sql = "insert into dangky values (" + dn.tk + ", " + malop + ", '" + getDateNow() + "','" + ghichu + "')";
                check1 = conn.UpdateData(sql);
                giatien = Integer.valueOf(sotien) * Integer.valueOf(sotin);
                System.out.println(sotien + "===" + sotin);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(Level.SEVERE, null, ex);
        }
        int check2 = conn.UpdateData("update sinhvien set congno = congno - " + giatien + " where masv  = " + dn.tk);

        if (check1 != 0 && check2 != 0) {
            JOptionPane.showMessageDialog(rootPane, "Đăng ký môn học thành công");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Không thể đăng ký môn học");
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        getTxt();
        String sql = "delete from dangky where masv = " + dn.tk + " and mamh =  " + malop;
        System.out.println(sql);
        int check1 = conn.UpdateData(sql);
        ResultSet rs = conn.queryData("select * from monhoc where mamh = " + malop);
        int giatien = 0;
        try {
            if (rs.next()) {
                giatien = rs.getInt("sotien") * rs.getInt("sotin");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(Level.SEVERE, null, ex);
        }
        int check2 = conn.UpdateData("update sinhvien set congno = congno + " + giatien);
        if (check1 != 0 && check2 != 0) {
            JOptionPane.showMessageDialog(rootPane, "Huỷ môn học thành công");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Không thể huỷ môn học");
            conn.UpdateData("update sinhvien set congno = congno - " + giatien);
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyMonHocLayOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKyMonHocLayOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnHuy;
    private javax.swing.JTextArea gc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable jtbData;
    private javax.swing.JLabel lbdiadiem;
    private javax.swing.JLabel lbmalop;
    private javax.swing.JLabel lbsotin;
    private javax.swing.JLabel lbten;
    private javax.swing.JLabel lbtengv;
    private javax.swing.JLabel mamh;
    private javax.swing.JLabel sotienmon;
    private javax.swing.JLabel sotinchi;
    private javax.swing.JLabel tenmh;
    // End of variables declaration//GEN-END:variables
}