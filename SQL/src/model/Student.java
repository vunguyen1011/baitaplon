/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Student extends person {
    private String studentId;
    private String classRoon;
    private String major;
    private String email;
    private String password = "tlu123";
    
    

      public Student() {
       
    }

    
        public Student(String studentId, String classRoon, String major, String email) {
        this.studentId = studentId;
        this.classRoon = classRoon;
        this.major = major;
        this.email = email;
        this.password = password;
      
    }
           public Student(String studentId, String classRoon, String major, String email,
            String name, Date dob,
            String address, String phone, String gender, String password) {
        super(name, dob, address, phone, gender);
        this.studentId = studentId;
        this.classRoon = classRoon;
        this.major = major;
        this.email = email;
        this.password = password;
     
    }
           
    public Student(String studentId, String password) {
        this.studentId = studentId;
        this.password = password;
    
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassRoon() {
        return classRoon;
    }

    public void setClassRoon(String classRoon) {
        this.classRoon = classRoon;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
//    public void setEmail(String email) throws InValidEmailException {
//        DataSTInValidException sTInValid = new DataSTInValidException();
//        if (sTInValid.invalidEmail(email)) {
//            this.email = email;
//        }
//
//    }

    @Override
    
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", classRoon=" + classRoon + ", major=" + major + ", email=" + email + ", password=" + password + '}';
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Student st = (Student) obj;
    return Objects.equals(studentId, st.getStudentId());
}  
    
}
