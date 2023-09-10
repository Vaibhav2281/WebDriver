package practiiccee;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fblogin {

	@Test
	public void google() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("vb@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("vb@123456");
		Thread.sleep(4000);
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	}
}
