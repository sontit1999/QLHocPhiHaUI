/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;

/**
 *
 * @author Son tit
 */
public class HomeLayout extends javax.swing.JFrame {

    NhapHocLayout jPannelNhaphoc;
    DsSinhVienLayout jPanelDSsv;
    ThongBaoNopTienLayout jpannelThongBao;
    XuatBaoCaoLayout jpannelXuatBaoCao;
    NopHocPhiLayout jpannelNopHocPhi;

    /**
     * Creates new form HomeLayout
     */
    public HomeLayout() {
        initComponents();
        setSize(1240, 450);
        // init jpanel and add to container

        jPanelDSsv = new DsSinhVienLayout();
        jPanelContainer.add(jPanelDSsv);
        jPanelDSsv.setVisible(true);
        jPanelDSsv.addComponentListener(new ComponentAdapter() {
            public void componentShown(ComponentEvent e) {
                jPanelDSsv.updateDSSV();
            }

            public void componentHidden(ComponentEvent e) {

            }
        });
        jPannelNhaphoc = new NhapHocLayout();
        jPanelContainer.add(jPannelNhaphoc);
        jPannelNhaphoc.setVisible(false);
        jpannelThongBao = new ThongBaoNopTienLayout();
        jPanelContainer.add(jpannelThongBao);
        jpannelThongBao.setVisible(false);
        jpannelXuatBaoCao = new XuatBaoCaoLayout();
        jPanelContainer.add(jpannelXuatBaoCao);
        jpannelXuatBaoCao.setVisible(false);
        jpannelNopHocPhi = new NopHocPhiLayout();
        jPanelContainer.add(jpannelNopHocPhi);
        jpannelNopHocPhi.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(HomeLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeLayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeLayout().setVisible(true);
            }
        });
    }

    public void showJpanel(JPanel panel) {
        jPannelNhaphoc.setVisible(false);
        jPanelDSsv.setVisible(false);
        jpannelThongBao.setVisible(false);
        jpannelXuatBaoCao.setVisible(false);
        jpannelNopHocPhi.setVisible(false);
        panel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanelMenu = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        btnNophocphi = new javax.swing.JButton();
        btnXuatBaoCao = new javax.swing.JButton();
        btnNhapHoc = new javax.swing.JButton();
        btnDSSV = new javax.swing.JButton();
        btnThongbao = new javax.swing.JButton();
        jPanelContainer = new javax.swing.JPanel();
        txtHeader = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý học phí sinh viên HaUI");

        jPanelMenu.setBackground(new java.awt.Color(0, 153, 153));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(250, 420));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo_haui.png"))); // NOI18N

        btnNophocphi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/thanhtoan.png"))); // NOI18N
        btnNophocphi.setText("Đóng học phí");
        btnNophocphi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNophocphi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNophocphiActionPerformed(evt);
            }
        });

        btnXuatBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/baocao.png"))); // NOI18N
        btnXuatBaoCao.setText("Xuất Báo Cáo");
        btnXuatBaoCao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnXuatBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatBaoCaoActionPerformed(evt);
            }
        });

        btnNhapHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sv.png"))); // NOI18N
        btnNhapHoc.setText("Nhập Học");
        btnNhapHoc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhapHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHocActionPerformed(evt);
            }
        });

        btnDSSV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDSSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ds.png"))); // NOI18N
        btnDSSV.setText("DS SinhVien");
        btnDSSV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDSSV.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDSSVActionPerformed(evt);
            }
        });

        btnThongbao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Untitled-1.png"))); // NOI18N
        btnThongbao.setText("Thông báo Nộp Tiền");
        btnThongbao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongbao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongbaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNhapHoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDSSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNophocphi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongbao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXuatBaoCao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDSSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNhapHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(btnNophocphi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongbao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXuatBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanelContainer.setBackground(new java.awt.Color(204, 204, 204));
        jPanelContainer.setPreferredSize(new java.awt.Dimension(629, 450));

        javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
        jPanelContainer.setLayout(jPanelContainerLayout);
        jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        txtHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtHeader.setText("DANH SÁCH SINH VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenu, 240, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(txtHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHocActionPerformed
        // TODO add your handling code here:
        txtHeader.setText("NHẬP HỌC SINH VIÊN");
        showJpanel(jPannelNhaphoc);
    }//GEN-LAST:event_btnNhapHocActionPerformed

    private void btnNophocphiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNophocphiActionPerformed
        showJpanel(jpannelNopHocPhi);

    }//GEN-LAST:event_btnNophocphiActionPerformed

    private void btnXuatBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatBaoCaoActionPerformed
        // TODO add your handling code here:
        txtHeader.setText("XUẤT BÁO CÁO");
        showJpanel(jpannelXuatBaoCao);
    }//GEN-LAST:event_btnXuatBaoCaoActionPerformed

    private void btnDSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDSSVActionPerformed
        // TODO add your handling code here:
        txtHeader.setText("DANH SÁCH SINH VIÊN");
        showJpanel(jPanelDSsv);

    }//GEN-LAST:event_btnDSSVActionPerformed

    private void btnThongbaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongbaoActionPerformed
        // TODO add your handling code here:
        txtHeader.setText("THÔNG BÁO NỘP TIỀN HỌC PHÍ");
        showJpanel(jpannelThongBao);
    }//GEN-LAST:event_btnThongbaoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDSSV;
    private javax.swing.JButton btnNhapHoc;
    private javax.swing.JButton btnNophocphi;
    private javax.swing.JButton btnThongbao;
    private javax.swing.JButton btnXuatBaoCao;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel txtHeader;
    // End of variables declaration//GEN-END:variables

}
