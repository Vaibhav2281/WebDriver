package Practicce;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class fblogin {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	private static EdgeDriver driver;
 	WebElement element;
		
		@BeforeClass
		public static void setUp() throws InterruptedException
		{
			System.setProperty("webdriver.edge.driver", "D:\\Edge Driver\\msedgedriver.exe");
			driver=new EdgeDriver();	
		}
		
		@Test
		public void test() throws InterruptedException
		{
			
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("vb@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("pass")).sendKeys("vb@123vb");
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
		}
		
		@AfterClass
		public static void tearDown()
		{
			driver.quit();
		}

}
