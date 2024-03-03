/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.Student;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import model.JDBCUtil;
import java.sql.ResultSet;
import model.Student;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
/**
 *
 * @author Admin
 */
public class DAOstudent implements DAOinterface<Student> {
     public static DAOstudent getInstance(){
         return new DAOstudent();
     }
    @Override
    public int insert(Student t) {
        try{
        // tạo ra kết nối
        Connection con=JDBCUtil.getConnection();
        // tạo ra statement 
        Statement st=  con.createStatement();
        // thực hiện câu lệnh sql
     SimpleDateFormat mysqlSdf = new SimpleDateFormat("yyyy-MM-dd");
    String mysqlDob = mysqlSdf.format(t.getDob());

String sql = "INSERT INTO student (studenId, nameS, gender, birthdayS, class, address, major, phone, mail, passwd)" +
             "VALUES ('" + t.getStudentId() + "', '" + t.getName() + "', '" + t.getGender() + "', '" + mysqlDob + "', '" + t.getClassRoon()+ "', '" + t.getAddress() + "', '" + t.getMajor() + "', '" + t.getPhone() + "', '" + t.getEmail()+ "', '" + t.getPassword() + "')";
        int ketqua=st.executeUpdate(sql);
        }catch(Exception e){
            e.printStackTrace();
        }
        return 1;
    }

