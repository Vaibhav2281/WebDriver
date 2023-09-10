package Assignment_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_event {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//W.A.J.Script To use Mouse Hover Event using Action class
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		
		WebElement flights=driver.findElement(By.linkText("Flights"));
		
		WebElement cruise=driver.findElement(By.linkText("Cruises"));
			
		
		Actions actions=new Actions(driver);
		
		Action a1=actions.moveToElement(home).build(); 
		a1.perform();
		Thread.sleep(2000);
		
		Action a2=actions.moveToElement(flights).build();
		a2.perform();
		Thread.sleep(2000);
		
		Action a3=actions.moveToElement(cruise).build();
		a3.perform();
		
		driver.quit();
	}

}
