package hardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
	
	//7] fail()
	
	// This method is used to intentionally failed test method
	
	@Test(timeOut=1000)
	public void mainTC() 
	{
		Reporter.log("Assert Fail Check",true);
		Reporter.log("Assert Fail -----> pass");
		Assert.fail();
		
		Reporter.log("Assert Fail is false",true);
	}

}