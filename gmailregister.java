package Assignment_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailregister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//W.A.J.script to register your self in Gmail.
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/createaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstName")).sendKeys("Vaibhav");
		Thread.sleep(2000);
		
		driver.findElement(By.name("lastName")).sendKeys("Badheka");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#collectNameNext > div > button > span")).click();
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.id("month"));
		month.click();
		month.sendKeys("Feb");
		month.click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("day")).sendKeys("13");
		Thread.sleep(2000);
		
		driver.findElement(By.name("year")).sendKeys("1992");
		Thread.sleep(2000);
		
		WebElement gender=driver.findElement(By.id("gender"));
		gender.click();
		gender.sendKeys("male");
		gender.click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#birthdaygenderNext > div > button > span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.WEQkZc > div > form > span > section > div > div > div.IhH7Wd.hdGwMb.V9RXW > div.ci67pc > div > span > div:nth-child(1) > div > div.enBDyd > div > div.SCWude > div")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#next > div > button > span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("Passwd")).sendKeys("Vaib1302Vaib");
		Thread.sleep(2000);
		
		driver.findElement(By.name("PasswdAgain")).sendKeys("Vaib1302Vaib");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#createpasswordNext > div > button > span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("phoneNumberId")).sendKeys("7046651453");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.zQJV3 > div > div > div > div > button > span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("code")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#next > div > button > span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.zQJV3.F8PBrb > div > div > div:nth-child(2) > div > div > button > span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#view_container > div > div > div.pwWryf.bxPAYd > div > div.zQJV3.F8PBrb > div > div > div:nth-child(2) > div > div > button > div.VfPpkd-RLmnJb")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#next > div > button > span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div.aDGQwe.UMxd3c > div.eKnrVb > div > div.Z6Ep7d.UMxd3c > div > div.F9NWFb > div > div > button > span")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
