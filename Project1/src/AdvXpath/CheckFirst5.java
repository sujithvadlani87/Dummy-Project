package AdvXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckFirst5 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		//Click on checkboxes of first five records.
		
		//*[@id='VisitingTable']/tbody/tr[position() <= 5] //td[1]
		//OR
		//*[@id="VisitingTable"]/tbody/tr[position() <= last() -7]/td[1]
		List<WebElement> Lf5 = driver.findElements(By.xpath("//*[@id='VisitingTable']/tbody/tr[position() <= 5] //td[1]"));
		int lf5size = Lf5.size();
		
		for(int i=0; i<lf5size; i++){
			Lf5.get(i).click();
		}
	}

}
