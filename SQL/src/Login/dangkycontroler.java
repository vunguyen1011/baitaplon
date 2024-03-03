package Login;

import DAO.DAOstudent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException; // Sửa ở đây
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Student;

public class dangkycontroler implements ActionListener {
    public dangky View;

    public dangkycontroler(dangky View) {
        this.View = View;
    }
    
    @Override
 public void actionPerformed(ActionEvent e) {
    if(e.getSource()==View.getDangkydk()){
        Student newStudent=new Student();
        newStudent.setEmail(View.gettEmail().getText());
        newStudent.setName(View.gettTensinhvien().getText());
        newStudent.setPhone(View.gettSDT().getText());
        newStudent.setStudentId(View.getTmsv().getText());
        
        // Chuyển đổi ngày sinh
        String dob = View.gettDate().getText();
        SimpleDateFormat fromUser = new SimpleDateFormat("yyyy-MM-dd"); // Định dạng ngày tháng của bạn
        try {
            Date reformattedStr = fromUser.parse(dob);
            newStudent.setDob(reformattedStr);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        DAOstudent.getInstance().insert(newStudent);
        dangnhap n=new dangnhap();
        JOptionPane.showMessageDialog(View, "Đăng ký thành công");
        n.setVisible(true);
        View.dispose();
    }
    if(e.getSource()==View.getjButton1()){
        dangnhap dn=new dangnhap();
        dn.setVisible(true);
        View.dispose();
    }
}
}
