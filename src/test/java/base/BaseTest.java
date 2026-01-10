package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

  protected WebDriver driver;
  protected ConfigReader config;

  @BeforeMethod
  public void setUp() {
    System.out.println(">>> BASE TEST SETUP EXECUTED <<<");

    config = new ConfigReader();

    // Automatically manages ChromeDriver (CI-safe)
    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions();

    // Required for GitHub Actions (Linux)
    options.addArguments("--headless=new");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("--window-size=1920,1080");

    driver = new ChromeDriver(options);

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get(config.getProperty("url"));
  }

  @AfterMethod
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }
}
