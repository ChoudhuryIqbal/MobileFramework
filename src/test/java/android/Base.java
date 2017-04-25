package android;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	
	public static void main(String[]args){
		
		File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setCapability(MobileCapability.De, value);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Iqbal");
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		AndroidDriver ad=new AndroidDriver( connectionToServerLink, cap);
		//lets stops here
		
		
	}

}
