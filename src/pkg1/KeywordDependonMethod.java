package pkg1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordDependonMethod 
{
    @Test(priority=1)
    public void login() 
    {
    	Reporter.log("Login is successfull", true);
    }
    
    @Test(priority= 2)
    public void verifypassword() 
    {
    	Reporter.log("Password is Varified", true);
    }
    
    @Test(dependsOnMethods="login")
    public void LogOut() 
    {
    	Reporter.log("Logout is Successfull",true);
    }
}
