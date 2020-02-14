import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class profile extends launch{
	@Test (priority=13)
	public static void profile () throws MalformedURLException, InterruptedException {
		resetpasswordfromsidemenu reset = new resetpasswordfromsidemenu();
		
		driver.findElementByAndroidUIAutomator("text(\"ナビゲーション メニューを開く\")").click();
		driver.findElementByAndroidUIAutomator("text(\"登録情報の変更・確認\")").click();
		Thread.sleep(2000);
//		Actions act= new Actions(driver);
//		act.moveByOffset(650,487).click().build().perform();
		driver.findElementByXPath("//android.widget.ImageView[@index='2']").click();
		Thread.sleep(2000);
		

}
//	@Test (priority=14)
//			public static void loginwithnewpassword () throws MalformedURLException, InterruptedException {
//				resetpasswordfromsidemenu reset = new resetpasswordfromsidemenu();
//				
//					//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//					Thread.sleep(5000);
//					try {
//
//						driver.findElementByXPath("//android.widget.EditText[@index='0']").click();
//						Thread.sleep(5000);
//
//						driver.getKeyboard().sendKeys("User105");
//
//						//driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("1223");
//						System.out.println("Login successful");
//						
//
//					} 
//					
//					catch (Exception e) 
//					{
//				       
//						System.out.println(e);
//						driver.findElementByXPath("//android.widget.EditText[@index='0']").click();
//						Thread.sleep(5000);
//
//						driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("User105");
//						//driver.getKeyboard().sendKeys("BS00000421");
//						System.out.println("jjj");
//					}
//					try {
//						//driver.findElementByXPath("//android.widget.EditText[@index='1']").click();
//						 //driver.findElementByAndroidUIAutomator("text(\"パスワード\")").click();
//						driver.findElementByXPath("//android.widget.EditText[@index='1']").click();
//						Thread.sleep(5000);
//
//						driver.getKeyboard().sendKeys(reset.newpassword);
//
//						//driver.findElementByXPath("//android.widget.EditText[@index='1']").sendKeys("admin1234");
//					} 
//					catch (Exception e) {
//						//driver.findElementByXPath("//android.widget.EditText[@index='1']").sendKeys("admin1234");
//						driver.getKeyboard().sendKeys(reset.newpassword);
//					}
//					driver.findElementByAndroidUIAutomator("text(\"ログイン\")").click();
//					Thread.sleep(5000);
//					WebElement result= driver.findElementByXPath("//android.view.View[@index='1']");
//					Assert.assertEquals(result.getText(), "トップ");
//					System.out.println("Home screen is displayed");
//				}
}
		
				
				
	
	
