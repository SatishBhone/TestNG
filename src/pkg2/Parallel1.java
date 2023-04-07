package pkg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel1
{
	@Test
	public void flipkart() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("www.flipkart.com/");
		
		Reporter.log("Flipkart website Launch successful ",true);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
	
	
	@Test
	public void facebook() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("www.facebook.com");
		
		Reporter.log("facebook launch successful",true);
		
		Thread.sleep(2000);
		
		driver.close();
	}

	@Test
	public void Redbus() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("www.redbus.com");
		
		Reporter.log("Redbus launch successful",true);
		
		Thread.sleep(2000);
		
		driver.close();
	}
	@Test
	public void W3school() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("www.w3school.com");
		
		Reporter.log(" W3school launch successful",true);
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
