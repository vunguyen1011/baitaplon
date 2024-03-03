/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import com.mysql.cj.xdevapi.Result;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;
import model.JDBCUtil;
import java.sql.ResultSet;


/**
 *
 * @author Admin
 */
public class DAObook implements DAOinterface<Book>{
    public static DAObook getInstance(){
        return new DAObook();
        
    }
@Override
public int insert(Book t) {
    try {
        // Establish a connection to the database
        Connection c = JDBCUtil.getConnection();
        // Create a statement object
        Statement st = c.createStatement();
        // Execute the SQL query
       String sql = "INSERT INTO book (bookId, nameB, category, author, producer, price, count) " +
             "VALUES ('" + t.getBookId() + "', '" + t.getName() + "', '" + t.getCategory() + "', '" +
             t.getAuthor() + "', '" + t.getProducer() + "', " + t.getPrice() + ", " + t.getAmount() + ")";


        int ketqua = st.executeUpdate(sql);
        c.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 1;
}


    @Override
    public int  update(Book t) {
          try {
        // Establish a connection to the database
        Connection c = JDBCUtil.getConnection();
        // Create a statement object
        Statement st = c.createStatement();
        // Execute the SQL query
        String sql = "UPDATE book SET " +
             
             "nameB='" + t.getName() + "', " +
             "category='" + t.getCategory() + "', " +
             "author='" + t.getAuthor() + "', " +
             "producer='" + t.getProducer() + "', " +
             "price=" + t.getPrice() + ", " +
             "count=" + t.getAmount() + 
             " WHERE bookId= '" + t.getBookId()+"'";
             

        int ketqua = st.executeUpdate(sql);
         c.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
        return 1;
    }

    @Override

public int delete(Book b){
    try {
        // Establish a connection to the database
        Connection c = JDBCUtil.getConnection();
        // Create a statement object
        Statement st = c.createStatement();
        // Execute the SQL query
        String sql = "DELETE FROM book WHERE bookId= '" + b.getBookId() + "'";
        int ketqua = st.executeUpdate(sql);
        c.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}
 
      
    @Override
    public ArrayList<Book> selectByID(Book t) {
         ArrayList<Book> ketqua=new ArrayList<Book>();
        try{
            Connection c=JDBCUtil.getConnection();
            Statement st=c.createStatement();
            String sql="Select * from book where bookId='"+t.getBookId()+"'";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            Book book = new Book();
            book.setBookId(rs.getString("bookId"));
            book.setName(rs.getString("nameB"));
            book.setCategory(rs.getString("category"));
            book.setAuthor(rs.getString("author"));
            book.setProducer(rs.getString("producer"));
            book.setPrice(rs.getFloat("price"));
            book.setAmount(rs.getInt("count"));
            ketqua.add(book);
            }
            c.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return ketqua;
        
    }
    public ArrayList<Book> selectByName(Book t) {
         ArrayList<Book> ketqua=new ArrayList<Book>();
        try{
            Connection c=JDBCUtil.getConnection();
            Statement st=c.createStatement();
            String sql="Select * from book where nameB='"+t.getName()+"'";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            Book book = new Book();
            book.setBookId(rs.getString("bookId"));
            book.setName(rs.getString("nameB"));
            book.setCategory(rs.getString("category"));
            book.setAuthor(rs.getString("author"));
            book.setProducer(rs.getString("producer"));
            book.setPrice(rs.getFloat("price"));
            book.setAmount(rs.getInt("count"));
            ketqua.add(book);
            }
            c.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return ketqua;
        
    }

    @Override
    public ArrayList<Book> selectAll() {
        ArrayList<Book> ketqua=new ArrayList<Book>();
        try{
            //taọ kết nối
            Connection con=JDBCUtil.getConnection();
            // tạo  statement
            Statement st=con.createStatement();
            //thực hiện câu lệnh sql
            String sql= "SELECT * from book";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            Book book = new Book();
            book.setBookId(rs.getString("bookId"));
            book.setName(rs.getString("nameB"));
            book.setCategory(rs.getString("category"));
            book.setAuthor(rs.getString("author"));
            book.setProducer(rs.getString("producer"));
            book.setPrice(rs.getFloat("price"));
            book.setAmount(rs.getInt("count"));
            ketqua.add(book);
            }
            con.close();
            
            
        }catch(Exception c){
            c.printStackTrace();
        }
          return ketqua;
    }

   
   

}
