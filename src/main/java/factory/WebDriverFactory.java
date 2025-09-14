package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebDriverFactory {

    private static WebDriver driver;

    /**
     * Creates and returns a WebDriver instance based on the browser type.
     */
    public static WebDriver createDriver() {
        if (driver == null) {
            // Example: Chrome setup
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Videos\\AutomationExercise\\drivers\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            // options.addArguments("--headless"); //  headless mode
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    /**
     * Quit the WebDriver instance and set it to null
     */
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
