
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

public class schedule extends launch{
	
	@Test (priority=4)
	public static void verifyclickschedulemenu () throws MalformedURLException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
		driver.findElementsByClassName("android.view.View").get(1);
		driver.findElementByAndroidUIAutomator("text(\"タブ: 4/5\")").click();
		WebElement result1= driver.findElementByAndroidUIAutomator("text(\"リマインド\")");
		Assert.assertEquals(result1.getText(), "リマインド");
		System.out.println("navigated to schedule listing screen");
		}
	@Test (priority=5)
	public static void verifyclicklistitem () throws MalformedURLException, InterruptedException {
		//click on diabeties survey(check bounds value)
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.ImageView[@bounds='[25,822][695,970]']").click();
		WebElement result2= driver.findElementByAndroidUIAutomator("text(\"質問\")");
		Assert.assertEquals(result2.getText(), "質問");
		Thread.sleep(5000);

		System.out.println("navigated to start screen");
		}
	@Test (priority=6)
	public static void verifyclickstart () throws MalformedURLException, InterruptedException {
		driver.findElementByAndroidUIAutomator("text(\"問診スタート\")").click();

		
		Thread.sleep(10000);
		System.out.println("navigated to Q1");
}
	@Test (priority=7)
	public static void verifychooseoption () throws MalformedURLException, InterruptedException {
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"放置\")").click();
        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"次へ\"));");
		//driver.findElementByAndroidUIAutomator("text(\"次へ\")").click();
		Thread.sleep(2000);
		driver.findElementByAndroidUIAutomator("text(\"ない\")").click();
		Thread.sleep(7000);
		driver.findElementByAndroidUIAutomator("text(\"完了\")").click();
		System.out.println("navigated to Q2");
		Thread.sleep(7000);
		}
	
}