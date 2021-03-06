
import com.philips.lighting.hue.sdk.PHHueSDK;
import com.philips.lighting.model.PHBridge;
import com.philips.lighting.model.PHLightState;
import java.util.Random;

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
    
    //changes the color for all bulbs on the network
    public void ChangeColorAll(int hueNumber, int brightness)   {
        PHBridge bridge = PHHueSDK.getInstance().getSelectedBridge();
        PHLightState lightState = new PHLightState();
        
        PHHueSDK phHueSDK = PHHueSDK.getInstance();
       
        lightState.setHue(hueNumber);
        lightState.setBrightness(brightness);
        lightState.setOn(Boolean.TRUE);
        lightState.setTransitionTime(6);
        

        bridge.setLightStateForDefaultGroup(lightState);
        System.out.println("ChangeColorAll Called");
    }
    
    //turns off all of the lights on the network
    public void lightsOff() {
        PHBridge bridge = PHHueSDK.getInstance().getSelectedBridge();
        PHLightState lightState = new PHLightState();
        lightState.setOn(false);
        bridge.setLightStateForDefaultGroup(lightState);
    }
    
    //turns on all of the bulbs on the network and sets them to the color of incandecant bulbs
    public void randomColor(int brightness)   {
        PHBridge bridge = PHHueSDK.getInstance().getSelectedBridge();
        PHLightState lightState = new PHLightState();
        lightState.setOn(true);
        lightState.setBrightness(brightness);
        //generates a random HUE code to set the bulbs to a random color
        Random rand = new Random();
        lightState.setHue(rand.nextInt(65535));
        
        bridge.setLightStateForDefaultGroup(lightState);
    }
    
}
