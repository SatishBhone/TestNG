package pkg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNgClass {
	
	@BeforeClass
	  public void LaundhTheBrowser() 
	{
		Reporter.log("Launch The the Browser--> @BeforeClass is used",true);
	}
	
	@BeforeMethod
	  public void EnterUserIdAndPassword()
	  {
		  Reporter.log("Enter UserId and Password --> @BeforeMethod is used ",true);
	  }

  @Test
  public void ValidUserID() 
  {
	  Reporter.log("UserId Validation done--> @Test is used",true);
  }
  
  @Test
  public void ValidPassword() 
  {
	  Reporter.log("Password Validation done --> @Test is used",true);
  }

  @AfterMethod
  public void LogOut()
  {
	  Reporter.log("LogOut Done--->@AfterMethod is used",true);
  }

  
  @AfterClass
  public void CloseBrowser() 
  {
	  Reporter.log("BorwserClosed --> @AfterClass is used ",true);
  }

}
