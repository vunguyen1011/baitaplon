/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class introcontroler implements ActionListener{
    public Intro it;

    public introcontroler(Intro it) {
        this.it = it;
    }

   
    
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==it.getSinhvien()|| e.getSource()==it.getAdmin()){
            dangnhap dn=new dangnhap();
            dn.setVisible(true);
            it.dispose();
        }
        
    }
    
}
