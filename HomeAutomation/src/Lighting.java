/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */


import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Lighting {
    //Buttons for the scenes
    JButton allOn;
    JButton allOff;
    JButton relax;
    JButton watchTV;
    
    public Lighting()   {
        
        
        allOn = new JButton("All On");
        allOn.addActionListener((ActionListener) this);
        
        allOff = new JButton("All Off");
        allOff.addActionListener((ActionListener) this);
        
        relax = new JButton("Relax");
        relax.addActionListener((ActionListener) this);
        
        watchTV = new JButton("Watch TV");
        watchTV.addActionListener((ActionListener) this);
        
    }
    
     public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj==allOn)  {
            AllOn();
        }
        if(obj==allOff)  {
            AllOff();
        }
        if(obj==relax)  {
            Relax();
        }
        if(obj==watchTV)    {
            WatchTV();
        }
     }
     
     public void WatchTV()  {
         //Code to set lights to Watch TV mode here
     }
     
     public void AllOn()    {
         //Code to turn all lights on here
     }
     public void AllOff()   {
         //Code to turn all lights off here
     }
     public void Relax()  {
         //Code to set lights to Relax Mode here
     }
        
}
