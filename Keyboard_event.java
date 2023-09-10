package Assignment_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_event {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//W.A.J.Script To use Keyboard Event using Action class
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement search=driver.findElement(By.name("q"));
		Actions builder=new Actions(driver);
		builder.click(search).keyDown(Keys.SHIFT).sendKeys("Tops technologies").keyUp(Keys.SHIFT).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
