package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPg {
		
		WebDriver driver;
		
		//*************************Objects************************
		
		
		@FindBy(name = "user-name")
		WebElement UserName;
		
		@FindBy(id = "password")
		WebElement Password;
		
		@FindBy(name = "login-button")
		WebElement LoginButton;
		
		public LoginPg(WebDriver basedriver) {
			this.driver = basedriver;
			PageFactory.initElements(basedriver, this);
		}

		//***********************Methods***************************
		public void login(String Usernameval,String Passval) {
			
			//Step 1 - Enter Username
	        
	        UserName.sendKeys(Usernameval);
	        
	        //Step 2 - Enter password
	        
	        Password.sendKeys(Passval);
	        
	      //Step 3 - Click Login
	        
	        LoginButton.click();
		}
		
}
