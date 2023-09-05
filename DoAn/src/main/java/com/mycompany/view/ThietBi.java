/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.controller.ThietBictl;
import com.mycompany.model.thietbimodel;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author admin
 */
public class ThietBi extends javax.swing.JFrame {
private ThietBictl thietBictl;
private int selectedRowIndex = -1;
    /**
     * Creates new form ThietBi
     */
    public ThietBi() {
        initComponents();
        thietBictl = new ThietBictl();
        HienThiThietBi();
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
        jPanel3 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        Form_TenThietBi = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        Form_Loai = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        Form_SoLuong = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        Form_TinhTrang = new javax.swing.JTextField();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        Form_GhiChu = new javax.swing.JTextField();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        Form_Phong = new javax.swing.JTextField();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        Form_Anh = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        javax.swing.JButton btn_ChinhSua = new javax.swing.JButton();
        javax.swing.JButton btn_Xoa = new javax.swing.JButton();
        javax.swing.JButton btn_Them2 = new javax.swing.JButton();
        javax.swing.JButton btn_TroLai = new javax.swing.JButton();
        javax.swing.JButton btn_In1 = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        Table_ThietBi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hệ thống quản lý trang thiết bị");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiết bị", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên thiết bị:");

        Form_TenThietBi.setText("nhap ten...");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Loại:");

        Form_Loai.setText("nhap loai...");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Số lượng:");

        Form_SoLuong.setText("nhap so luong...");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tình trạng:");

        Form_TinhTrang.setText("nhap tinh trang...");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ghi chú:");

        Form_GhiChu.setText("nhap ghi chu...");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phòng:");

        Form_Phong.setText("nhap phong...");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ảnh:");

        Form_Anh.setText("nhap anh...");
        Form_Anh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Form_AnhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Form_TenThietBi)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Form_Loai)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Form_SoLuong)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Form_TinhTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Form_GhiChu)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Form_Phong)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Form_Anh))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Form_TenThietBi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Form_Loai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Form_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Form_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Form_GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Form_Phong, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Form_Anh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        btn_ChinhSua.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_ChinhSua.setIcon(new javax.swing.ImageIcon("D:\\HocTap\\LTJava\\DoAn\\src\\main\\java\\image\\edit.png")); // NOI18N
        btn_ChinhSua.setText("Chỉnh sửa");
        btn_ChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChinhSuaActionPerformed(evt);
            }
        });

        btn_Xoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Xoa.setIcon(new javax.swing.ImageIcon("D:\\HocTap\\LTJava\\DoAn\\src\\main\\java\\image\\delete.png")); // NOI18N
        btn_Xoa.setText("Xoá");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Them2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Them2.setIcon(new javax.swing.ImageIcon("D:\\HocTap\\LTJava\\DoAn\\src\\main\\java\\image\\add.png")); // NOI18N
        btn_Them2.setText("Thêm");
        btn_Them2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Them2ActionPerformed(evt);
            }
        });

        btn_TroLai.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_TroLai.setIcon(new javax.swing.ImageIcon("D:\\HocTap\\LTJava\\DoAn\\src\\main\\java\\image\\return.png")); // NOI18N
        btn_TroLai.setText("Trở lại");
        btn_TroLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TroLaiActionPerformed(evt);
            }
        });

        btn_In1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_In1.setIcon(new javax.swing.ImageIcon("D:\\HocTap\\LTJava\\DoAn\\src\\main\\java\\image\\printer.png")); // NOI18N
        btn_In1.setText("In");
        btn_In1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_In1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Them2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_In1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(btn_TroLai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_Them2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_In1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_TroLai, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        Table_ThietBi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TenThietBi", "Loai", "SoLuong", "TinhTrang", "GhiChu", "Phong", "Anh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table_ThietBi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void Form_AnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Form_AnhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Form_AnhActionPerformed

    
    public class ImageTableCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        if (value instanceof String) {
            String imagePath = (String) value;
            if (!imagePath.isEmpty()) {
                ImageIcon icon = new ImageIcon(imagePath);
                JLabel label = new JLabel(icon);
                return label;
            }
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
    
    
    // Hiển thị danh sách thiết bị lên bảng
    private void HienThiThietBi() {
        ThietBictl controller = new ThietBictl();
        List<thietbimodel> danhSachThietBi = controller.DanhSachThietBi();

        DefaultTableModel model = (DefaultTableModel) Table_ThietBi.getModel();
        model.setRowCount(0); // Xóa hết dữ liệu cũ trên bảng

        // Gán ImageTableCellRenderer cho cột Anh
        TableColumn imageColumn = Table_ThietBi.getColumnModel().getColumn(7); 
        imageColumn.setCellRenderer(new ImageTableCellRenderer());
    
        for (thietbimodel tb : danhSachThietBi) {
           Object[] row = {
                tb.getID(),
                tb.getTenThietBi(),
                tb.getLoai(),
                tb.getSoLuong(),
                tb.getTinhTrang(),
                tb.getGhiChu(),
                tb.getPhong(),
                tb.getAnh()
            };
            model.addRow(row);
        }
        
        Table_ThietBi.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            selectedRowIndex = Table_ThietBi.getSelectedRow();
            if (selectedRowIndex >= 0) {
                String tenThietBi = Table_ThietBi.getValueAt(selectedRowIndex, 1).toString();
                String loai = Table_ThietBi.getValueAt(selectedRowIndex, 2).toString();
                String soLuong = Table_ThietBi.getValueAt(selectedRowIndex, 3).toString();
                String tinhTrang = Table_ThietBi.getValueAt(selectedRowIndex, 4).toString();
                String ghiChu = Table_ThietBi.getValueAt(selectedRowIndex, 5).toString();
                String phong = Table_ThietBi.getValueAt(selectedRowIndex, 6).toString();
                String anh = Table_ThietBi.getValueAt(selectedRowIndex, 7).toString();

                Form_TenThietBi.setText(tenThietBi);
                Form_Loai.setText(loai);
                Form_SoLuong.setText(soLuong);
                Form_TinhTrang.setText(tinhTrang);
                Form_GhiChu.setText(ghiChu);
                Form_Phong.setText(phong);
                Form_Anh.setText(anh);
            }
        }
    });
        
    }
    
    private void btn_Them2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Them2ActionPerformed
        // TODO add your handling code here:
        String tenThietBi = Form_TenThietBi.getText();
        int loai = Integer.parseInt(Form_Loai.getText());
        int soLuong = Integer.parseInt(Form_SoLuong.getText());
        String tinhTrang = Form_TinhTrang.getText();
        String ghiChu = Form_GhiChu.getText();
        String phong = Form_Phong.getText();
        String anh = Form_Anh.getText();
        
       thietbimodel newThietBi = new thietbimodel(0,tenThietBi, loai, soLuong, tinhTrang, ghiChu, phong, anh);
       ThietBictl controller = new ThietBictl();
       boolean result = controller.ThemThietBi(newThietBi);
       if(result) {
           JOptionPane.showMessageDialog(this, "Thêm thành công!");
           HienThiThietBi();
       }
       else {
           JOptionPane.showMessageDialog(this, "Thêm thất bại!");
       }
        
    }//GEN-LAST:event_btn_Them2ActionPerformed

    private void btn_ChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChinhSuaActionPerformed
        // TODO add your handling code here:
         if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một thiết bị để chỉnh sửa!");
        return;
    }

    int id = Integer.parseInt(Table_ThietBi.getValueAt(selectedRowIndex, 0).toString());
    String tenThietBi = Form_TenThietBi.getText();
    int loai = Integer.parseInt(Form_Loai.getText());
    int soLuong = Integer.parseInt(Form_SoLuong.getText());
    String tinhTrang = Form_TinhTrang.getText();
    String ghiChu = Form_GhiChu.getText();
    String phong = Form_Phong.getText();
    String anh = Form_Anh.getText();

    thietbimodel tb = new thietbimodel(id, tenThietBi, loai, soLuong, tinhTrang, ghiChu, phong, anh);
    ThietBictl controller = new ThietBictl();
    boolean result = controller.SuaThietBi(tb);
    if (result) {
        JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công!");
        HienThiThietBi();
    } else {
        JOptionPane.showMessageDialog(this, "Chỉnh sửa thất bại!");
    }
    }//GEN-LAST:event_btn_ChinhSuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        // TODO add your handling code here:
        int row = Table_ThietBi.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn thiết bị để xoá!");
            return;
        }
        int ID = (int) Table_ThietBi.getValueAt(row, 0);
        ThietBictl controller = new ThietBictl();
        boolean result = controller.XoaLoaiThietBi(ID);
        if(result)
        {
            JOptionPane.showMessageDialog(this, "Xoá thiết bị thành công!");
            HienThiThietBi();
        }
        else{
            JOptionPane.showMessageDialog(this, "Xoá thất bại");
        }
        
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_In1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_In1ActionPerformed
        // TODO add your handling code here:
        List<thietbimodel>listtb = thietBictl.DanhSachThietBi();
        thietBictl.InDanhSachThietBi(listtb);
    }//GEN-LAST:event_btn_In1ActionPerformed

    private void btn_TroLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TroLaiActionPerformed
        // TODO add your handling code here:
        // new Home().setVisible(true);
        //this.dispose();
        this.setVisible(false);

        // Hiển thị cửa sổ Home
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btn_TroLaiActionPerformed

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
            java.util.logging.Logger.getLogger(ThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThietBi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThietBi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Form_Anh;
    private javax.swing.JTextField Form_GhiChu;
    private javax.swing.JTextField Form_Loai;
    private javax.swing.JTextField Form_Phong;
    private javax.swing.JTextField Form_SoLuong;
    private javax.swing.JTextField Form_TenThietBi;
    private javax.swing.JTextField Form_TinhTrang;
    private javax.swing.JTable Table_ThietBi;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
