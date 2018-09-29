package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassingValueToPerameter {
	public static WebDriver driver;
	  @Test
	   @Parameters({"myName"})
	   public void parameterTest(String myName) {
	      System.out.println("Parameterized value is : " + myName);
	      driver = new FirefoxDriver();
	      driver.get("https://www.google.com");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(myName);
	      driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
	  }
}
