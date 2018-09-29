package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsEx {
	
	@BeforeSuite
	public void BS(){System.out.println("BeforeSuite is Excuted \n");}
	
	@BeforeClass
	public void BC(){System.out.println("BeforeClass is Excuted \n");}
	
	@BeforeMethod
	public void BM(){System.out.println("BeforeMethod is Excuted \n");}

	// Actual Test case are excuted
		@Test
		public void Tc5(){System.out.println("TestCase 5 is Excuted \n");}
		@Test
		public void Tc1(){System.out.println("TestCase 1 is Excuted \n");}
		@Test
		public void Tc2(){System.out.println("TestCase 2 is Excuted \n");}
		@Test
		public void Tc3(){System.out.println("TestCase 3 is Excuted \n");}
		@Test
		public void Tc4(){System.out.println("TestCase 4 is Excuted \n");}
		@Test
		public void Tc6(){System.out.println("TestCase 6 is Excuted \n");}
	
	@AfterMethod
	public void AM(){System.out.println("AfetrMethod is Excuted \n");}
	
	@AfterClass
	public void AC(){System.out.println("AfterClass is Excuted \n");}
	
	@AfterSuite
	public void AS(){System.out.println("AfterSuite is Excuted \n");}
}
