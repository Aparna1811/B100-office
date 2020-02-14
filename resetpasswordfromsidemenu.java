import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class resetpasswordfromsidemenu extends launch{
	@Test (priority=10)
	public static void reset () throws MalformedURLException, InterruptedException {
		//case1--when none of the fields are entered
		driver.findElementByAndroidUIAutomator("text(\"パスワードの変更\")").click();
		WebElement result3= driver.findElementByXPath("//android.view.View[@index='1']");
		Assert.assertEquals(result3.getText(), "パスワードの変更");
		driver.findElementByXPath("//android.widget.Button[@index='2']").click();
		System.out.println("validation toast is displayed");

}
	@Test (priority=11)
	public static void resetcase2 () throws MalformedURLException, InterruptedException {
		//case2--when one of the fields are entered
		driver.findElementByAndroidUIAutomator("text(\"新しいパスワード\")").click();
		Thread.sleep(2000);
		driver.getKeyboard().sendKeys("user123");
		driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.Button[@index='2']").click();
		System.out.println("validation toast1 is displayed");
	
}
	
	static String newpassword = "B100@12345";
	@Test (priority=12)
	public static void resetcase3 () throws MalformedURLException, InterruptedException {
		//case2--when one of the fields are entered
		driver.findElementByAndroidUIAutomator("text(\"新しいパスワード（確認）\")").click();
		Thread.sleep(2000);
		driver.getKeyboard().sendKeys("user123");
		driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.Button[@index='2']").click();
		System.out.println("validation toast2 is displayed");
		//Back button and again side menu
		driver.findElementByAndroidUIAutomator("text(\"戻る\")").click();
		Thread.sleep(500);
		sidemenu side = new sidemenu();
		side.sidemenu();
		driver.findElementByAndroidUIAutomator("text(\"パスワードの変更\")").click();
		Thread.sleep(1000);
		try {

			driver.findElementByXPath("//android.widget.EditText[@index='0']").click();
			Thread.sleep(1000);
			driver.getKeyboard().sendKeys(newpassword);
			driver.hideKeyboard();

			System.out.println("entered");
			

		} 

		catch (Exception e) 
		{
			System.out.println(e);
			driver.findElementByXPath("//android.widget.EditText[@index='0']").click();
			Thread.sleep(1000);
			driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys(newpassword);
			driver.hideKeyboard();

			System.out.println("success");
		}
		//confirm password field
		Thread.sleep(3000);
		try {

			driver.findElementByXPath("//android.widget.EditText[@index='1']").click();
			Thread.sleep(2000);

			driver.getKeyboard().sendKeys(newpassword);
			driver.hideKeyboard();

			//driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("1223");
			System.out.println("entered confirm");
			} 

		catch (Exception e) 
		{
		   
			System.out.println(e);
			driver.findElementByXPath("//android.widget.EditText[@index='1']").click();
			Thread.sleep(2000);

			driver.findElementByXPath("//android.widget.EditText[@index='1']").sendKeys(newpassword);
			driver.hideKeyboard();

			System.out.println("success");
		}
		driver.findElementByXPath("//android.widget.Button[@index='2']").click();
		WebElement result= driver.findElementByXPath("//android.view.View[@index='1']");
		Assert.assertEquals(result.getText(), "トップ");
		System.out.println("navigated to home screen");
}
	
	
}






