package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser extends Core {
    public void open(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
    }

    public void close() {
        if (driver != null)
            driver.close();
    }

    public void goToUrl(String url) {
        driver.navigate().to(url);
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
