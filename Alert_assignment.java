package Assignment_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//W.A.J. Script How to handled Alert in selenium "http://demo.guru99.com/test/delete_customer.php "
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		Alert a1=driver.switchTo().alert();
		System.out.println("Alert Message 1-->" + a1.getText());
		a1.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		Alert a2=driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.accept();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
