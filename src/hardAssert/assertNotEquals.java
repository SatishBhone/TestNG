package hardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNotEquals 
{   
	@Test
	
	public void TC1() 
	{
	//	2] assertNotEquals() 
		
	//Used to verify expected and actual results.
	//If both results are not same then output is 
	//pass otherwise fail

		String ExpectedResult="VCTCPune";
		String ActualResult="VCTC";
		Assert.assertNotEquals(ActualResult, ExpectedResult, "Result is matching");
		
		Reporter.log("TC2 is running", true);
	}
	
	

}
