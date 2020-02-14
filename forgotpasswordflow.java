import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class forgotpasswordflow extends launch{
	static String userid = "User105";
	@Test (priority=16)
	
	public static void forgotpassword () throws MalformedURLException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElementsByClassName("android.view.View").get(1);
		driver.findElementByAndroidUIAutomator("text(\"パスワードを忘れた場合\")").click();
		Thread.sleep(1000);
		try {

			driver.findElementByXPath("//android.widget.EditText[@index='1']").click();
			Thread.sleep(5000);

			driver.getKeyboard().sendKeys("User105");

			//driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("1223");
			System.out.println("message sent");
			

		} 
		
		catch (Exception e) 
		{
	       
			System.out.println(e);
			driver.findElementByXPath("//android.widget.EditText[@index='1']").click();
			Thread.sleep(5000);

			driver.findElementByXPath("//android.widget.EditText[@index='1']").sendKeys("User105");
			//driver.getKeyboard().sendKeys("BS00000421");
			System.out.println("jjj");
		}
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("text(\"送 信\")").click();
		
		System.out.println("mail sent message must be displayed");
		
		}
	
		
		
		
		
	}