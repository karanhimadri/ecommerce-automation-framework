package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ConfigReader;

public class BaseTest {
  protected WebDriver driver;
  protected ConfigReader config;

  @BeforeMethod
  public void setUp() {
    System.out.println(">>> BASE TEST SETUP EXECUTED <<<");
    config = new ConfigReader();

    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicite Wait used
    driver.get(config.getProperty("url"));
  }

  @AfterMethod
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }
}
