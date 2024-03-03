/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
public class JDBCUtil {
    public static Connection getConnection(){
        Connection c=null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url="jdbc:mySql://localhost:3306/qltv";
            String usernam="root";
            String password="";
            // tạo kết nối 
            c=DriverManager.getConnection(url, usernam, password);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
        
    
    }
    public static void closeConenection(Connection  c){
        
        try{
            if(c!=null){
                c.close();
            }
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
    }
     
}
