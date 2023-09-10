package Practicce;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

@RunWith(Parameterized.class)
public class fblogin_parameterized {
		
	public String uname;
	public String pass;
	public static WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.edge.driver", "D:\\Edge Driver\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	public fblogin_parameterized(String uname, String pass) {
		this.uname=uname;
		this.pass=pass;
	}
	
	@Parameters
	public static Collection values() {
		return Arrays.asList(new Object[][] 
		{
			{"vb@gmail.com", "vb@123"},
			{"xyz@gmail.com", "vb@123"},
			{"abc@gmail.com", "abc@123"}
		});			
	}
	
	@Test
	public void test() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.name("email")).sendKeys(uname);
	driver.findElement(By.name("pass")).sendKeys(pass);
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
	}
