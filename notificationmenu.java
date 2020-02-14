import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class notificationmenu extends launch{
	@Test (priority=15)
	public static void profile () throws MalformedURLException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElementsByClassName("android.view.View").get(1);
		driver.findElementByAndroidUIAutomator("text(\"タブ: 5/5\")").click();
		WebElement result1= driver.findElementByAndroidUIAutomator("text(\"メッセージ\")");
		Assert.assertEquals(result1.getText(), "メッセージ");
		System.out.println("navigated to notification listing screen");
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("text(\"ナビゲーション メニューを開く\")").click();
		driver.findElementByAndroidUIAutomator("text(\"ログアウト\")").click();
		}
		
		
		
		
	}
