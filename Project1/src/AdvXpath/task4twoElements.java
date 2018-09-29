package AdvXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task4twoElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
		
		//Click on the checkboxes of the records whose username is Vinod and Designation is analyst.
		
		List<WebElement> eID =  driver.findElements(By.xpath("//td[3][text()='Vinod']/following::td[2][text()='Analyst']/preceding::td[3]"));
		int eSize = eID.size();
		System.out.println(eSize);
		
		for(int i=0; i<eSize; i++){
			System.out.println(eID.get(i).getText());
		}
	}

}
