package Assignment_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_hyperlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*W.A.J. Script To find the total hyperlink from this web page 
		http://demo.guru99.com/test/web-table-element.php*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		int n=driver.findElements(By.tagName("a")).size();
		System.out.println("The total number of hyperlinks are:"+n);
		
		driver.quit();
	}

}