    @Override
 public int update(Student t) {
    try {
        // Thiết lập kết nối đến cơ sở dữ liệu
        Connection c = JDBCUtil.getConnection();
        // Tạo đối tượng statement
        Statement st = c.createStatement();
        // Thực thi truy vấn SQL
        java.sql.Date sqlDate = new java.sql.Date(t.getDob().getTime());
        String sql = "UPDATE student SET " +
                     "nameS='" + t.getName() + "'," +
                     "gender='" + t.getGender() + "'," +
                     "birthdayS='" + sqlDate+ "'," +
                     "class='" + t.getClassRoon()+ "'," +
                     "address='" + t.getAddress() + "'," +
                     "major='" + t.getMajor() + "'," +
                     "phone='" + t.getPhone()  +"'," +
                     "mail='"  +t.getEmail()+  "'," +
                     "passwd='"  +t.getPassword()+  "' " +
                     "WHERE studenId='" + t.getStudentId() + "'"; 
        st.executeUpdate(sql);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 1;
}

    @Override
    public int delete(Student t) {
         try {
        // Establish a connection to the database
        Connection c = JDBCUtil.getConnection();
        // Create a statement object
        Statement st = c.createStatement();
        // Execute the SQL query
        String sql = "DELETE FROM student WHERE studenId= '" + t.getStudentId() + "'";
        int ketqua = st.executeUpdate(sql);
        c.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 1;
    }

    @Override
public ArrayList<Student> selectByID(Student t) {
    ArrayList<Student> ketqua = new ArrayList<Student>();
    try {
        // Establish a connection to the database
        Connection c = JDBCUtil.getConnection();
        // Create a SQL query
        String sql = "SELECT * FROM student WHERE studenid = ?";
        // Create a PreparedStatement object
        PreparedStatement ps = c.prepareStatement(sql);
        // Set the parameter
        ps.setString(1, t.getStudentId());
        // Execute the SQL query
        ResultSet rs = ps.executeQuery();
        // Process the result set
        while (rs.next()) {
            // Create a new Student object and add it to the list
            Student s = new Student();
            s.setStudentId(rs.getString("studenId"));
            s.setName(rs.getString("nameS"));
            s.setGender(rs.getString("gender"));
            s.setDob(rs.getDate("birthdayS"));
            s.setClassRoon(rs.getString("class"));
            s.setAddress(rs.getString("address"));
            s.setMajor(rs.getString("major"));
            s.setPhone(rs.getString("phone"));
            s.setEmail(rs.getString("mail"));
            s.setPassword(rs.getString("passwd"));

            ketqua.add(s);
        }
        // Close the connection
        c.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return ketqua;
}
public ArrayList<Student> selectByName(Student t) {
    ArrayList<Student> ketqua = new ArrayList<Student>();
    try {
        // Establish a connection to the database
        Connection c = JDBCUtil.getConnection();
        // Create a SQL query
        String sql = "SELECT * FROM student WHERE nameS = ?";
        // Create a PreparedStatement object
        PreparedStatement ps = c.prepareStatement(sql);
        // Set the parameter
        ps.setString(1, t.getName());
        // Execute the SQL query
        ResultSet rs = ps.executeQuery();
        // Process the result set
        while (rs.next()) {
            // Create a new Student object and add it to the list
            Student s = new Student();
            s.setStudentId(rs.getString("studenId"));
            s.setName(rs.getString("nameS"));
            s.setGender(rs.getString("gender"));
            s.setDob(rs.getDate("birthdayS"));
            s.setClassRoon(rs.getString("class"));
            s.setAddress(rs.getString("address"));
            s.setMajor(rs.getString("major"));
            s.setPhone(rs.getString("phone"));
            s.setEmail(rs.getString("mail"));
            s.setPassword(rs.getString("passwd"));

            ketqua.add(s);
        }
        // Close the connection
        c.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return ketqua;
}
public ArrayList<Student> selectByClass(Student t) {
    ArrayList<Student> ketqua = new ArrayList<Student>();
    try {
        // Establish a connection to the database
        Connection c = JDBCUtil.getConnection();
        // Create a SQL query
        String sql = "SELECT * FROM student WHERE class = ?";
        // Create a PreparedStatement object
        PreparedStatement ps = c.prepareStatement(sql);
        // Set the parameter
        ps.setString(1, t.getClassRoon());
        // Execute the SQL query
        ResultSet rs = ps.executeQuery();
        // Process the result set
        while (rs.next()) {
            // Create a new Student object and add it to the list
            Student s = new Student();
            s.setStudentId(rs.getString("studenId"));
            s.setName(rs.getString("nameS"));
            s.setGender(rs.getString("gender"));
            s.setDob(rs.getDate("birthdayS"));
            s.setClassRoon(rs.getString("class"));
            s.setAddress(rs.getString("address"));
            s.setMajor(rs.getString("major"));
            s.setPhone(rs.getString("phone"));
            s.setEmail(rs.getString("mail"));
            s.setPassword(rs.getString("passwd"));

            ketqua.add(s);
        }
        // Close the connection
        c.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return ketqua;
}
    
    
    public ArrayList<Student> selectByEmail(Student t) {
    ArrayList<Student> ketqua = new ArrayList<Student>();
    try {
        // Establish a connection to the database
        Connection c = JDBCUtil.getConnection();
        // Create a SQL query
        String sql = "SELECT * FROM student WHERE mail = ?";
        // Create a PreparedStatement object
        PreparedStatement ps = c.prepareStatement(sql);
        // Set the parameter
        ps.setString(1, t.getEmail());
        // Execute the SQL query
        ResultSet rs = ps.executeQuery();
        // Process the result set
        while (rs.next()) {
            // Create a new Student object and add it to the list
            Student s = new Student();
            s.setStudentId(rs.getString("studenId"));
            s.setName(rs.getString("nameS"));
            s.setGender(rs.getString("gender"));
            s.setDob(rs.getDate("birthdayS"));
            s.setClassRoon(rs.getString("class"));
            s.setAddress(rs.getString("address"));
            s.setMajor(rs.getString("major"));
            s.setPhone(rs.getString("phone"));
            s.setEmail(rs.getString("mail"));
            s.setPassword(rs.getString("passwd"));

            ketqua.add(s);
        }
        // Close the connection
        c.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return ketqua;
}

    @Override
       public ArrayList<Student> selectAll() {
    ArrayList<Student> ketqua = new ArrayList<Student>();
    try {
        //taọ kết nối
        Connection con = JDBCUtil.getConnection();
        // tạo  statement
        Statement st = con.createStatement();
        //thực hiện câu lệnh sql
        String sql= "SELECT * from student";
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()) {
            Student s = new Student();
            s.setStudentId(rs.getString("studenId"));
            s.setName(rs.getString("nameS"));
            s.setGender(rs.getString("gender"));
            s.setDob(rs.getDate("birthdayS"));
            s.setClassRoon(rs.getString("class"));
            s.setAddress(rs.getString("address"));
            s.setMajor(rs.getString("major"));
            s.setPhone(rs.getString("phone"));
            s.setEmail(rs.getString("mail"));
            s.setPassword(rs.getString("passwd"));

            ketqua.add(s);
        }
        
        con.close();

    } catch(Exception c) {
       c.printStackTrace();
    }
    
    return ketqua;
}

}
