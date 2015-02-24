
import com.philips.lighting.hue.sdk.PHHueSDK;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */
public class Initialization {
       
    public void Initialization()   {
        
        //Puts the application on the Philips HUE whitelist
        PHHueSDK phHueSDK = PHHueSDK.getInstance();
        phHueSDK.setAppName("Collegian Controller");     
        phHueSDK.setDeviceName("Mac Mini");  
        
        ConnectBridge cb = new ConnectBridge();
        cb.ConnectBridge();
    }
    
}
