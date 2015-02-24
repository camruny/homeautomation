
import com.philips.lighting.hue.listener.PHLightListener;
import com.philips.lighting.hue.sdk.PHHueSDK;
import com.philips.lighting.model.PHBridge;
import com.philips.lighting.model.PHBridgeResource;
import com.philips.lighting.model.PHHueError;
import com.philips.lighting.model.PHLight;
import com.philips.lighting.model.PHLightState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    
    public void ChangeColorAll(int lightNumber, int brightness)   {
        PHBridge bridge = PHHueSDK.getInstance().getSelectedBridge();
        PHLightState lightState = new PHLightState();
       
        lightState.setHue(lightNumber);
        lightState.setBrightness(brightness);

        bridge.setLightStateForDefaultGroup(lightState);
        System.out.println("ChangeColorAll Called");
    }
    
    public void lightsOff() {
        PHBridge bridge = PHHueSDK.getInstance().getSelectedBridge();
        PHLightState lightState = new PHLightState();
        lightState.setOn(false);
        bridge.setLightStateForDefaultGroup(lightState);
    }
    
}
