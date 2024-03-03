/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DAO.DAObook;
import controller.bookcontroler;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Book;

/**
 *
 * @author Admin
 */
public class bookView extends javax.swing.JFrame {

    /**
     * Creates new form bookView
     */
    public ArrayList<Book> book;
    public bookView() {
        myinitComponents();
    }
    public bookcontroler bK=new bookcontroler(this);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditBook = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tIdJ = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tNameJ = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tAuthorJ = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tProducerJ = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tCatagoryJ = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tNumJ = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tPriceJ = new javax.swing.JTextField();
        btnCapNhatJ = new javax.swing.JButton();
        btnHuyJ = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBook = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLammoi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnTheoTenSach = new javax.swing.JRadioButton();
        tTimKiem = new javax.swing.JTextField();
        tNhaSX = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tTacGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tNum = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tMaSach = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tTenSach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tGia = new javax.swing.JTextField();
        btnTheoMS = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        tTheLoai = new javax.swing.JTextField();

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Thông tin sách ");

        jLabel11.setText("Mã sách");

        tIdJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tIdJActionPerformed(evt);
            }
        });

        jLabel12.setText("Tên sách");

        tNameJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNameJActionPerformed(evt);
            }
        });

        jLabel13.setText("Tác giả");

        tAuthorJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAuthorJActionPerformed(evt);
            }
        });

        jLabel14.setText("Nhà SX");

        tProducerJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tProducerJActionPerformed(evt);
            }
        });

        jLabel15.setText("Thể loại");

        tCatagoryJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCatagoryJActionPerformed(evt);
            }
        });

        jLabel16.setText("Số lượng");

        tNumJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNumJActionPerformed(evt);
            }
        });

        jLabel17.setText("Giá");

        tPriceJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPriceJActionPerformed(evt);
            }
        });

        btnCapNhatJ.setText("Cập Nhật");

        btnHuyJ.setText("Hủy");

        javax.swing.GroupLayout EditBookLayout = new javax.swing.GroupLayout(EditBook.getContentPane());
        EditBook.getContentPane().setLayout(EditBookLayout);
        EditBookLayout.setHorizontalGroup(
            EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditBookLayout.createSequentialGroup()
                .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EditBookLayout.createSequentialGroup()
                            .addGap(165, 165, 165)
                            .addComponent(jLabel10))
                        .addGroup(EditBookLayout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(tIdJ, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EditBookLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(EditBookLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tAuthorJ, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(EditBookLayout.createSequentialGroup()
                                    .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tNameJ, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(EditBookLayout.createSequentialGroup()
                                    .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14))
                                    .addGap(28, 28, 28)
                                    .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tProducerJ, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tCatagoryJ, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(EditBookLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tPriceJ, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(EditBookLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(tNumJ, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(EditBookLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnCapNhatJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuyJ)
                .addGap(97, 97, 97))
        );
        EditBookLayout.setVerticalGroup(
            EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tIdJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNameJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAuthorJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tProducerJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCatagoryJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNumJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPriceJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(EditBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhatJ)
                    .addComponent(btnHuyJ))
                .addGap(27, 27, 27))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên  sách", "NSX","Thể loại" ,"Tác giả","Số lượng","Giá"

            }
        ));
        jScrollPane1.setViewportView(tbBook);

        btnThem.setText("Thêm");

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");

        btnLammoi.setText("Làm mới");

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnTheoTenSach.setText("Tìm kiếm theo tên");

        btnTim.setText("Tìm");

        jLabel6.setText("Nhà sản xuất");

        jLabel7.setText("Tác giả");

        jLabel8.setText("Số lượng");

        jLabel9.setText("Giá");

        jLabel1.setText("Tìm kiếm");

        jLabel2.setText("Thông tin sinh viên");

        jLabel3.setText("Mã sách");

        jLabel4.setText("Tên sách");

        btnTheoMS.setText("Tìm kiếm theo mã sách");

        jLabel5.setText("Thể loại");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTheoMS, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnTim)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTheoTenSach)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4))))
            .addComponent(jSeparator3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tNhaSX, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tTheLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tNum, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tGia, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnThem)
                .addGap(37, 37, 37)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(62, 62, 62)
                .addComponent(btnLammoi)
                .addGap(38, 38, 38)
                .addComponent(btnThoat)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnTheoMS))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTim))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTheoTenSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tNhaSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(tTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(tNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnLammoi)
                    .addComponent(btnThoat))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tIdJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tIdJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tIdJActionPerformed

    private void tNameJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNameJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNameJActionPerformed

    private void tAuthorJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAuthorJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAuthorJActionPerformed

    private void tProducerJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tProducerJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tProducerJActionPerformed

    private void tCatagoryJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCatagoryJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCatagoryJActionPerformed

    private void tNumJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNumJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNumJActionPerformed

    private void tPriceJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPriceJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPriceJActionPerformed

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
            java.util.logging.Logger.getLogger(bookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookView().setVisible(true);
            }
        });
    }

    public JButton getBtnLammoi() {
        return btnLammoi;
    }

    public void setBtnLammoi(JButton btnLammoi) {
        this.btnLammoi = btnLammoi;
    }

    public JButton getBtnSua() {
        return btnSua;
    }

    public void setBtnSua(JButton btnSua) {
        this.btnSua = btnSua;
    }

    public JButton getBtnThem() {
        return btnThem;
    }

    public void setBtnThem(JButton btnThem) {
        this.btnThem = btnThem;
    }

    public JRadioButton getBtnTheoMsv() {
        return btnTheoMS;
    }

    public void setBtnTheoMsv(JRadioButton btnTheoMsv) {
        this.btnTheoMS = btnTheoMsv;
    }

    public JRadioButton getBtnTheoTen() {
        return btnTheoTenSach;
    }

    public void setBtnTheoTen(JRadioButton btnTheoTen) {
        this.btnTheoTenSach = btnTheoTen;
    }

    public JButton getBtnThoat() {
        return btnThoat;
    }

    public void setBtnThoat(JButton btnThoat) {
        this.btnThoat = btnThoat;
    }

    public JButton getBtnTim() {
        return btnTim;
    }

    public void setBtnTim(JButton btnTim) {
        this.btnTim = btnTim;
    }

    public JButton getBtnXoa() {
        return btnXoa;
    }

    public void setBtnXoa(JButton btnXoa) {
        this.btnXoa = btnXoa;
    }

    public JTextField gettClass() {
        return tNum;
    }

    public void settClass(JTextField tClass) {
        this.tNum = tClass;
    }

    public JTextField gettGia() {
        return tGia;
    }

    public void settGia(JTextField tGia) {
        this.tGia = tGia;
    }

    public JTextField gettMaSach() {
        return tMaSach;
    }

    public void settMaSach(JTextField tMaSach) {
        this.tMaSach = tMaSach;
    }

    public JButton getBtnHuyJ() {
        return btnHuyJ;
    }

    public JRadioButton getBtnTheoMS() {
        return btnTheoMS;
    }

    public JTextField gettNhaSX() {
        return tNhaSX;
    }

    public void settNhaSX(JTextField tNhaSX) {
        this.tNhaSX = tNhaSX;
    }

    public JTextField gettTacGia() {
        return tTacGia;
    }

    public void settTacGia(JTextField tTacGia) {
        this.tTacGia = tTacGia;
    }

    public JTextField gettTenSach() {
        return tTenSach;
    }

    public void settTenSach(JTextField tTenSach) {
        this.tTenSach = tTenSach;
    }

    public JTextField gettTimKiem() {
        return tTimKiem;
    }

    public void settTimKiem(JTextField tTimKiem) {
        this.tTimKiem = tTimKiem;
    }

    public JTable getTbBook() {
        return tbBook;
    }

    public void setTbBook(JTable tbBook) {
        this.tbBook = tbBook;
    }

    public JTextField gettNum() {
        return tNum;
    }

    public JTextField gettTheLoai() {
        return tTheLoai;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog EditBook;
    private javax.swing.JButton btnCapNhatJ;
    private javax.swing.JButton btnHuyJ;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JRadioButton btnTheoMS;
    private javax.swing.JRadioButton btnTheoTenSach;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField tAuthorJ;
    private javax.swing.JTextField tCatagoryJ;
    private javax.swing.JTextField tGia;
    private javax.swing.JTextField tIdJ;
    private javax.swing.JTextField tMaSach;
    private javax.swing.JTextField tNameJ;
    private javax.swing.JTextField tNhaSX;
    private javax.swing.JTextField tNum;
    private javax.swing.JTextField tNumJ;
    private javax.swing.JTextField tPriceJ;
    private javax.swing.JTextField tProducerJ;
    private javax.swing.JTextField tTacGia;
    private javax.swing.JTextField tTenSach;
    private javax.swing.JTextField tTheLoai;
    private javax.swing.JTextField tTimKiem;
    private javax.swing.JTable tbBook;
    // End of variables declaration//GEN-END:variables
    public javax.swing.ButtonGroup BGSearch;
    
    private void myinitComponents() {
        initComponents();
        btnLammoi.addActionListener(bK);
        btnThem.addActionListener(bK);
        btnSua.addActionListener(bK);
        btnTim.addActionListener(bK);
        btnXoa.addActionListener(bK);
        book=new ArrayList<Book>();
        BGSearch=new ButtonGroup();
        BGSearch.add(btnTheoMS);
        BGSearch.add(btnTheoTenSach);
        EditBook.setBounds(100, 100,400,400);
        capnhatthongtin();
        btnCapNhatJ.addActionListener(bK);
        btnThoat.addActionListener(bK);
        
    }

    public JDialog getEditBook() {
        return EditBook;
    }
    
    public void capnhatthongtin(){
       ArrayList<Book> newBook=DAObook.getInstance().selectAll();
       DefaultTableModel md=(DefaultTableModel) tbBook.getModel();
       md.setRowCount(0);
       for(Book b: newBook){
           md.addRow(new Object[]{
                b.getBookId(),b.getName(),b.getProducer(),b.getCategory(),b.getAuthor(),b.getAmount(),b.getPrice()
                ,
        });
       }
       
    }
    public void reset(){
        tMaSach.setText("");
        tTenSach.setText("");
        tNhaSX.setText("");
        tNum.setText("");
        tTheLoai.setText("");
        tNum.setText("");
        tTacGia.setText("");
        tGia.setText("");
        capnhatthongtin();
        tTimKiem.setText("");
        BGSearch.clearSelection();
    }
    public void insert(Book b){
        book.add(b);
        DAObook.getInstance().insert(b);
         DefaultTableModel md = (DefaultTableModel) tbBook.getModel();
        md.addRow(new Object[]{
                b.getBookId(),b.getName(),b.getProducer(),b.getCategory(),b.getAuthor(),b.getAmount(),b.getPrice()
            
        });
        
    }
   public void timTheoID(Book b){
    ArrayList<Book> bk = DAObook.getInstance().selectByID(b);
    DefaultTableModel md = (DefaultTableModel) tbBook.getModel();
    md.setRowCount(0);
    for(Book book : bk){
        md.addRow(new Object[]{
            book.getBookId(), book.getName(), book.getProducer(), book.getCategory(), book.getAuthor(), book.getAmount(), book.getPrice()
        });
    }
}   
      public void timTheoName(Book b){
    ArrayList<Book> bk = DAObook.getInstance().selectByName(b);
    DefaultTableModel md = (DefaultTableModel) tbBook.getModel();
    md.setRowCount(0);
    for(Book book : bk){
        md.addRow(new Object[]{
            book.getBookId(), book.getName(), book.getProducer(), book.getCategory(), book.getAuthor(), book.getAmount(), book.getPrice()
        });
    }
}
    public JTextField gettAuthorJ() {
        return tAuthorJ;
    }

    public JButton getBtnCapNhatJ() {
        return btnCapNhatJ;
    }

    public JTextField gettCatagoryJ() {
        return tCatagoryJ;
    }

    public JTextField gettIdJ() {
        return tIdJ;
    }

    public JTextField gettNameJ() {
        return tNameJ;
    }

    public JTextField gettNumJ() {
        return tNumJ;
    }

    public JTextField gettPriceJ() {
        return tPriceJ;
    }

    public JTextField gettProducerJ() {
        return tProducerJ;
    }
    
    public void update(Book bk){
       
        
        tIdJ.setText(bk.getBookId());
        tNameJ.setText(bk.getName());
        tAuthorJ.setText(bk.getAuthor());
        tProducerJ.setText(bk.getProducer());
        tCatagoryJ.setText(bk.getCategory());
        tNumJ.setText(bk.getAmount()+"");
        tPriceJ.setText(bk.getPrice()+"");
        
        
    }
}
    
