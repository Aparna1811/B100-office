import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class servicemenu extends launch{
	
	@Test (priority=1)
	public static void verifyclickservicemenu () throws MalformedURLException, InterruptedException {
		
				// Service menu - click and assert on service detail screen
				driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
				//driver.findElementByXPath("//android.widget.ImageView[@text='タブ: 2/5']").click();
				driver.findElementsByClassName("android.view.View").get(1);
				driver.findElementByAndroidUIAutomator("text(\"タブ: 2/5\")").click();
				WebElement result1= driver.findElementByXPath("//android.view.View[@index='1']");
				Assert.assertEquals(result1.getText(), "サービス一覧");
				System.out.println("navigated to service listing screen");
//				Thread.sleep(3000);
//		        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"高脂血症\"));");
//		        Thread.sleep(15000);
//				System.out.println("scroll worked");

	}
	@Test (priority=2)
	public void servicecase2() throws MalformedURLException, InterruptedException {
				
				// service menu - click and assert on particular service and close the detail screen 
				driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
				driver.findElementByXPath("//android.widget.ImageView[@index='2']").click();

				//driver.findElementByXPath("//android.widget.ImageView[@index='1']").click();
//		        WebElement result2= driver.findElementByAndroidUIAutomator("text(\"有酸素運動\")");
//				Assert.assertEquals(result2.getText(), "有酸素運動");
				System.out.println("navigated to details screen");
				driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	@Test (priority=3)
	public void servicecase3() throws MalformedURLException, InterruptedException {

				//service menu - click on close button 
				driver.findElementByXPath("//android.widget.ImageView[@index='1']").click();
				
				// service menu - click on particular service and close the detail screen 
					}
}






