/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.util.logging.Logger;
import DAO.DAObook;
import DAO.DAOregisterbook;
import DAO.DAOstudent;
import controller.bookRegistercontroler;
import java.util.logging.Level;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Book;
import model.Student;
import model.registerBook;

/**
 *
 * @author Admin
 */
public class registerBookView extends javax.swing.JFrame {

    /**
     * Creates new form registerBookView
     */
    public registerBookView() {
        myinitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tMSVrsj = new javax.swing.JTextField();
        tMaSachrsj = new javax.swing.JTextField();
        tSoLuongrsj = new javax.swing.JTextField();
        tHenTrarsj = new javax.swing.JTextField();
        btnCapNhatJ = new javax.swing.JButton();
        btnHuyJ = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnTheoMS = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        btnThoat = new javax.swing.JButton();
        btnTheoTen = new javax.swing.JRadioButton();
        tTimKiem = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegisterbook = new javax.swing.JTable();
        btnMuonSach = new javax.swing.JButton();
        btnSuaTT = new javax.swing.JButton();
        btnTraSach = new javax.swing.JButton();
        btnLammoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tMSVrs = new javax.swing.JTextField();
        tMaSachrs = new javax.swing.JTextField();
        tSoLuongrs = new javax.swing.JTextField();
        tHenTrars = new javax.swing.JTextField();
        checkMSV = new javax.swing.JButton();
        checkMaSach = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Thông tin mượn sách");

        jLabel9.setText("Mã sinh viên");

        jLabel10.setText("Mã sách");

        jLabel11.setText("Số lượng");

        jLabel12.setText("Ngày hẹn trả");

        btnCapNhatJ.setText("Cập nhật");

        btnHuyJ.setText("Hủy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(23, 23, 23)))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel12)
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tMSVrsj, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tMaSachrsj, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                .addComponent(tSoLuongrsj)
                                .addComponent(tHenTrarsj))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnCapNhatJ, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnHuyJ, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 89, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tMSVrsj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(tMaSachrsj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSoLuongrsj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tHenTrarsj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhatJ)
                    .addComponent(btnHuyJ))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Thông tin mượn sách");

        btnTheoMS.setText("Tìm kiếm theo mã sách");

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnTheoTen.setText("Tìm kiếm theo tên sinh viên");

        btnTim.setText("Tìm");

