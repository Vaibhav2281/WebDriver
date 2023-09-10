package Assignment_automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "D:\\Edge Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		
		while(i1.hasNext())
		{
			String ChildWindow=i1.next();
			
			if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("vb@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
	}

}
