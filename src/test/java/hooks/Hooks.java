package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import config.ConfigReader;
import factory.DriverFactory;
import utilities.BasePage;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setUp() {
    	     String browser = ConfigReader.getProperty("browser");
    	     driver=DriverFactory.initDriver(browser);
    	     driver.get(ConfigReader.getProperty("url"));
        
    }

    @After
    public void tearDown() {
        System.out.println("Closing browser...");
        driver.quit();
    }
}
