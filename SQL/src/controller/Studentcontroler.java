/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAOstudent;
import Login.adminform;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Student;
import view.studenView;
import java.text.ParseException;

/**
 *
 * @author Admin
 */
public class Studentcontroler implements ActionListener{
    public studenView View;

    public Studentcontroler(studenView View) {
        this.View = View;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==View.getBtnLammoi()){
            View.reset();
        }
        if(e.getSource()==View.getBtnThem()){
            SimpleDateFormat mysqlSdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            dob = mysqlSdf.parse(View.gettDate().getText());
        } catch (ParseException p) {
            p.printStackTrace();
        }
            Student s=new Student();
            s.setStudentId(View.gettId().getText());
            s.setName(View.gettName().getText());
            s.setAddress(View.gettAdress().getText());
            s.setDob(dob);
            s.setPhone(View.gettSdt().getText());
            s.setClassRoon(View.gettClass().getText());
            s.setMajor(View.getCbMajor().getSelectedItem()+"");
            s.setEmail(View.gettEmail().getText());
            String gender;
            if(View.getBtnNam().isSelected()){
                gender="Nam";
            }
            else if(View.getBtnNu().isSelected()){
                gender="Nữ";
            }
            else{
                 JOptionPane.showMessageDialog(View, "Vui lòng chọn giới tính ", "Lỗi", JOptionPane.ERROR_MESSAGE);
                 return;
            }
            
