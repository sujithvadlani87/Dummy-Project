package AdvXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wDriver {
	public static WebDriver driver;
		public void OpenBrowser() {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			System.out.println("Firefox Browser Lunched");
			
		}
}
