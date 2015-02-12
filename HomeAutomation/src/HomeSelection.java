
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */
public class HomeSelection extends JPanel implements ActionListener {
    JButton settings;
    JButton lighting;
    Settings set;
    LightingPanel light;
    
    public void HomeSelection() {
        settings = new JButton("Settings");
        settings.addActionListener(this);
        add(settings);
        settings.setVisible(true);
        
        lighting = new JButton("Lighting Controls");
        lighting.addActionListener(this);
        add(lighting);
        lighting.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == settings) {
            System.out.println("Settins Button Clicked from Selection Panel");
            set = new Settings();
            
        }
        
        if(obj == lighting) {
            System.out.println("Lighting Button clicked from Selection Panel");
            
        }
    }
    
}
