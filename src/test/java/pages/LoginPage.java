package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  WebDriver driver;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }

  // Locators
  private By username = By.id("user-name");
  private By password = By.id("password");
  private By loginBtn = By.id("login-button");
  private By errorMsg = By.cssSelector("h3[data-test='error']");

  public void enterUsername(String name) {
    driver.findElement(username).clear();
    driver.findElement(username).sendKeys(name);
  }

  public void enterPassword(String pass) {
    driver.findElement(password).sendKeys(pass);
  }

  public void clickLogin() {
    driver.findElement(loginBtn).click();
  }

  public String getErrorMessage() {
    return driver.findElement(errorMsg).getText();
  }
}
