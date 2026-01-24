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
import base.BasePage;

public class LoginStepDefs {
    
    WebDriver driver = Hooks.driver;  // use the driver from Hooks
    LoginPage loginPage;
    
     @Given("user is logged in for login scenario") 
	public void userisloggedin() throws InterruptedException 
	{     
         loginPage = new LoginPage(driver);
         loginPage.clickOnSignIn();
        
	}
     @When("user enters the username {string} and password {string}")
     public void user_enters_username_and_password(String username, String password) {
         loginPage.enterUsername(username);
         loginPage.enterPassword(password);
         loginPage.clickSigninButton();
     }
     @Then("user should be redirected to the dashboard")
     public void user_should_be_redirected_to_the_dashboard() {
         //Assert.assertTrue(loginPage.getPageTitle().contains("Dashboard"));
        // driver.close();
     }
    
}
