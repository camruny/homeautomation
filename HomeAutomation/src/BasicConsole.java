import java.util.List;
import java.util.Random;

import com.philips.lighting.hue.sdk.PHAccessPoint;
import com.philips.lighting.hue.sdk.PHHueSDK;
import com.philips.lighting.hue.sdk.PHSDKListener;
import com.philips.lighting.model.PHBridge;
import com.philips.lighting.model.PHHueParsingError;
import com.philips.lighting.model.PHLightState;

/*
 *  A little program to connect to a bridge and change your lights.   It intended as a 'quick start' way to get programming using the Java SDK.
 *  
 * 
 *  You will need huelocalsdk.jar and huesdkresources.jar  in your classpath,  these can be found:
 *  https://github.com/PhilipsHue/PhilipsHueSDK-Java-MultiPlatform-Android/tree/master/QuickStartApp/libs
 *
 */
public class BasicConsole {
    private PHHueSDK phHueSDK; 
    private static String ipAddress = "192.168.1.5";   // Change this to the IP Address of your bridge.
    private static String username  = "newdeveloper";  // All hue developer kits provided at hackathons should have this username already in the whitelist.  If not see: http://www.developers.meethue.com/documentation/getting-started 

    public static void main(String[] args) {
        BasicConsole basicConsole =  new BasicConsole();

        basicConsole.phHueSDK = PHHueSDK.getInstance();
        basicConsole.phHueSDK.getNotificationManager().registerSDKListener(basicConsole.listener);

        PHAccessPoint ap = new PHAccessPoint();
        ap.setIpAddress(ipAddress);
        ap.setUsername(username);

        basicConsole.phHueSDK.connect(ap);

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

            randomizeLights(b);
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
    
	// A simple method to set the lights to a random colour,  feel free to experiment with different light state attributes and bridge commands.
    public void randomizeLights(PHBridge bridge) {
       Random rand= new Random();
       PHLightState lightState = new PHLightState();
       lightState.setHue(rand.nextInt(65535));
       
       bridge.setLightStateForDefaultGroup(lightState);
	  
	  // Note:  To get/view bridge data, use the bridge resource cache,    e.g.  bridge.getResourceCache().getAllLights()
	   
    }
}
