/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import DAO.DAOregisterbook;

import DAO.DAOstudent;
import controller.bookRegistercontroler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Book;
import model.Student;
import model.registerBook;

/**
 *
 * @author Admin
 */
public class dangnhapcontroler implements ActionListener{
    public dangnhap View;

    public dangnhapcontroler(dangnhap View) {
        this.View = View;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==View.getBtnDangnhap()){
            if(View.getTaikhoan().getText().equals("admin")&& View.getMatkhau().getText().equals("tlu123")){
                adminform ad=new adminform();
                ad.setVisible(true);
                View.dispose();
                return;
            }
            String taikhoan=View.getTaikhoan().getText();
            String matkhau=View.getMatkhau().getText();
            Student s=new Student();
            s.setEmail(taikhoan);
            s.setPassword(matkhau);
            ArrayList<Student> st=DAOstudent.getInstance().selectByEmail(s);
            for(Student student :st){
                if(student.getEmail().equals(s.getEmail()) && student.getPassword().equals(s.getPassword())){
                   
                    View.getjDialog1().setVisible(true);
                    View.thongtinsinhvien(s);
                    View.capnhatsachmuon(student);
                    View.dispose();
                   return;
                }
            }
            JOptionPane.showMessageDialog(View,"Tài khoản hoặc mật khẩu không chính xác");
        }
        if(e.getSource()==View.getBtnThoat()){
            adminform adm=new adminform();
            adm.setVisible(true);
            View.dispose();
        }
        
        if(e.getSource()==View.getBtnTim()){
            Book b=new Book();
            b.setBookId(View.gettTim().getText());
            View.timTheoID(b);
        }
        if(e.getSource()==View.getLammoi()){
            String taikhoan=View.getTaikhoan().getText();
            String matkhau=View.getMatkhau().getText();
            Student s=new Student();
            s.setEmail(taikhoan);
            View.gettTim().setText("");
            View.capnhatthongtin();
            View.thongtinsinhvien(s);
        }
        if(e.getSource()==View.getCapnhat()){
            View.getjDialog2().setVisible(true);
            View.getjDialog2().setBounds(150,150,500,500); 
            String taikhoan=View.getTaikhoan().getText();
            String matkhau=View.getMatkhau().getText();
            Student s=new Student();
            s.setEmail(taikhoan);
            s.setPassword(matkhau);
            ArrayList<Student> st=DAOstudent.getInstance().selectByEmail(s);
            for(Student student :st){
            View.getStudentIdJ().setText(student.getStudentId());
            View.getNameSJ().setText(student.getName());
            String gioitinh=student.getGender();
            if(gioitinh.equals("Nam")){
                View.getBtnNamSJ().setSelected(true);
            }
            else{
                View.getBtnNuSJ().setSelected(true);
            }
            View.getDateSJ().setText(student.getDob().toString());
            View.getClassSJ().setText(student.getClassRoon());
            View.getMajorSJ().setText(student.getMajor());
            View.getSdtSJ().setText(student.getPhone());
            View.getAdressSJ().setText(student.getAddress());
            View.getEmailSJ().setText(student.getEmail());
            View.getPassSJ().setText(student.getPassword());
            }
        }
        if(e.getSource()==View.getBtnCapNhatSJ()){
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
        Student sv=new Student(newId, newClassRoon, newMajor, newEmail, newName, newDob, newAddress, newPhone, newGender, newPassword);
         DAOstudent.getInstance().update(sv);
      View.getjDialog2().dispose();
      View.thongtinsinhvien(sv);
        }
        if(e.getSource()==View.getBtnHuySJ()){
            View.getjDialog2().dispose();
        }
        if(e.getSource()==View.getMuon()){
            View.getjDialog3().setVisible(true);
            View.getjDialog3().setBounds(100,100,500,500);
            
            
            
        }
        if(e.getSource()==View.getMuonj3()){
             String hentra=View.gettHenTrars().getText();
           
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = format.parse(hentra);
            } catch (ParseException ex) {
                Logger.getLogger(bookRegistercontroler.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
            Book bk=new Book();
            bk.setBookId(View.gettMaSachrs().getText());
            Student st=new Student();
            st.setStudentId(View.getMsv().getText());
            registerBook rsB=new registerBook();
            rsB.setBookId(View.gettMaSachrs().getText());
            rsB.setStudentId(View.getMsv().getText());
            rsB.setAppointDate(date);
            rsB.setAmountBook(Integer.parseInt(View.gettSoLuongrs().getText()));
            if(View.kiemtra(st,rsB)){
                JOptionPane.showMessageDialog(View, "Không thể mượn sách chưa trả");
                return;
            }
            
            if(Integer.parseInt(View.gettSoLuongrs().getText())>3){
                JOptionPane.showMessageDialog(View, "Mượn tối đa 3 quyển");
                return;
            }
            if(View.kiemTraSach(bk)&& View.kiemTraSinhVien(st)){
             View.insert(rsB);
             DAOregisterbook.getInstance().insert(rsB);
        }
            else{
                JOptionPane.showMessageDialog(View, "Mã sách hoặc mã sinh viên không tồn tại");
            }
           
        
            
        }
        if(e.getSource()==View.getBtnDangky()){
            dangky dk=new dangky();
            dk.setVisible(true);
        }
    }
    
}
