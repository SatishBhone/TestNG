package pkg1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertInTestNGStudy 
{
//	To reduce length of test script we need to use Assert class 
//	for verification which contains static methods. 
//	Important static methods present in Assert class (Hard Assert)
//	All static method should be imported from org.TestNG
//	1) assertEquals()
//	2) assertNotEquals()
//	3) assertTrue()
//	4) assertFalse()
//	5) assertNull()
//	6) assertNotNull()
//	7) fail()
	
	// 1] assertEquals() 
	
     //	Used to verify expected and actual results. 
     // If both results are same then output is pass 
     //	otherwise fail
	
 @Test
 public void TC1() 
 {
	 String ActualResult = "SatishBhone";
	 String ExpectedResult = "GopalBhone";
	 
	 // if hardAssert is fail than it does not execute farther code
	 Reporter.log("TC1 is Running",true);
	 
	 Assert.assertEquals(ActualResult, ExpectedResult,"Rusult is NotMatching ");
	 
	
 }
	@Test
 public void TC2() 
 {
	 String ActualResult = "SatishBhone";
	 String ExpectedResult = "SatishBhone";
	 
	 // if hardAssert is fail than it does not execute farther code
	
	 
	 Assert.assertEquals(ActualResult, ExpectedResult,"Rusult is NotMatching ");
	 
	 Reporter.log("TC2 is Running",true);
 }
}