        tbRegisterbook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Mã Sách", "Số lượng sách","Ngày mượn" ,"Ngày hẹn trả","Ngày trả","Trạng thái"

            }
        ));
        jScrollPane1.setViewportView(tbRegisterbook);

        btnMuonSach.setText("Mượn sách");

        btnSuaTT.setText("Sửa thông tin");
        btnSuaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTTActionPerformed(evt);
            }
        });

        btnTraSach.setText("Trả sách");

        btnLammoi.setText("Làm mới");

        jLabel1.setText("Tìm kiếm");

        btnXoa.setText("Xóa");

        jLabel3.setText("Mã sinh viên");

        jLabel4.setText("Mã sách");

        jLabel5.setText("Số lượng");

        jLabel6.setText("Ngày hẹn trả");

        checkMSV.setText("Kiểm tra");

        checkMaSach.setText("Kiểm tra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnMuonSach)
                        .addGap(29, 29, 29)
                        .addComponent(btnSuaTT)
                        .addGap(32, 32, 32)
                        .addComponent(btnTraSach)
                        .addGap(34, 34, 34)
                        .addComponent(btnXoa)
                        .addGap(35, 35, 35)
                        .addComponent(btnLammoi)
                        .addGap(34, 34, 34)
                        .addComponent(btnThoat)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTheoMS, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTheoTen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnTim)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tMSVrs, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                    .addComponent(tMaSachrs)
                                    .addComponent(tSoLuongrs)
                                    .addComponent(tHenTrars))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkMSV)
                                    .addComponent(checkMaSach))
                                .addGap(39, 39, 39))))))
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
                        .addComponent(btnTheoMS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTheoTen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTim))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tMSVrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMSV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tMaSachrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMaSach))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tSoLuongrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tHenTrars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMuonSach)
                    .addComponent(btnSuaTT)
                    .addComponent(btnTraSach)
                    .addComponent(btnLammoi)
                    .addComponent(btnThoat)
                    .addComponent(btnXoa))
                .addGap(29, 29, 29))
        );

        jMenu1.setText("Quản lý mượn trả");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Danh sách mượn trả && Thống kê");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSuaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaTTActionPerformed
    public boolean kiemTraSinhVien(Student st){
        ArrayList<Student> student=DAOstudent.getInstance().selectByID(st);
        return student.contains(st);
    }
    public bookRegistercontroler ac=new bookRegistercontroler(this);
    public boolean kiemTraSach(Book b){
        ArrayList<Book> bk=DAObook.getInstance().selectByID(b);
        return bk.contains(b);
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
            java.util.logging.Logger.getLogger(registerBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerBookView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerBookView().setVisible(true);
            }
        });
    }

    public JButton getBtnLammoi() {
        return btnLammoi;
    }

    public JButton getBtnMuonSach() {
        return btnMuonSach;
    }

    public JButton getBtnSuaTT() {
        return btnSuaTT;
    }

    public JRadioButton getBtnTheoMS() {
        return btnTheoMS;
    }

    public JRadioButton getBtnTheoTen() {
        return btnTheoTen;
    }

    public JButton getBtnThoat() {
        return btnThoat;
    }

    public JButton getBtnTim() {
        return btnTim;
    }

    public JButton getBtnTraSach() {
        return btnTraSach;
    }

    public JButton getBtnXoa() {
        return btnXoa;
    }

    public JButton getCheckMSV() {
        return checkMSV;
    }

    public JButton getCheckMaSach() {
        return checkMaSach;
    }

    public JTextField gettHenTrars() {
        return tHenTrars;
    }

    public JTextField gettMSVrs() {
        return tMSVrs;
    }

    public JTextField gettMaSachrs() {
        return tMaSachrs;
    }

    public JTextField gettSoLuongrs() {
        return tSoLuongrs;
    }

    public JTextField gettTimKiem() {
        return tTimKiem;
    }

    public JTable getTbRegisterbook() {
        return tbRegisterbook;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatJ;
    private javax.swing.JButton btnHuyJ;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnMuonSach;
    private javax.swing.JButton btnSuaTT;
    private javax.swing.JRadioButton btnTheoMS;
    private javax.swing.JRadioButton btnTheoTen;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTraSach;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton checkMSV;
    private javax.swing.JButton checkMaSach;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField tHenTrars;
    private javax.swing.JTextField tHenTrarsj;
    private javax.swing.JTextField tMSVrs;
    private javax.swing.JTextField tMSVrsj;
    private javax.swing.JTextField tMaSachrs;
    private javax.swing.JTextField tMaSachrsj;
    private javax.swing.JTextField tSoLuongrs;
    private javax.swing.JTextField tSoLuongrsj;
    private javax.swing.JTextField tTimKiem;
    private javax.swing.JTable tbRegisterbook;
    // End of variables declaration//GEN-END:variables
    public javax.swing.ButtonGroup btg;

    private void myinitComponents() {
        initComponents();
        checkMSV.addActionListener(ac);
        checkMaSach.addActionListener(ac);
        btnLammoi.addActionListener(ac);
        btnMuonSach.addActionListener(ac);
        btnTraSach.addActionListener(ac);
        btnSuaTT.addActionListener(ac);
        btnTheoMS.addActionListener(ac);
        btnTheoTen.addActionListener(ac);
        btnTim.addActionListener(ac);
        btnXoa.addActionListener(ac);
        btnThoat.addActionListener(ac);
        btg=new ButtonGroup();
        btg.add(btnTheoMS);
        btg.add(btnTheoTen);
        jDialog1.setBounds(150, 150, 600, 600);
        capnhatthongtin();
        btnCapNhatJ.addActionListener(ac);
        
        
    }
    public void reset(){
        tTimKiem.setText("");
        tMSVrs.setText("");
        tSoLuongrs.setText("");
        tHenTrars.setText("");
        tMaSachrs.setText("");
        btg.clearSelection();
        capnhatthongtin();
        
    }
public void insert(registerBook book ){
    DefaultTableModel md = (DefaultTableModel) tbRegisterbook.getModel();
  
    // Create a SimpleDateFormat for the date
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    // Format the current date and the appoint date
    String currentDate = format.format(new Date()); // Lấy ngày hiện tại
    String appointDate = format.format(book.getAppointDate());

    Object[] row = new Object[]{book.getStudentId(), book.getBookId(), book.getAmountBook(),
                                 currentDate,
                                 appointDate,
                                 null, book.getGiveBookBack()};
    Book b=new Book();
    b.setBookId(book.getBookId());
    Student st=new Student();
    md.addRow(row);
    st.setStudentId(book.getStudentId());
}
private Date parseDate(Object dateObj) {
    if (dateObj == null) {
        return null;
    }

    java.sql.Date dateSQL = null;
    if (dateObj instanceof java.sql.Date) {
        dateSQL = (java.sql.Date) dateObj;
    } else if (dateObj instanceof String) {
        try {
            dateSQL = java.sql.Date.valueOf((String) dateObj);
        } catch (IllegalArgumentException e) {
            // Handle the exception or log a message if needed
            return null;
        }
    }

    return (dateSQL != null) ? new Date(dateSQL.getTime()) : null;
}

public registerBook getSelectedBook() {
    int selectedRowIndex = tbRegisterbook.getSelectedRow();
    if (selectedRowIndex == -1) {
        return null;
    }

    registerBook selectedBook = new registerBook();
    selectedBook.setStudentId((String) tbRegisterbook.getValueAt(selectedRowIndex, 0));
    selectedBook.setBookId((String) tbRegisterbook.getValueAt(selectedRowIndex, 1));
    selectedBook.setAmountBook((Integer) tbRegisterbook.getValueAt(selectedRowIndex, 2));
    selectedBook.setBorrowDate(parseDate(tbRegisterbook.getValueAt(selectedRowIndex, 3)));
    selectedBook.setAppointDate(parseDate(tbRegisterbook.getValueAt(selectedRowIndex, 4)));
    selectedBook.setPayDate(parseDate(tbRegisterbook.getValueAt(selectedRowIndex, 5)));
    selectedBook.setGiveBookBack((String) tbRegisterbook.getValueAt(selectedRowIndex, 6));

    return selectedBook;
}

public void timtheoIdsach(registerBook ba){
    ArrayList<registerBook>book=DAOregisterbook.getInstance().selectByID(ba);
    
       DefaultTableModel md=(DefaultTableModel) tbRegisterbook.getModel();
       md.setRowCount(0);
       for(registerBook b: book){
           md.addRow(new Object[]{
             b.getStudentId(),b.getBookId(),b.getAmountBook(),b.getBorrowDate(),b.getAppointDate(),b.getPayDate(),b.getGiveBookBack()
                ,
        });
       }
}
public void timtheoIdName(registerBook ba){
    ArrayList<registerBook>book=DAOregisterbook.getInstance().selectByIDN(ba);
    
       DefaultTableModel md=(DefaultTableModel) tbRegisterbook.getModel();
       md.setRowCount(0);
       for(registerBook b: book){
           md.addRow(new Object[]{
             b.getStudentId(),b.getBookId(),b.getAmountBook(),b.getBorrowDate(),b.getAppointDate(),b.getPayDate(),b.getGiveBookBack()
                ,
        });
       }
}


 public void trasach(registerBook bk){
     bk.setPayDate(new Date());
     bk.setGiveBookBack("đã trả");
     DAOregisterbook.getInstance().update(bk);
     
     
 }

    public JTextField gettHenTrarsj() {
        return tHenTrarsj;
    }

    public JTextField gettMSVrsj() {
        return tMSVrsj;
    }

    public JTextField gettMaSachrsj() {
        return tMaSachrsj;
    }

    public JTextField gettSoLuongrsj() {
        return tSoLuongrsj;
    }
 
 public boolean kiemtra(Student st,registerBook b){
     ArrayList<registerBook> sachmuon=DAOregisterbook.getInstance().selectByID(b);
     for(registerBook book:sachmuon){
         if(book.getStudentId().equals(st.getStudentId()) && book.getGiveBookBack().equals("chưa trả")){
             return true;
         }
     }
     return false;
   
     
 }

    public JDialog getjDialog1() {
        return jDialog1;
    }
 

    public void capnhatthongtin() {
         ArrayList<registerBook> newBook=DAOregisterbook.getInstance().selectAll();
       DefaultTableModel md=(DefaultTableModel) tbRegisterbook.getModel();
       md.setRowCount(0);
       for(registerBook b: newBook){
           md.addRow(new Object[]{
             b.getStudentId(),b.getBookId(),b.getAmountBook(),b.getBorrowDate(),b.getAppointDate(),b.getPayDate(),b.getGiveBookBack()
                ,
        });
       }
       md.fireTableDataChanged();

    }

    public JButton getBtnCapNhatJ() {
        return btnCapNhatJ;
    }

    public JButton getBtnHuyJ() {
        return btnHuyJ;
    }

}

