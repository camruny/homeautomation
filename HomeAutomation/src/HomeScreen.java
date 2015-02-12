
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */
public class HomeScreen extends JFrame {
    HomeSelection hs;
    LightingPanel lp;
    
    public void HomeScreen()    {
        hs = new HomeSelection();
        hs.HomeSelection();
        getContentPane().setLayout(new GridLayout());
        getContentPane().add(hs);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640,480);
        setVisible(true);
        hs.setVisible(true);
        
        lp = new LightingPanel();
        lp.LightingPanel();
        getContentPane().add(lp);
        setVisible(true);
        lp.setVisible(true);
        
        
    }
}
