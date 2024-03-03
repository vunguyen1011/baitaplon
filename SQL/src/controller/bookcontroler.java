/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DAObook;
import Login.Intro;
import Login.adminform;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Book;
import view.bookView;

/**
 *
 * @author Admin
 */
public class bookcontroler implements ActionListener {
   public bookView bView;

    public bookcontroler(bookView bView) {
        this.bView = bView;
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bView.getBtnThem()){
            String bookId=bView.gettMaSach().getText();
            String name=bView.gettTenSach().getText();
            String proucer=bView.gettNhaSX().getText();
            String authur=bView.gettTacGia().getText();
            String category=bView.gettTheLoai().getText();
            int num = Integer.parseInt(bView.gettNum().getText());
            float price= Float.parseFloat(bView.gettGia().getText());
            Book book=new Book(bookId, name, category, authur, proucer, price, num);
            bView.insert(book);
        }
        if(e.getSource()==bView.getBtnLammoi()){
            bView.reset();
        }
        if(e.getSource()==bView.getBtnSua()){
            DefaultTableModel model = (DefaultTableModel)bView.getTbBook().getModel();
            int selectedRow = bView.getTbBook().getSelectedRow();
            Book bk=new Book();
            bk.setBookId(bView.getTbBook().getValueAt(selectedRow, 0)+"");
            bk.setName(bView.getTbBook().getValueAt(selectedRow, 1)+"");
            bk.setProducer(bView.getTbBook().getValueAt(selectedRow, 2)+"");
            bk.setCategory(bView.getTbBook().getValueAt(selectedRow, 3)+"");
            bk.setAuthor(bView.getTbBook().getValueAt(selectedRow, 4)+"");
            bk.setAmount(Integer.parseInt(bView.getTbBook().getValueAt(selectedRow,5)+""));
            bk.setPrice(Float.parseFloat(bView.getTbBook().getValueAt(selectedRow,6)+""));
            bView.update(bk);
            bView.getEditBook().setVisible(true);
        }
      if(e.getSource() == bView.getBtnXoa()) {
        // Lấy dòng được chọn từ bảng
        int selectedRow = bView.getTbBook().getSelectedRow();
        
        if(selectedRow != -1) {
            // Lấy ID sách từ dòng được chọn
            String bookId = (String) bView.getTbBook().getValueAt(selectedRow, 0);
            Book newBook=new Book();
            newBook.setBookId(bookId);
            // Xóa sách từ cơ sở dữ liệu
            DAObook.getInstance().delete(newBook);
            
            // Xóa dòng từ mô hình bảng
            DefaultTableModel model = (DefaultTableModel) bView.getTbBook().getModel();
            model.removeRow(selectedRow);
            
            // Hiển thị thông báo thành công
            JOptionPane.showMessageDialog(bView, "Sách đã được xóa thành công!");
        } else {
            // Hiển thị thông báo lỗi nếu không có dòng nào được chọn
            JOptionPane.showMessageDialog(bView, "Vui lòng chọn một sách để xóa!");
        }
    }
        if(e.getSource()==bView.getBtnCapNhatJ()){
            Book bk=new Book();
            bk.setBookId(bView.gettIdJ().getText());
            bk.setName(bView.gettNameJ().getText());
            bk.setProducer(bView.gettProducerJ().getText());
            bk.setCategory(bView.gettCatagoryJ().getText());
            bk.setAuthor(bView.gettAuthorJ().getText());
            bk.setAmount(Integer.parseInt(bView.gettNumJ().getText()));
            bk.setPrice(Float.parseFloat(bView.gettPriceJ().getText()));
            DefaultTableModel model = (DefaultTableModel)bView.getTbBook().getModel();
            int selectedRow = bView.getTbBook().getSelectedRow();
            model.setValueAt(bView.gettIdJ().getText(), selectedRow, 0);
            model.setValueAt(bView.gettNameJ().getText(), selectedRow, 1);
            model.setValueAt(bView.gettProducerJ().getText(), selectedRow, 2);
            model.setValueAt(bView.gettCatagoryJ().getText(), selectedRow, 3);
            model.setValueAt(bView.gettAuthorJ().getText(), selectedRow, 4);
            
            model.setValueAt(bView.gettNumJ().getText(), selectedRow, 5);
            model.setValueAt(bView.gettPriceJ().getText(), selectedRow, 6);
            model.fireTableRowsUpdated(selectedRow, selectedRow);
            DAObook.getInstance().update(bk);
            JOptionPane.showMessageDialog(bView, "Bảng đã được cập nhật thành công!");
            bView.getEditBook().dispose();
            
    }
        if(e.getSource()==bView.getBtnTim()&& bView.getBtnTheoMS().isSelected()){
            Book b=new Book();
            b.setBookId(bView.gettTimKiem().getText());
            bView.timTheoID(b);
            
        }
        if(e.getSource()==bView.getBtnTim()&& bView.getBtnTheoTen().isSelected()){
            Book b=new Book();
            b.setName(bView.gettTimKiem().getText());
            bView.timTheoName(b);
            
        }
        if(e.getSource()==bView.getBtnThoat()){
            adminform adm=new adminform();
       adm.setVisible(true);
       bView.dispose();
        }
    }
}
