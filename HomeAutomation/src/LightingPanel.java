
import com.philips.lighting.hue.sdk.PHHueSDK;
import com.philips.lighting.hue.sdk.PHHueSDK;
import com.philips.lighting.model.PHBridge;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
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
public class LightingPanel extends JPanel implements ActionListener, ChangeListener {
    //Buttons to turn the lights on or off
    JButton allLightsOn;
    JButton allLightsOff;
    
    //Button to connect the HUE bridge
    JButton connectBridge;
    
    //Button to set the bulbs to a random color
    JButton randomColor;
    
    //Test fucntionality for now
    JButton emergency;
    
    //Text boxes and button to allow the user to enter custom scene
    JSlider hueSelection;
    JButton setHue;
    
    //Sets the min and max brightness allowed by the Hue bulb
    int minBrightness = 1;
    int maxBrightness = 255;
    
    //Slider to allow the user to set the brightness
    JSlider brightnessSelection;
    
    ChangeColor changeColor;
    
    
    int brightness;
    int hue;
    
    PHBridge bridge = PHHueSDK.getInstance().getSelectedBridge();
    
    
    
    public void LightingPanel() {
        //Debug
        System.out.println("Lighting Panel Called");
        
        changeColor = new ChangeColor();
        
        //Adds the lights on button
        allLightsOn = new JButton("All On");
        allLightsOn.addActionListener(this);
        add(allLightsOn);
        
        //Adds the lights off button
        allLightsOff = new JButton("All Lights Off");
        allLightsOff.addActionListener(this);
        add(allLightsOff);
        
        //Adds the connect brige button
        connectBridge = new JButton("Connect Bridge");
        connectBridge.addActionListener(this);
        add(connectBridge);
        
        //Adds the brightness selection slider
        brightnessSelection = new JSlider(0,255);
        brightnessSelection.setMinorTickSpacing(20);
        brightnessSelection.setMajorTickSpacing(50);
        brightnessSelection.setPaintTicks(true);
        brightnessSelection.setPaintLabels(true);
        add(brightnessSelection);
        
        //Adds the random color button
        randomColor = new JButton("Random Color");
        randomColor.addActionListener(this);
        add(randomColor);

        //Test functionality for now
        emergency = new JButton("Emergency");
        emergency.addActionListener(this);
        //add(emergency);
        
        //Adds the Hue selection slider
        hueSelection = new JSlider(0,65000);
        hueSelection.setMinorTickSpacing(1000);
        hueSelection.setMajorTickSpacing(10000);
        hueSelection.setPaintTicks(true);
        add(hueSelection);
        
        //Adds the button to set Hue
        setHue = new JButton("Set Color");
        setHue.addActionListener(this);
        add(setHue);
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
        
        if(obj==randomColor)    {
            //changeColor.randomColor(brightnessSelection.getValue());
            LightColoursFrame lc = new LightColoursFrame();
        }
        
        if(obj == emergency)    {
            //Emergency emergency = new Emergency();
            //emergency.Emergency();
            LightColoursFrame lc = new LightColoursFrame();
        }
        
        if(obj == setHue)   {
            brightness = brightnessSelection.getValue();
            hue = hueSelection.getValue();
            changeColor.ChangeColorAll(hue, brightness);
        }
    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
