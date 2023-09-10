package Assignment_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*W.A.J. Script To perform the radio button to select one by one in loop
		http://demo.guru99.com/test/radio.html*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		for(int i=1; i<=3; i++)
		{
			driver.findElement(By.cssSelector("#vfb-7-"+i)).click();
			Thread.sleep(2000);
		}
		driver.quit();
	}

}
