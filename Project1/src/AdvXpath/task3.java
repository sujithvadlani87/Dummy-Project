package AdvXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class task3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		//Print the employee Id's of the approved candidates
//		List<WebElement> selectVal =  driver.findElements(By.xpath("//td[8]/select/option[text() = 'Rejected']//preceding::td[6]"));
//		int sValsize = selectVal.size();
//		System.out.println(sValsize);
		
		List<WebElement> selectVal =  driver.findElements(By.xpath("//td[8]/select"));
		int sValsize = selectVal.size();
		System.out.println();
		
		for(int i=1; i<sValsize; i++){
			//System.out.println(selectVal.get(i).getText());
			String len = selectVal.get(i).getText();
			//System.out.println(len);
			
			if(len.contains("Accepted")){
				String Sval =  driver.findElement(By.xpath("//td[8]/select/parent::td/preceding::td[6]")).getText();
				System.out.println(Sval);
			}
		}
		
	}

}
