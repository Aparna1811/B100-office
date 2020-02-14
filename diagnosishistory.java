import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class diagnosishistory extends launch{
	@Test (priority=8)
	public static void verifyhistory () throws MalformedURLException, InterruptedException {
		
		driver.findElementByAndroidUIAutomator("text(\"タブ: 3/5\")").click();
		WebElement result= driver.findElementByAndroidUIAutomator("text(\"診断履歴\")");
		Assert.assertEquals(result.getText(), "診断履歴");
		System.out.println("Assert navigation worked");
		Thread.sleep(5000);

}
	
	
	
	
	
	
	
}
