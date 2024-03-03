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
public class person {
    
    private String name;
    private Date dob;
    private String address;
    private String phone;
    private String gender;

    public person() {
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public person(String name, Date dob, String address, String phone, String gender) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

//    public void setPhone(String phone) throws InValidPhoneException {
//        DataSTInValidException stvalid = new DataSTInValidException();
//        if(stvalid.invalidPhone(phone)){
//        this.phone = phone;
//        }

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", dob=" + dob + ", address=" + address + ", phone=" + phone + ", gender=" + gender + '}';
    }

//    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
    

