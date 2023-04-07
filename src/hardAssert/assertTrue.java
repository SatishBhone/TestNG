package hardAssert;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrue {

//	3] assertTrue()
//	This method is use to verify conditions are true or false. 
//	If condition is true output is pass otherwise fail

	
	@Test
	public void TC1() 
	{
		//boolean output= Title.isSelected();
		//boolean output= Title.isEnabled();
		//boolean output= Title.isMultiple();
		//boolean output= Title.isDisplayed();
		boolean Result=false;
		 
		Assert.assertTrue(Result, "Result is false");
		Reporter.log("TC3 is running", true);
	}
}
