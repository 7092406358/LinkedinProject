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
import pages.LoginPage;
import utilities.BaseClass;

public class LoginStepDefs {
    WebDriver driver;
    LoginPage loginPage;

    
     @Given("user is on the login page") 
	public void userisloggedin() throws InterruptedException 
	{     WebDriver driver = new EdgeDriver();
         driver.get("https://www.linkedin.com");
         loginPage = new LoginPage(driver);
         Thread.sleep(2000);
         loginPage.clickOnSignIn();
         Thread.sleep(2000);
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
         driver.close();
     }
    
}
