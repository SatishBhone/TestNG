package hardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull {
	
	//5] assertNull()
	
//	This method is use to verify components or 
//	text fields empty or not if it is empty 
//	output is pass otherwise fail

	@Test(enabled=true)
	public void TC1() 
	{
		String str = null;
		
		Assert.assertNull(str, "Value is not null");
		
		Reporter.log("Test case1 is Running",true);
	}
	
}
