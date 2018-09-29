package AdvXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchText {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		
		driver.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("hell");
		List<WebElement> searchList = driver.findElements(By.xpath("//*[@role='listbox']/li"));
		int sListSize = searchList.size();
		//System.out.println(sListSize);
		
		for(int i=0; i<sListSize; i++){
			//System.out.println(searchList.get(i).getText());
			String sListTest = searchList.get(i).getText();
			if(sListTest.startsWith("h")){
				System.out.println(sListTest);
			}
		}
	}

}
