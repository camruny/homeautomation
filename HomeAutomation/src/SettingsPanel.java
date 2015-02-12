
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
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
public class SettingsPanel extends JPanel implements ActionListener {
    JButton submit;
    JButton close;
    JTextField enteredIP;
    String bridgeIP;
    HomeScreen hs;
    
    public SettingsPanel()   {
        System.out.println("Settings has been called");
        
        enteredIP = new JTextField("Enter Bridge IP");
        add(enteredIP);
        
        submit = new JButton ("Submit");
        submit.addActionListener(this);
        add(submit);
        
        close = new JButton ("Close");
        close.addActionListener(this);
        add(close);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == submit)   {
            System.out.println("Submit was Clicked");
            bridgeIP = enteredIP.getText();
            System.out.println(bridgeIP);
        }
        
        if(obj == close)    {
            
            
        }
    }
}
