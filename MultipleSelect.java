package Assignment_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//W.A.J.Script for Selecting multiple items in a drop dropdown
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		Thread.sleep(3000);
		
		
		Select s1=new Select(driver.findElement(By.id("fruits")));
		
		s1.selectByIndex(0);
		Thread.sleep(2000);
		
		s1.selectByValue("orange");
		Thread.sleep(2000);
		
		
		 s1.selectByVisibleText("Grape");
		 Thread.sleep(2000);
		 
		
		driver.close();
	}

}
