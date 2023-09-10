package practiiccee;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmaillogin {

	private static EdgeDriver driver;
 	WebElement element;
	
	@BeforeTest
	public void test() throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&ifkv=AXo7B7UPZwKGAK5J4wHoCI9sgdbakL3I8LqsHzDL__2jNnHCa2jxbJFh8_QfBK0AM7g3he9r5O-lzw&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(3000);
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.name("identifier")).sendKeys("vb@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("vb@123vb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void test3()
	{
		driver.quit();
	}
}
