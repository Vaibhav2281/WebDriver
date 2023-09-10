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

public class gmaillogin {

	private static EdgeDriver driver;
 	WebElement element;
	
	@Before
	public void setUp()
	{
		System.out.println("Hii");
		System.setProperty("webdriver.edge.driver", "D:\\Edge Driver\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXo7B7WjXGYRZT4Hro7xrPq-Qo4B9NDKgIa-gI2Blraaf4dxrsDUlyzqZSnoKERD8CPNa77m_HI2_Q&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1140140107%3A1692897758877245");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("identifier")).sendKeys("vb@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("vb@123vb");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
