package hardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals {
        
	// 1] assertEquals() 

	// Used to verify expected and actual results. 
	// If both results are same then output is pass otherwise fail.
	
	String ExpectedResult = "I am good";
	String ActualResult = "I am good";
	
	@Test(timeOut=1000)
	public void TC1() 
	{
		Assert.assertEquals(ActualResult, ExpectedResult,"Value is Same");
		Reporter.log("TC1 is Running",true);
	}
	
}
