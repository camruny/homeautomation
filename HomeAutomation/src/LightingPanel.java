
import com.philips.lighting.hue.sdk.PHHueSDK;
import com.philips.lighting.model.PHBridge;
import com.philips.lighting.model.PHLightState;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */
public class LightingPanel extends JPanel implements ActionListener, ChangeListener {
    JButton allLightsOn;
    JButton allLightsOff;
    JButton connectBridge;
    
    int minBrightness = 1;
    int maxBrightness = 255;
    
    JSlider brightnessSelection;
    
    ChangeColor changeColor;
    
    int brightness;
    
    PHBridge bridge = PHHueSDK.getInstance().getSelectedBridge();
    
    public void LightingPanel() {
        //Debug
        System.out.println("Lighting Panel Called");
        
        changeColor = new ChangeColor();
        
        
        allLightsOn = new JButton("All On");
        allLightsOn.addActionListener(this);
        add(allLightsOn);
        
        allLightsOff = new JButton("All Lights Off");
        allLightsOff.addActionListener(this);
        add(allLightsOff);
        
        connectBridge = new JButton("Connect Bridge");
        connectBridge.addActionListener(this);
        add(connectBridge);
        
        brightnessSelection = new JSlider(0,255);
        brightnessSelection.setMinorTickSpacing(20);
        brightnessSelection.setMajorTickSpacing(50);
        brightnessSelection.setPaintTicks(true);
        brightnessSelection.setPaintLabels(true);
        add(brightnessSelection);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == allLightsOn)  {
            brightness = brightnessSelection.getValue();
            changeColor.ChangeColorAll(12345, brightness);
        }
        
        if(obj == allLightsOff)  {
            System.out.println("Lights Off Pressed");
            changeColor.lightsOff();
        }
        
        if(obj==connectBridge)  {
            ConnectBridge connect = new ConnectBridge();
            connect.ConnectBridge();
        }
    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