            s.setGender(gender);
            View.Insert(s);
            
          
        }
         if(e.getSource()==View.getBtnXoa()){
             int select=View.getTbStudent().getSelectedRow();
             if (select != -1) {
                 DefaultTableModel model = (DefaultTableModel) View.getTbStudent().getModel();
                    int selectedRow = View.getTbStudent().getSelectedRow();
//                 String dobStr = (String) View.getTbStudent().getValueAt(select, 3);
//                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); // Adjust this to match the date
//                Date dob = formatter.parse(dobStr);
                 Student sv=new Student();
                 sv.setStudentId(View.getTbStudent().getValueAt(select, 0)+"");
//                 sv.setName(View.getTbStudent().getValueAt(select, 1)+"");
//                 sv.setGender(View.getTbStudent().getValueAt(select, 2)+"");
//                 sv.setDob(dob);
//                 sv.setClassRoon(View.getTbStudent().getValueAt(select, 4)+"");
//                 sv.setAddress(View.getTbStudent().getValueAt(select, 5)+"");
//                 sv.setMajor(View.getTbStudent().getValueAt(select, 6)+"");
                View.Delete(sv);
                model.removeRow(selectedRow);
                 
             }
             
         }
    if(e.getSource()==View.getBtnSua()){
    
        View.getEditStudent().setVisible(true);
        int select = View.getTbStudent().getSelectedRow();
        if (select != -1) {
            try {
                // lấy dữ liệu từ bảng 
                Student sv = new Student();

                DefaultTableModel model = (DefaultTableModel) View.getTbStudent().getModel();
                int selectedRow = View.getTbStudent().getSelectedRow();
                
                // Chuyển đổi Date sang String
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Object dobObject = View.getTbStudent().getValueAt(select, 3);
                Date dob;
                if (dobObject instanceof Date) {
                    dob = (Date) dobObject;
                } else if (dobObject instanceof String) {
                    
                    dob = formatter.parse((String) dobObject);
                } else {
                    throw new IllegalArgumentException("Date object is not a Date or String");
                }
                String dobStr = formatter.format(dob);

                sv.setStudentId(View.getTbStudent().getValueAt(select, 0) + "");
                sv.setName(View.getTbStudent().getValueAt(select, 1) + "");
                sv.setGender(View.getTbStudent().getValueAt(select, 2) + "");
                sv.setDob(dob);
                sv.setClassRoon(View.getTbStudent().getValueAt(select, 4) + "");
                sv.setAddress(View.getTbStudent().getValueAt(select, 5) + "");
                sv.setMajor(View.getTbStudent().getValueAt(select, 6) + "");
                sv.setPhone(View.getTbStudent().getValueAt(select, 7) + ""); // Thêm giá trị phone
                sv.setEmail(View.getTbStudent().getValueAt(select, 8) + ""); // Thêm giá trị mail
                sv.setPassword(View.getTbStudent().getValueAt(select, 9) + ""); // Thêm giá trị passwd
                
                // hiển thị dữ liệu lên frame sửa thông tin 
                View.getStudentIdJ().setText(sv.getStudentId());
                View.getNameSJ().setText(sv.getName());
                View.getAdressSJ().setText(sv.getAddress());
                View.getClassSJ().setText(sv.getClassRoon());
                View.getMajorSJ().setText(sv.getMajor());
                View.getDateSJ().setText(dobStr);
                View.getSdtSJ().setText(sv.getPhone());
                View.getEmailSJ().setText(sv.getEmail());
                View.getPassSJ().setText(sv.getPassword());
                
                if (View.getTbStudent().getValueAt(select, 2).toString().equals("Nam")) {
                    View.getBtnNamSJ().setSelected(true);
                    View.getBtnNuSJ().setSelected(false);
                } else if (View.getTbStudent().getValueAt(select, 2).toString().equals("Nữ")) {
                    View.getBtnNuSJ().setSelected(true);
                    View.getBtnNamSJ().setSelected(false);
                }
            } catch (Exception ex) {
                Logger.getLogger(Studentcontroler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
  if(e.getSource()==View.getBtnCapNhatSJ()){
     int selectedRow = View.getTbStudent().getSelectedRow(); // Lấy hàng được chọn
    DefaultTableModel model = (DefaultTableModel) View.getTbStudent().getModel();

    // Lấy thông tin mới từ các trường nhập liệu
    String newId = View.getStudentIdJ().getText();
    String newName = View.getNameSJ().getText();
    String newGender = View.getBtnNamSJ().isSelected() ? "Nam" : "Nữ";
    String newDobStr = View.getDateSJ().getText();
    String newClassRoon = View.getClassSJ().getText();
    String newAddress = View.getAdressSJ().getText();
    String newMajor = View.getMajorSJ().getText();
    String newPhone = View.getSdtSJ().getText();
    String newEmail = View.getEmailSJ().getText();
    String newPassword = View.getPassSJ().getText();

    // Chuyển đổi String sang Date
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Date newDob = null;
    try {
        newDob = formatter.parse(newDobStr);
    } catch (ParseException ex) {
        ex.printStackTrace();
    }

    // Cập nhật thông tin trong mô hình
    model.setValueAt(newId, selectedRow, 0); // Cập nhật ID
    model.setValueAt(newName, selectedRow, 1); // Cập nhật tên
    model.setValueAt(newGender, selectedRow, 2); // Cập nhật giới tính
    model.setValueAt(newDob, selectedRow, 3); // Cập nhật ngày sinh
    model.setValueAt(newClassRoon, selectedRow, 4); // Cập nhật lớp
    model.setValueAt(newAddress, selectedRow, 5); // Cập nhật địa chỉ
    model.setValueAt(newMajor, selectedRow, 6); // Cập nhật chuyên ngành
    model.setValueAt(newPhone, selectedRow, 7); // Cập nhật số điện thoại
    model.setValueAt(newEmail, selectedRow, 8); // Cập nhật email
    model.setValueAt(newPassword, selectedRow, 9); // Cập nhật mật khẩu

    // Thông báo cho bảng về sự thay đổi
    model.fireTableRowsUpdated(selectedRow, selectedRow);
    Student sv=new Student(newId, newClassRoon, newMajor, newEmail, newName, newDob, newAddress, newPhone, newGender, newPassword);
      DAOstudent.getInstance().update(sv);
      View.getEditStudent().dispose();
  }
  if(e.getSource()==View.getBtnHuySJ()){
      View.getEditStudent().dispose();
      
  }
  if(e.getSource()==View.getBtnTim() && View.getBtnTheoMsv().isSelected()){
      Student sv=new Student();
      sv.setStudentId(View.gettTimKiem().getText());
      View.timThongtinId(sv);
  }
  if(e.getSource()==View.getBtnTim() && View.getBtnTheoTen().isSelected()){
      Student sv=new Student();
      sv.setName(View.gettTimKiem().getText());
      View.timThongtinName(sv);
  }
    if(e.getSource()==View.getBtnTim() && View.getBtnTheoLop().isSelected()){
      Student sv=new Student();
      sv.setClassRoon(View.gettTimKiem().getText());
      View.timThongtinClass(sv);
  }
   if(e.getSource()==View.getBtnThoat()){
       adminform adm=new adminform();
       adm.setVisible(true);
       View.dispose();
   }
}
}

