/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */


import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Lighting extends JFrame {
    LightingPanel lp;
    public void Ligting()    {
        lp = new LightingPanel();
        lp.setSize(640,480);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(lp,"Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

}