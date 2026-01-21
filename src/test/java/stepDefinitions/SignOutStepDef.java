package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v115.runtime.Runtime.GetPropertiesResponse;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.j2objc.annotations.Property;
import config.ConfigReader;
import hooks.Hooks;
import pages.LoginPage;
import pages.SignOutPage;
import base.BasePage;
public class SignOutStepDef {
	    WebDriver driver = Hooks.driver;  
	    SignOutPage SignOutPage;
	    
	     @Given("user is logged in for signout scenario")
		public void userisloggedin() throws InterruptedException 
		{     
	    	 SignOutPage = new SignOutPage(driver);
	    	 SignOutPage.clickOnSignIn();
		}

	     @When("user enters the username {string} and password {string} in login")
	     public void user_enters_username_and_password(String username, String password) {
	    	 SignOutPage.enterUsername(username);
	    	 SignOutPage.enterPassword(password);
	    	 SignOutPage.clickSigninButton();
	     }
	     
	     @And ("user clicks on profile menu")
          public void user_clicks_on_profile_menu() throws InterruptedException {
	         
	    	 SignOutPage.clickOnProfile();
	    	 Thread.sleep(3000);
	     }
	     
			/*
			 * @And ("user clicks on sign out") public void user_clicks_on_sign_out() {
			 * 
			 * 
			 * }
			 */
	     
	     @Then("Then user should be signout successfully")
	     public void Then_user_should_be_signout_successfully() throws InterruptedException {
	        
	    	 
	     }
	    
	
}
