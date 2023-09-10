package practiiccee;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbloginn_parameterized {
	
	WebDriver driver;
	
	@Parameters({"URL"})
	@BeforeMethod
	public void setUp(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Test
	@Parameters({"Uname", "Pass"})
	public void test(String uname, String pass) throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).sendKeys(pass);
		Thread.sleep(4000);
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
