import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class sidemenu extends launch{
	@Test (priority=9)
	public static void sidemenu () throws MalformedURLException, InterruptedException {
		
		driver.findElementByAndroidUIAutomator("text(\"ナビゲーション メニューを開く\")").click();
		WebElement result= driver.findElementByAndroidUIAutomator("text(\"設定\")");
		Assert.assertEquals(result.getText(), "設定");
		System.out.println("side menu displayed");

}
}