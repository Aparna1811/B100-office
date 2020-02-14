import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class launch {

	//public AndroidDriver<AndroidElement> driver;
	public static AndroidDriver  driver;

//	public static  AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
//
//		// TODO Auto-generated method stub
//		File f=new File("src");
//		File fs=new File(f,"app-debug (1).apk");
//		DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"XUV3Y18917007993");
//        cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
//        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
//        AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
//        return driver;
//	}
	
	@BeforeSuite
    public void launnApplication() throws MalformedURLException, InterruptedException{
       File f=new File("src");
	File fs=new File(f,"brain100-dev_V.0.0.19.apk");
	DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY2242RQS4");
    cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
   driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
    Thread.sleep(10000);
}
}
