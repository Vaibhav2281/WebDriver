package Assignment_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//W.A.J.Script for Locating links by linkText() and partialLinkText()
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		home.click();
		
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		WebElement hotels=driver.findElement(By.partialLinkText("tels"));
		hotels.click();
		
		driver.quit();
	}

}
