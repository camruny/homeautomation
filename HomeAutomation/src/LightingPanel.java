
import com.philips.lighting.model.PHBridge;
import com.philips.lighting.model.PHLightState;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
public class LightingPanel extends JPanel implements ActionListener {
    JButton allLightsOn;
    JButton allLightsOff;
    
    ChangeColor changeColor;
    
    public void LightingPanel() {
        allLightsOn = new JButton("All On");
        allLightsOn.addActionListener(this);
        add(allLightsOn);
        
        allLightsOff = new JButton("All Lights Off");
        allLightsOff.addActionListener(this);
        add(allLightsOff);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == allLightsOn)  {
            changeColor = new ChangeColor();
            changeColor.ChangeColor(12345);
        }
        
        if(obj == allLightsOff)  {
            System.out.println("Lights Off Pressed");
        }
    }
    
    
    
}
