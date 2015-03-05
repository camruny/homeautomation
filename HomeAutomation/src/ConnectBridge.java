
import com.philips.lighting.hue.sdk.PHAccessPoint;
import com.philips.lighting.hue.sdk.PHAccessPoint;
import com.philips.lighting.hue.sdk.PHBridgeSearchManager;
import com.philips.lighting.hue.sdk.PHHueSDK;
import com.philips.lighting.hue.sdk.PHSDKListener;
import com.philips.lighting.model.PHBridge;
import com.philips.lighting.model.PHHueParsingError;
import com.philips.lighting.model.PHLightState;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cameron
 */
public class ConnectBridge {
    private PHHueSDK phHueSDK; 
    private static String ipAddress = "localhost:80";   // Change this to the IP Address of your bridge.
    private static String username  = "newdeveloper";
    
    
    public void ConnectBridge() {
        //Debug
        System.out.println("Connect Bridge Has Been Called"); 
        

        phHueSDK = PHHueSDK.getInstance();
        phHueSDK.getNotificationManager().registerSDKListener(listener);

        PHAccessPoint ap = new PHAccessPoint();
        ap.setIpAddress(ipAddress);
        ap.setUsername(username);

        phHueSDK.connect(ap);
        
        
    }
    
    // Local SDK Listener
    private PHSDKListener listener = new PHSDKListener() {

        @Override
        public void onError(int code, String message)            {  
            System.out.println("On Error.. " + code + " " +  message);  }

        @Override
        public void onCacheUpdated(List<Integer> cacheNotificationsList, PHBridge bridge)     { 
            System.out.println("On cache Updated.."); 
        }

        @Override
        public void onAccessPointsFound(List<PHAccessPoint> accessPoint) {             
            System.out.println("On Access Point Found.");
        }

        @Override
        public void onBridgeConnected(PHBridge b)  {
            System.out.println("********** BRIDGE IS CONNECTED *************");
            phHueSDK.setSelectedBridge(b);
           
        }

        @Override
        public void onAuthenticationRequired(PHAccessPoint accessPoint) {
            System.out.println("On Authentication Required.. Pushlink the bridge");
            phHueSDK.startPushlinkAuthentication(accessPoint);

        }

        @Override
        public void onConnectionResumed(PHBridge bridge) {  System.out.println("On Connection Resumed");  }

        @Override
        public void onConnectionLost(PHAccessPoint accessPoint) {   System.out.println("On Connection Lost"); }

        @Override
        public void onParsingErrors(List<PHHueParsingError> parsingErrors) { }

    };
    
    
    
    
    
}
