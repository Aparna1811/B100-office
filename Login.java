
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class Login extends launch {
	

	//public AndroidDriver<AndroidElement> driver;
		//Valid flow
		@Test (priority=1)
		public static void verifylogin () throws MalformedURLException, InterruptedException {
			
			//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			Thread.sleep(5000);
			try {

				driver.findElementByXPath("//android.widget.EditText[@index='0']").click();
				Thread.sleep(5000);

				driver.getKeyboard().sendKeys("User145");
				driver.hideKeyboard();

				//driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("1223");
				System.out.println("Login successful");
				

			} 
			
			catch (Exception e) 
			{
		       
				System.out.println(e);
				driver.findElementByXPath("//android.widget.EditText[@index='0']").click();
				Thread.sleep(5000);

				driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("User145");
				driver.hideKeyboard();
				//driver.getKeyboard().sendKeys("BS00000421");
				System.out.println("jjj");
			}
			try {
				//driver.findElementByXPath("//android.widget.EditText[@index='1']").click();
				 //driver.findElementByAndroidUIAutomator("text(\"パスワード\")").click();
				driver.findElementByXPath("//android.widget.EditText[@index='1']").click();
				Thread.sleep(5000);

				driver.getKeyboard().sendKeys("User@12345");
				driver.hideKeyboard();

				//driver.findElementByXPath("//android.widget.EditText[@index='1']").sendKeys("admin1234");
			} 
			catch (Exception e) {
				//driver.findElementByXPath("//android.widget.EditText[@index='1']").sendKeys("admin1234");
				driver.getKeyboard().sendKeys("User@12345");
				driver.hideKeyboard();
			}
			driver.findElementByAndroidUIAutomator("text(\"ログイン\")").click();
			Thread.sleep(5000);
			WebElement result= driver.findElementByXPath("//android.view.View[@index='1']");
			Assert.assertEquals(result.getText(), "トップ");
			System.out.println("Home screen is displayed");
		}
}
	

