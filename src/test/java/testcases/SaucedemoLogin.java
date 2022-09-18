package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPg;

public class SaucedemoLogin extends BaseClass{

	@Test
	public void Test1(){
        
	       LoginPg Lp = new LoginPg(driver);
	       Lp.login("standard_user","secret_sauce");
	}
	
	@Test
	public void Test2(){
        
	       LoginPg Lp = new LoginPg(driver);
	       Lp.login("Abc@xyz.com","Abc@1234");
	       
	       /*
	        // step 6 - validate error message
	        WebElement Error = driver.findElement(By.xpath("//h3[@data-test = 'error']"));
	        
	        String ActError = Error.getText();
	        String ExpError = "Epic sadface: Username and password do not match any user in this service";
	        
	        if(ActError.equals(ExpError)) {
	        	System.out.println("TEST CASE PASSED");
	        }else {
	        	System.out.println("TEST CASE FAILED");
	        }
	        */
	        
	        // step 6 - validate error message
	        WebElement Error = driver.findElement(By.xpath("//h3[@data-test = 'error']"));
	        
	        String ActError = Error.getText();
	        String ExpError = "Epic sadface: Username and password do not match any user in this service";
	        
	        //Assert.assertFalse(Error.isDisplayed());
	        
	        Assert.assertEquals(ActError, ExpError);
	        
		}
}
