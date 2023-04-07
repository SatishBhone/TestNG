package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarificationUsingtestNG {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='benzradio']"));
		element.click();
		
		System.out.println(element.isSelected());
		
		if(element.isSelected())
		{
			System.out.println("Element is selected");
		}
		else 
		{
			System.out.println("Element is not selected");
		}
		driver.close();
	}
	
	

}
