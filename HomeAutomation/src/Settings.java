
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */
public class Settings extends JFrame {
   SettingsPanel sp;
    
    public Settings()   {
        sp = new SettingsPanel();
        sp.setSize(640,480);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(sp,"Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
       
    }


    
    
}
