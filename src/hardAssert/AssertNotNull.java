package hardAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class AssertNotNull {
	
	//6] assertNotNull()
	
   //	Use to verify components or text fields empty or not,
   // if it is not empty output is pass otherwise fail.
    @Test(priority=1)
    public void TC1()
    {
    	String str = "Satish";
    	
    	Assert.notNull(str, "Value is not null");
    	
    	Reporter.log("Test Case 1 is Running", true);
    }
}
