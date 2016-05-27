package automationScript;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
public class NgageApp {
	public static void main(String[] args) throws Exception 
	{
		AppiumDriver Driver=null;

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("platformVersion", "5.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "yw.wemet.ngageapp");
		capabilities.setCapability("appActivity", "yw.wemet.ngageapp.SplashActivity");
		capabilities.setCapability("APKID","yw.wemet.ngageapp:3.0.59");
		Driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//SelendroidCapabilities capa = new SelendroidCapabilities("yw.wemet.ngageapp:3.0.59");
		//WebDriver Driver = new SelendroidDriver(capa);
		//capa.setPlatformVersion(DeviceTargetPlatform.ANDROID18);
		//capa.setEmulator(true);
		//capa.setModel("Nexus 7")
		/*SelendroidLauncher selendroidServer = null;
		// Start selendroid-standalone during test
		SelendroidConfiguration config = new SelendroidConfiguration();

		// Add the selendroid-test-app to the standalone server
		config.addSupportedApp("n-gage.apk");

		// start the standalone server
		selendroidServer = new SelendroidLauncher(config);
		selendroidServer.lauchSelendroid();*/

		/*DesiredCapabilities capa=DesiredCapabilities.android();
		capa.setCapability(SelendroidCapabilities.EMULATOR, true);
		capa.setCapability(SelendroidCapabilities.SCREEN_SIZE, "768x1280");
		SelendroidDriver driver = new SelendroidDriver(capa);

		// Create instance of Selendroid Driver
		WebDriver Driver = new SelendroidDriver(capa);

		/*JavascriptExecutor js = (JavascriptExecutor) Driver;
		    HashMap<String, String> scrollObject = new HashMap<String, String>();
		    scrollObject.put("direction", "down");
		    js.executeScript("mobile: scroll", scrollObject);*/
		// Driver.scrollToExact(s);
		File scrFile=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\Screenshot\\test.jpg"));
		System.out.println("Screenshot capture");
		Driver.findElement(By.id("yw.wemet.ngageapp:id/tvTermsConditions1")).click();
		Driver.findElement(By.name("Close")).click();
		Driver.findElement(By.id("yw.wemet.ngageapp:id/tvPrivacypolicy")).click();
		Driver.findElement(By.name("Close")).click();
		Driver.findElement(By.id("yw.wemet.ngageapp:id/tvAcceptableFairUsePolicy")).click();
		Driver.findElement(By.name("Close")).click();
		Driver.findElement(By.id("yw.wemet.ngageapp:id/tvCookiesPolicy")).click();
		Driver.findElement(By.name("Close")).click();
		Driver.findElement(By.name("I agree and continue")).click();
		Driver.findElement(By.name("Name")).sendKeys("navnath");
		Driver.findElement(By.id("yw.wemet.ngageapp:id/spinnerTarget")).click();
		Driver.scrollToExact("India").click();	
		Driver.findElement(By.linkText("India")).getText();

		Driver.findElement(By.name("Mobile")).sendKeys("9029597744");
		Thread.sleep(6000);
		// Driver.findElement(By.id("yw.wemet.ngageapp:id/btnContinue")).click();
		//Thread.sleep(15000);
		//Driver.findElement(By.id("yw.wemet.ngageapp:id/btnFinish")).click();
		//Thread.sleep(60000);
		// Driver.findElement(By.id("yw.wemet.ngageapp:id/btnskip")).click();
		//  Thread.sleep(30000);   
		Driver.findElement(By.id("yw.wemet.ngageapp:id/btnContinue")).click();
		Thread.sleep(20000);
		Driver.findElement(By.id("yw.wemet.ngageapp:id/btnskip")).click();
		Thread.sleep(20000);
		for(int n=1; n<=3; n++)
		{
			Driver.findElement(By.id("yw.wemet.ngageapp:id/imvAppTheme")).click();
		}
		Driver.navigate().back();
		/*Driver.findElement(By.id("yw.wemet.ngageapp:id/btn3")).click();
		size = Driver.manage().window().getSize();
		System.out.println(size);
		int startx = (int) (size.width * 0.70);
		int endx = (int) (size.width * 0.30);
		int starty = size.height / 2;
		System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);
		Driver.swipe(startx, starty, endx, starty, 3000);
		Thread.sleep(2000);
		Driver.swipe(endx, starty, startx, starty, 3000);
		Thread.sleep(2000);*/
		Driver.findElement(By.id("yw.wemet.ngageapp:id/btn6")).click();
		Driver.scrollTo("Yogesh");
		Driver.findElement(By.id("yw.wemet.ngageapp:id/tvName")).click();
		for(int i=1; i<10; i++)
		{
			Driver.findElement(By.id("yw.wemet.ngageapp:id/text")).sendKeys("Hello");
			Driver.findElement(By.id("yw.wemet.ngageapp:id/btnSend")).click();
		}


	}
}

