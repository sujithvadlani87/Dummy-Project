package AdvXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckLast4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		// Clik on checkboxes of last 4 records.
		
		//*[@id="VisitingTable"]/tbody/tr[position() > last() -4]/td[1]
		List<WebElement> Ll4 = driver.findElements(By.xpath("//*[@id='VisitingTable']/tbody/tr[position() > last() -4]/td[1]"));
		int ll4Size = Ll4.size();
		for(int i=0; i<ll4Size; i++){
			Ll4.get(i).click();
		}
	}

}
