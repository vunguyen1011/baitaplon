/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class registerBook {
    private String studentId;
    private String bookId;
    private int amountBook;
    private Date borrowDate;
    private Date appointDate;
    private Date payDate;
    private String giveBookBack = "chưa trả";

    public registerBook(String studentId, String bookId, int amountBook, Date borrowDate, Date appointDate, Date payDate) {
        this.studentId = studentId;
        this.bookId = bookId;
        this.amountBook = amountBook;
        this.borrowDate = borrowDate;
        this.appointDate = appointDate;
        this.payDate = payDate;
    }

    public registerBook() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getAmountBook() {
        return amountBook;
    }

    public void setAmountBook(int amountBook) {
        this.amountBook = amountBook;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getAppointDate() {
        return appointDate;
    }

    public void setAppointDate(Date appointDate) {
        this.appointDate = appointDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getGiveBookBack() {
        return giveBookBack;
    }

    public void setGiveBookBack(String giveBookBack) {
        this.giveBookBack = giveBookBack;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
   
    
}
