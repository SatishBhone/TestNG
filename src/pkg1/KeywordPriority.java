package pkg1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordPriority
{
// Default Priority is Zero
// when all method priority is zero it will be Executed in Alphabetic Order
// 	
	
	@Test
	   public void C() 
	   {
		   Reporter.log("C is Running", true);
	   }
	@Test
	   public void A()  
	   {
		   Reporter.log("A is Running", true);
	   }
	@Test
	   public void D() 
	   {
		   Reporter.log("D is Running", true);
	   }
	@Test
	   public void B() 
	   {
		   Reporter.log("B is Running", true);
	   }

	@Test(priority=1)
	   public void test() 
	   {
		   Reporter.log("Test is Running", true);
	   }

	@Test(priority=2)
	   public void test1() 
	   {
		   Reporter.log("Test1 is Running", true);
	   }
	@Test(priority=3)
	   public void test2() 
	   {
		   Reporter.log("Test2 is Running", true);
	   }
}
