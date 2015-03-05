
import com.philips.lighting.hue.sdk.PHHueSDK;
import com.philips.lighting.model.PHBridge;
import com.philips.lighting.model.PHLightState;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */
public class Emergency implements ActionListener {
    int delay = 1000;
   Timer lightTimer = new Timer(delay, this);
   ChangeColor change = new ChangeColor();
   
   int lightChange = 1;
   
    public void Emergency() {
        System.out.println("Emergency Called");
        lightTimer.start();
        lightTimer.setDelay(500);
        
       
    }
    
    public void lightsOn()  {
        change.ChangeColorAll(12345, 200);
    }
    
    public void lightsRed() {
        change.ChangeColorAll(65280, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if(obj == lightTimer)   {
            switch (lightChange)    {
                case 1: 
                    change.ChangeColorAll(12345, 200);
                    lightChange = 2;
                    break;
                case 2: 
                    //change.ChangeColorAll(12345, 200);
                    lightChange = 3;
                    break;
                case 3:
                    //change.ChangeColorAll(12345, 200);
                    lightChange = 4;
                    break;
                case 4:
                    change.ChangeColorAll(65280, 200);
                    lightChange = 1;
                    break;
            }
        }
    }
}
