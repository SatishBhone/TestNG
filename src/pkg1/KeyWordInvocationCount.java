package pkg1;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyWordInvocationCount {
	
	
	@BeforeMethod
	public void beforeMethod() 
	{
		Reporter.log("BeforeMehtod is Running",true);
	}
	@Test(invocationCount=5)
	public void TC1() 
	{
		Reporter.log("TestCase1 Running--> invocationCount is used",true);
	}

}
