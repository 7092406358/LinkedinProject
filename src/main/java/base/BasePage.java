	package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasePage {
    public static WebDriver driver;

    public static void launchBrowser() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\ARUN\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    public void click(WebElement element) {
        element.click();
    }
    
    public static void closeBrowser() {
        if (driver != null) {
            driver.close();
        }
    }
}
