
import java.awt.BorderLayout;
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
    
    public void HomeScreen()    {
        hs = new HomeSelection();
        hs.HomeSelection();
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(hs,"Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640,480);
        setVisible(true);
        hs.setVisible(true);
        
        
    }
}
