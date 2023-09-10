package Assignment_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//W.A.J.Script To write a script for drop down. http://demo.guru99.com/test/newtours/register.php
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement country=driver.findElement(By.name("country"));
		country.click();
		country.sendKeys("India");
		country.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
