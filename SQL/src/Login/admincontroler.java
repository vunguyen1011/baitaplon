/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.bookView;
import view.registerBookView;
import view.studenView;
import Login.adminform;

/**
 *
 * @author Admin
 */
public class admincontroler implements ActionListener{
    public adminform View;

    public admincontroler(adminform View) {
        this.View = View;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==View.getQlhs()){
            studenView sV=new studenView();
            sV.setVisible(true);
            View.dispose();
        }
        if(e.getSource()==View.getQls()){
            bookView bV=new bookView();
            bV.setVisible(true);
            View.dispose();
        }
        if(e.getSource()==View.getQlmt()){
            registerBookView rsV=new registerBookView();
            rsV.setVisible(true);
            View.dispose();
        }
        if(e.getSource()==View.getThoat()){
            Intro iT=new Intro();
            iT.setVisible(true);
            View.dispose();
        }
    }
    
    
}
