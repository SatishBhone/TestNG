package hardAssert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertFalse

     //   4] assertFalse()

     //      Use to verify conditions are true or false, 
     //      if condition is true output is fail and if 
      //     condition is false then output is pass.
{
	@Test(enabled = true)
	public void TC4() 
	 
	 { 
	//boolean output= Title.isDisplayed();
		
	boolean Result=false;
	 
	Assert.assertFalse(Result,"Result is false");
	
	Reporter.log("TC4 is running", true);
	
	
	 }
}
