package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.BaseClass;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        System.out.println("Launching browser...");
        BaseClass.launchBrowser();
        driver = BaseClass.driver;
    }

    @After
    public void tearDown() {
        System.out.println("Closing browser...");
        BaseClass.closeBrowser();
    }
}
