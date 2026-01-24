package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    
     
     @Then("user should see an error message Invalid username or password")
     public void user_should_see_invalid_username_or_password_error() {
         String expectedError = "Invalid username or password";
         
         WebElement errorMsg = driver.findElement(By.xpath("//div[@id='error-for-password'])]"));
         String actualError = errorMsg.getText();
         System.out.println(actualError);
       //  Assert.assertEquals("      Wrong email or password. Try again or ", expectedError, actualError);
     }

}
