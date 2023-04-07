package pkg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
  @Test
  public void Amazone() 
  {
	  System.setProperty("webdriver.cheome.driver", "C:\\Users\\satis\\Driver\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.close();
	  
  }
}
