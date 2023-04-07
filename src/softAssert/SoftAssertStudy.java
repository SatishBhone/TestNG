package softAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy 
{   
	// # Soft Assert
	// -To overcome assert class drawback we need to use soft assert.
	// -It is a class which contains non-static methods use to do verification.
	// -Soft assert will do verification if any executes the rest 
	//   of verification in a test method
	SoftAssert soft = new SoftAssert();
	
	@Test
	public void TC1() 
	{
		String ExpectedResult = "PUNE";
		String ActualResult = "PUNE is best";
		
		soft.assertEquals(ActualResult, ExpectedResult,"Value is not Matching");
		soft.assertNotNull(ActualResult);
		Reporter.log("Running Tc1", true);
		
		soft.assertAll(); // if we don't write assertAll then it will not notify.
	}

}
