/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAOregisterbook;
import Login.Intro;
import Login.adminform;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Book;
import model.Student;
import model.registerBook;
import view.registerBookView;

/**
 *
 * @author Admin
 */
public class bookRegistercontroler implements ActionListener{
    public registerBookView View;

    public bookRegistercontroler(registerBookView View) {
        this.View = View;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==View.getCheckMSV()){
            Student st=new Student();
            st.setStudentId(View.gettMSVrs().getText());
            if(View.kiemTraSinhVien(st)){
                JOptionPane.showMessageDialog(View, "Mã sinh viên tồn tại");
            }
            else{
                JOptionPane.showMessageDialog(View, "Mã sinh viên không  tồn tại");
            }
        }
        if(e.getSource()==View.getCheckMaSach()){
            Book bk=new Book();
            bk.setBookId(View.gettMaSachrs().getText());
            if(View.kiemTraSach(bk)){
                JOptionPane.showMessageDialog(View, "Mã sách  tồn tại");
            }
            else{
                JOptionPane.showMessageDialog(View, "Mã sách không  tồn tại");
            }
        }
        if(e.getSource()==View.getBtnLammoi()){
            View.reset();
        }
        if(e.getSource()==View.getBtnMuonSach()){
            
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
            st.setStudentId(View.gettMSVrs().getText());
            registerBook rsB=new registerBook();
            rsB.setBookId(View.gettMaSachrs().getText());
            rsB.setStudentId(View.gettMSVrs().getText());
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
        if(e.getSource()==View.getBtnTraSach()){
             registerBook selectedBook = View.getSelectedBook();
             View.trasach(selectedBook);
             
             View.capnhatthongtin();
             
        }
      if (e.getSource() == View.getBtnSuaTT()) {
    View.getjDialog1().setVisible(true);
    registerBook newBook = View.getSelectedBook();

    // Format the date using SimpleDateFormat
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = newBook.getAppointDate() != null ? sdf.format(newBook.getAppointDate()) : "";

    View.gettHenTrarsj().setText(formattedDate);
    View.gettMSVrsj().setText(newBook.getStudentId());
    View.gettMaSachrsj().setText(newBook.getBookId());
    View.gettSoLuongrsj().setText(String.valueOf(newBook.getAmountBook()));
}

if (e.getSource() == View.getBtnCapNhatJ()) {
    // Create a new registerBook object
    registerBook selectedBook = View.getSelectedBook();

    // Update the book information based on the input fields
    selectedBook.setStudentId(View.gettMSVrsj().getText());
    selectedBook.setBookId(View.gettMaSachrsj().getText());
    selectedBook.setAmountBook(Integer.parseInt(View.gettSoLuongrsj().getText()));
    
    // Check if the book is in the "chưa trả" state before updating return date
    if ("chưa trả".equals(selectedBook.getGiveBookBack())) {
        // Set the pay date to null
        selectedBook.setPayDate(null);
    } else {
        // Set the pay date to the current date
        selectedBook.setPayDate(new Date());
    }

    // Parse the due date
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    try {
        Date dueDate = format.parse(View.gettHenTrarsj().getText());
        selectedBook.setAppointDate(dueDate);
    } catch (ParseException ex) {
        Logger.getLogger(bookRegistercontroler.class.getName()).log(Level.SEVERE, null, ex);
    }

    // Update the book in the database and the table
    DAOregisterbook.getInstance().update(selectedBook);
    View.capnhatthongtin();
}
if (e.getSource() == View.getBtnXoa()) {
    registerBook nb = View.getSelectedBook();
    
    // Kiểm tra xem trạng thái của sách có phải là "đã trả" không
    if ("đã trả".equals(nb.getGiveBookBack())) {
        DAOregisterbook.getInstance().delete(nb);
        View.capnhatthongtin();
    } else {
        // Hiển thị thông báo lỗi nếu sách chưa được trả
        JOptionPane.showMessageDialog(View, "Chỉ có thể xóa sách đã được trả!");
    }
}
if(e.getSource()==View.getBtnTim() && View.getBtnTheoMS().isSelected()){
    registerBook nb=new registerBook();
    nb.setBookId(View.gettTimKiem().getText());
    View.timtheoIdsach(nb);
}
if(e.getSource()==View.getBtnTim() && View.getBtnTheoTen().isSelected()){
    registerBook nb=new registerBook();
    nb.setStudentId(View.gettTimKiem().getText());
    View.timtheoIdName(nb);
}
 if(e.getSource()==View.getBtnThoat()){
        adminform adm=new adminform();
       adm.setVisible(true);
       View.dispose();
        }
}
}
