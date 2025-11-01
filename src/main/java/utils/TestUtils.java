package utils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestUtils {
    WebDriver driver;
    WebDriverWait wait;

    public TestUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public String takeScreenshot(String fileNamePrefix) {
        String timestamp = getCurrentTime();
        String filePath = "screenshots/" + fileNamePrefix + "_" + timestamp + ".png";
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        try {
            Files.createDirectories(Paths.get("screenshots/"));
            File dest = new File(filePath);
            Files.copy(src.toPath(), dest.toPath());
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
        return filePath;
    }

    public String getCurrentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        return dtf.format(LocalDateTime.now());
    }
}
