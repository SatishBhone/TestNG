package pkg1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWordTimeOut
{
	
   @Test
   public void TC1() 
  {
	Reporter.log("TC1 is running ", true);
   }
   @Test (timeOut=2000)
   public void TC2 () throws InterruptedException 
   {
	Reporter.log("TC2 is Running",true);
	Thread.sleep(3000);
   }
   @Test
    public void TC3() 
   {
	Reporter.log("TC3 is Running", true);
   }
}
