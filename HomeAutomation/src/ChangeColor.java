
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
    int colorCode = 00000;
    ConnectBridge cb;
    
    //Starts the Hue SDK
    PHHueSDK phHueSDK = PHHueSDK.getInstance();
    
    //Gets the current bridge configuration
    PHBridge bridge = phHueSDK.getSelectedBridge();
    
    List<PHLight> allLights = bridge.getResourceCache().getAllLights();
    
    PHLightListener listener = new PHLightListener() {

        @Override
        public void onReceivingLightDetails(PHLight phl) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void onReceivingLights(List<PHBridgeResource> list) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void onSearchComplete() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void onSuccess() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void onError(int i, String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void onStateUpdate(Map<String, String> map, List<PHHueError> list) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    public void ChangeColor()  {
        //colorCode = informedColorCode;
       
        System.out.println("Change Color Called");
        
        for(PHLight light : allLights)  {
            PHLightState lightState = new PHLightState();
            lightState.setHue(12345);
            bridge.updateLightState(light, lightState, listener);
        }
     
         
        
        
        
    }
    
    public void sendToBridge()  {
        
       
    }
    
}
