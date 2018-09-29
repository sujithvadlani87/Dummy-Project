package AdvXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropdown {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		List<WebElement> clickReject =  driver.findElements(By.xpath("//td[5][text() = 'Analyst']/following-sibling::td[3]/select"));
		//int RejectSize = clickReject.size();
		for(WebElement we:clickReject){
			Select s = new Select(we);
			//s.getFirstSelectedOption().getText();
			//System.out.println(s.getFirstSelectedOption().getText());
			s.selectByVisibleText("Rejected");
		}
		
		
	}
	
}
