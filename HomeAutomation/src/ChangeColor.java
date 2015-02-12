
import com.philips.lighting.hue.sdk.PHHueSDK;
import com.philips.lighting.model.PHBridge;
import com.philips.lighting.model.PHLightState;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */
public class ChangeColor {
    int colorCode = 00000;
    ConnectBridge cb;
    PHHueSDK phHueSDK = PHHueSDK.getInstance();

    public void ChangeColor(int informedColorCode)  {
        colorCode = informedColorCode;
       
        System.out.println("Change Color Called");
        
     
         
        sendToBridge();
        
        
    }
    
    public void sendToBridge()  {
        
        PHLightState lightState = new PHLightState();
        lightState.setBrightness(0);
    }
    
}
