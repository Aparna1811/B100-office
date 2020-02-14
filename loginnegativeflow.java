import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class loginnegativeflow extends launch {

	// TODO Auto-generated method stub
		@Test //(priority=1)
		public void loginpostive() throws MalformedURLException, InterruptedException {
			//Invalid flow 1
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.findElementByAndroidUIAutomator("text(\"ログイン\")").click();
			Assert.assertEquals("ログインエラー", "ログインエラー");
			System.out.println("Assert Invalid message pop up displayed");
			driver.findElementByAndroidUIAutomator("text(\"閉じる\")").click();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	
			//Invalid flow 2

			@Test //(priority=2)
			public void verifyloginerror2 () throws MalformedURLException {
			
			try {
			  driver.findElementByXPath("//android.widget.EditText[@index='0']").click();
			  driver.findElementByXPath("//android.widget.EditText[@index='0']").sendKeys("ADMIN");
			  driver.hideKeyboard();
			  } 
			catch (Exception e) 
			{
				driver.getKeyboard().sendKeys("ADMIN");
				driver.hideKeyboard();
				}
			  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			  driver.findElementByAndroidUIAutomator("text(\"ログイン\")").click();
			  Assert.assertEquals("ログインエラー", "ログインエラー");
			  System.out.println("Invalid Username or password");
			  driver.findElementByAndroidUIAutomator("text(\"閉じる\")").click();
			  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//			  driver.findElementByXPath("//android.widget.EditText[@index='0']").click();
//			  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			  //driver.findElementByXPath("//android.widget.EditText[@index='0']").clear();
			  driver.findElementByAndroidUIAutomator("text(\"パスワードを忘れた場合\")").click();
			  driver.findElementByAndroidUIAutomator("text(\"戻 る\")").click();



			 
			  		 }
		}
