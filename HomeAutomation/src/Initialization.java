
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
    ConnectBridge cb;
    
    public void Initialization()    {
        //Debug
        System.out.println("Initialization Has Been Called");
        
        //Puts the application on the Philips HUE whitelist
        PHHueSDK phHueSDK = PHHueSDK.getInstance();
        phHueSDK.setAppName("Collegian Controller");     
        phHueSDK.setDeviceName("Mac Mini");  
       
        
        cb = new ConnectBridge();
        cb.ConnectBridge();
    }
}
