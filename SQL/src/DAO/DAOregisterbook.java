/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Statement;
import java.util.ArrayList;
import model.JDBCUtil;
import model.registerBook;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import model.Student;

/**
 *
 * @author Admin
 */
public class DAOregisterbook implements DAOinterface<registerBook>{
    
    public static DAOregisterbook getInstance(){
        return new DAOregisterbook();
        
    }

    @Override
    public int insert(registerBook t) {
    int result = 0;
    Connection c = null;
    try {
        c = JDBCUtil.getConnection();
        String sql = "INSERT INTO registerbook (studentid, bookid, amount, borrowDate,appointDate, payDate, giveBook) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = c.prepareStatement(sql);
        pstmt.setString(1, t.getStudentId());
        pstmt.setString(2, t.getBookId());
        pstmt.setInt(3, t.getAmountBook());
        pstmt.setString(4, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        pstmt.setString(5, new SimpleDateFormat("yyyy-MM-dd").format(t.getAppointDate()));
        pstmt.setString(6, null);
        pstmt.setString(7, t.getGiveBookBack());
        result = pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (c != null) {
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    return result;
}

    @Override
public int update(registerBook t) {
    int result = 0;
    try {
        // Create connection
        Connection con = JDBCUtil.getConnection();
        // Create a PreparedStatement object for the SQL query
        String sql = "UPDATE registerbook SET amount = ?, borrowDate = ?, appointDate = ?, payDate = ?, giveBook = ? WHERE bookId = ? AND studentId = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        // Set the parameters
        ps.setInt(1, t.getAmountBook());
        ps.setDate(2, new java.sql.Date(t.getBorrowDate().getTime()));
        ps.setDate(3, new java.sql.Date(t.getAppointDate().getTime()));
        if(t.getPayDate() != null){
            ps.setDate(4, new java.sql.Date(t.getPayDate().getTime()));
        } else {
            ps.setNull(4, java.sql.Types.DATE);
        }
        ps.setString(5, t.getGiveBookBack());
        ps.setString(6, t.getBookId());
        ps.setString(7, t.getStudentId());
        // Execute the update
        result = ps.executeUpdate();
        // Close the connection
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return result;
}

    @Override
    public int delete(registerBook t) {
    int result = 0;
    try {
        // Create connection
        Connection con = JDBCUtil.getConnection();
        // Create statement
        Statement st = con.createStatement();
        // Execute SQL query
        String sql = "DELETE from registerbook where bookId='" + t.getBookId() + "'";
        result = st.executeUpdate(sql);
        con.close();
    } catch(Exception c) {
        c.printStackTrace();
    }
    return result;
}

    @Override
    public ArrayList<registerBook> selectByID(registerBook t) {
         ArrayList<registerBook> ketqua = new ArrayList<registerBook>();
    try {
        // Create connection
        Connection con = JDBCUtil.getConnection();
        // Create statement
        Statement st = con.createStatement();
        // Execute SQL query
        String sql = "SELECT * from registerbook where bookId='"+t.getBookId()+"'";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            registerBook rsbook = new registerBook();
            // Assuming these are the columns in your "registerbook" table
            rsbook.setStudentId(rs.getString("studentId"));
            rsbook.setBookId(rs.getString("bookId"));
            rsbook.setAmountBook(rs.getInt("amount"));
            rsbook.setBorrowDate(rs.getDate("borrowDate"));
            rsbook.setAppointDate(rs.getDate("appointDate"));
            rsbook.setPayDate(rs.getDate("payDate"));
            rsbook.setGiveBookBack(rs.getString("giveBook")); // Assuming "giveBook" is of type String; adjust as needed.
            ketqua.add(rsbook);
        }
        con.close();
    } catch(Exception c) {
        c.printStackTrace();
    }
    return ketqua;
}
 public ArrayList<registerBook> selectByIDN(registerBook t) {
         ArrayList<registerBook> ketqua = new ArrayList<registerBook>();
    try {
        // Create connection
        Connection con = JDBCUtil.getConnection();
        // Create statement
        Statement st = con.createStatement();
        // Execute SQL query
        String sql = "SELECT * from registerbook where studentId='"+t.getStudentId()+"'";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            registerBook rsbook = new registerBook();
            // Assuming these are the columns in your "registerbook" table
            rsbook.setStudentId(rs.getString("studentId"));
            rsbook.setBookId(rs.getString("bookId"));
            rsbook.setAmountBook(rs.getInt("amount"));
            rsbook.setBorrowDate(rs.getDate("borrowDate"));
            rsbook.setAppointDate(rs.getDate("appointDate"));
            rsbook.setPayDate(rs.getDate("payDate"));
            rsbook.setGiveBookBack(rs.getString("giveBook")); // Assuming "giveBook" is of type String; adjust as needed.
            ketqua.add(rsbook);
        }
        con.close();
    } catch(Exception c) {
        c.printStackTrace();
    }
    return ketqua;
}
  public ArrayList<registerBook> selectByIDS(Student t) {
         ArrayList<registerBook> ketqua = new ArrayList<registerBook>();
    try {
        // Create connection
        Connection con = JDBCUtil.getConnection();
        // Create statement
        Statement st = con.createStatement();
        // Execute SQL query
        String sql = "SELECT * from registerbook where studentId='"+t.getStudentId()+"'";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            registerBook rsbook = new registerBook();
            // Assuming these are the columns in your "registerbook" table
            rsbook.setStudentId(rs.getString("studentId"));
            rsbook.setBookId(rs.getString("bookId"));
            rsbook.setAmountBook(rs.getInt("amount"));
            rsbook.setBorrowDate(rs.getDate("borrowDate"));
            rsbook.setAppointDate(rs.getDate("appointDate"));
            rsbook.setPayDate(rs.getDate("payDate"));
            rsbook.setGiveBookBack(rs.getString("giveBook")); // Assuming "giveBook" is of type String; adjust as needed.
            ketqua.add(rsbook);
        }
        con.close();
    } catch(Exception c) {
        c.printStackTrace();
    }
    return ketqua;
}
    @Override
   public ArrayList<registerBook> selectAll() {
    ArrayList<registerBook> ketqua = new ArrayList<registerBook>();
    try {
        // Create connection
        Connection con = JDBCUtil.getConnection();
        // Create statement
        Statement st = con.createStatement();
        // Execute SQL query
        String sql = "SELECT * from registerbook";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()) {
            registerBook rsbook = new registerBook();
            // Assuming these are the columns in your "registerbook" table
            rsbook.setStudentId(rs.getString("studentId"));
            rsbook.setBookId(rs.getString("bookId"));
            rsbook.setAmountBook(rs.getInt("amount"));
            rsbook.setBorrowDate(rs.getDate("borrowDate"));
            rsbook.setAppointDate(rs.getDate("appointDate"));
            rsbook.setPayDate(rs.getDate("payDate"));
            rsbook.setGiveBookBack(rs.getString("giveBook")); // Assuming "giveBook" is of type String; adjust as needed.
            ketqua.add(rsbook);
        }
        con.close();
    } catch(Exception c) {
        c.printStackTrace();
    }
    return ketqua;
}
    
}
