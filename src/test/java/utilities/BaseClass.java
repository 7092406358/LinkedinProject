	package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
    public static WebDriver driver;

    public static void launchBrowser() {
        System.setProperty("webdriver.edge.driver", "D:\\edgedriver\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
