package AdvXpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintEmployeeID {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://testingmasters.weebly.com/webtables.html");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
/*		
		List<WebElement> rSize = driver.findElements(By.xpath(".//*[@id='VisitingTable']/tbody/tr"));
		int rowCount = rSize.size();
		System.out.println("Total Number of Rows in a Table : " + rowCount);
		System.out.println("\n*****************************************\n");
		
		//Print the employee ID's of the candiates whose designation is Analyst.
		List<WebElement> PrintEmpID =  driver.findElements(By.xpath("//td[5][text()='Analyst']/preceding-sibling::td[3]"));
		int EmpIDSize = PrintEmpID.size();
		for(int i=0; i<EmpIDSize; i++){
			//System.out.println("Positions Are : " +i);
			System.out.println("Employee ID's of the candiates whose designation is Analyst : " + PrintEmpID.get(i).getText());
		}
		System.out.println("\n*****************************************\n");
		driver.navigate().refresh();
		
		//Print the Mail Id's of the candidates who have applied for less than or equal to 5 days
		List<WebElement> getEmail =  driver.findElements(By.xpath("//td[7][text() < 6]/preceding-sibling::td[3]"));
		int emialSize = getEmail.size();
		for(int i=0; i<emialSize; i++){
			System.out.println("Mail Id's of the candidates who have applied for less than or equal to 5 days : " + getEmail.get(i).getText());
		}
		System.out.println("\n*****************************************\n");
		driver.navigate().refresh();
		
		//Click on the checkboxes of the records whose Designation is Manager
		List<WebElement> clickManager = driver.findElements(By.xpath("//td[5][text()='Manager']/preceding-sibling::td[4]"));
		int managerSize = clickManager.size();
		for(int i=0; i<managerSize; i++){
			clickManager.get(i).click();
			System.out.println("Checkboxes of the records whose Designation is Manager clicked");
		}
		System.out.println("\n*****************************************\n");
		driver.navigate().refresh();
		
		//Click on the checkboxes of the records whose applied days are more than 8 days.
		List<WebElement> clickMorethen8 =  driver.findElements(By.xpath("//td[7][text() > '8']/preceding-sibling::td[6]"));
		int moreThen8Size = clickMorethen8.size();
		for(int a=0; a<moreThen8Size; a++){
			clickMorethen8.get(a).click();
			System.out.println("Checkboxes of the records whose applied days are more than 8 days " +moreThen8Size+ " checkboxes clicked");
		}
		System.out.println("\n*****************************************\n");
*/		
		
		
		//Reject the leaves applied by Analyst.
		
		//td[5][text() = 'Analyst']/following-sibling::td[3]/select/option[@index= '1' ]
		
//		List<WebElement> clickReject =  driver.findElements(By.xpath("//td[5][text() = 'Analyst']/following-sibling::td[3]/select"));
//		for(WebElement we:clickReject){
//			Select s = new Select(we);
//			//s.getFirstSelectedOption().getText();;
//			s.selectByVisibleText("Rejected");
//		}
		
		//*[@id="VisitingTable"]/tbody/tr/td[5][text()='Analyst']/following::td[3]/select/option[@index='1']
		
		List<WebElement> rClick = driver.findElements(By.xpath("//*[@id='VisitingTable']/tbody/tr/td[5][text()='Analyst']/following::td[3]/select/option[@index='1']"));
		int rSize = rClick.size();
		for(int i=0; i<rSize; i++){
			rClick.get(i).click();
		}
		
		System.out.println("\n*****************************************\n");
		
	}

}

















