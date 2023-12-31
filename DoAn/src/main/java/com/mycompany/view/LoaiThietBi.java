/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;
import com.mycompany.controller.LoaiThietBictl;
import com.mycompany.model.loaithietbi;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class LoaiThietBi extends javax.swing.JFrame {
private int selectedRowIndex = -1;
    /**
     * Creates new form LoaiThietBi
     */
    public LoaiThietBi() {
        initComponents();
        hienThiDanhSachLoaiThietBi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        form_tenloai = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JButton btn_ThemLoai = new javax.swing.JButton();
        javax.swing.JButton btn_ChinhSua = new javax.swing.JButton();
        javax.swing.JButton btn_Xoa = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        Table_LoaiThietBi = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_trolai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hệ thống quản lý trang thiết bị");

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loai Thiet Bi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ten Loai");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        form_tenloai.setText("nhap ten....");
        form_tenloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form_tenloaiActionPerformed(evt);
            }
        });

        btn_ThemLoai.setIcon(new javax.swing.ImageIcon("D:\\HocTap\\LTJava\\DoAn\\src\\main\\java\\image\\add.png")); // NOI18N
        btn_ThemLoai.setText("Thêm");
        btn_ThemLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemLoaiActionPerformed(evt);
            }
        });

        btn_ChinhSua.setIcon(new javax.swing.ImageIcon("D:\\HocTap\\LTJava\\DoAn\\src\\main\\java\\image\\edit.png")); // NOI18N
        btn_ChinhSua.setText("Chỉnh sửa");
        btn_ChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChinhSuaActionPerformed(evt);
            }
        });

        btn_Xoa.setIcon(new javax.swing.ImageIcon("D:\\HocTap\\LTJava\\DoAn\\src\\main\\java\\image\\delete.png")); // NOI18N
        btn_Xoa.setText("Xoá");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(form_tenloai)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btn_ThemLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ChinhSua, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(form_tenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ThemLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btn_ChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Table_LoaiThietBi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Table_LoaiThietBi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Ten Loai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table_LoaiThietBi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Table_LoaiThietBi);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        btn_trolai.setIcon(new javax.swing.ImageIcon("D:\\HocTap\\LTJava\\DoAn\\src\\main\\java\\image\\return.png")); // NOI18N
        btn_trolai.setText("Trở lại");
        btn_trolai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trolaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btn_trolai, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_trolai, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemLoaiActionPerformed
        // TODO add your handling code here:
        String tenLoai = form_tenloai.getText();
        loaithietbi ltb = new loaithietbi(0, tenLoai);

        LoaiThietBictl controller = new LoaiThietBictl();
        boolean result = controller.ThemLoaiThietBi(ltb);

        if (result) {
            JOptionPane.showMessageDialog(this, "Thêm loại thiết bị thành công!");
            hienThiDanhSachLoaiThietBi(); // Cập nhật lại bảng sau khi thêm
        } else {
            JOptionPane.showMessageDialog(this, "Thêm loại thiết bị thất bại!");
        }
    }//GEN-LAST:event_btn_ThemLoaiActionPerformed

    private void btn_ChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChinhSuaActionPerformed
        // TODO add your handling code here:
         if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một loại thiết bị để chỉnh sửa!");
        return;
    }

    int IDl = (int) Table_LoaiThietBi.getValueAt(selectedRowIndex, 0);
    String TenLoai = form_tenloai.getText();
    loaithietbi ltb = new loaithietbi(IDl, TenLoai);
    LoaiThietBictl controller = new LoaiThietBictl();
    boolean result = controller.SuaLoaiThietBi(ltb);
    if (result) {
        JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công!");
        hienThiDanhSachLoaiThietBi();
    } else {
        JOptionPane.showMessageDialog(this, "Chỉnh sửa thất bại!");
    }
    }//GEN-LAST:event_btn_ChinhSuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        // TODO add your handling code here:
        int row = Table_LoaiThietBi.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(this, "Vui long chon loai thiet bi de xoa!");
            return;
        }
        
        int IDl = (int) Table_LoaiThietBi.getValueAt(row, 0);
        LoaiThietBictl controller = new LoaiThietBictl();
        boolean result = controller.XoaLoaiThietBi(IDl);
        if(result)
        {
            JOptionPane.showMessageDialog(this, "Xoa thanh cong");
            hienThiDanhSachLoaiThietBi();
        } else {
            JOptionPane.showMessageDialog(this, "Xoa That Bai");
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void form_tenloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_form_tenloaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_form_tenloaiActionPerformed

    private void btn_trolaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trolaiActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

        // Hiển thị cửa sổ Home
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btn_trolaiActionPerformed

    // Phương thức hiển thị danh sách LoaiThietBi lên bảng
    private void hienThiDanhSachLoaiThietBi() {
        LoaiThietBictl controller = new LoaiThietBictl();
        List<loaithietbi> danhSachLoaiThietBi = controller.DanhSachLoaiThietBi();

        DefaultTableModel model = (DefaultTableModel) Table_LoaiThietBi.getModel();
        model.setRowCount(0); // Xóa hết dữ liệu cũ trên bảng

        for (loaithietbi ltb : danhSachLoaiThietBi) {
            Object[] rowData = {ltb.getIDl(), ltb.getTenLoai()};
            model.addRow(rowData);
        }
        
        Table_LoaiThietBi.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            selectedRowIndex = Table_LoaiThietBi.getSelectedRow();
            if (selectedRowIndex >= 0) {
                String tenThietBi = Table_LoaiThietBi.getValueAt(selectedRowIndex, 1).toString();

                form_tenloai.setText(tenThietBi);
            }
        }
    });
        
    }
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
            java.util.logging.Logger.getLogger(LoaiThietBictl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoaiThietBictl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoaiThietBictl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoaiThietBictl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoaiThietBi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_LoaiThietBi;
    private javax.swing.JButton btn_trolai;
    private javax.swing.JTextField form_tenloai;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
