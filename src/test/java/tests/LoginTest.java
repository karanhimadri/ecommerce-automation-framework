package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

  @Test
  public void invalidLoginTest() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.enterUsername(config.getProperty("invalid_username"));
    loginPage.enterPassword(config.getProperty("invalid_password"));
    loginPage.clickLogin();

    // Verify error message
    String expected = "Epic sadface: Username and password do not match any user in this service";
    Assert.assertEquals(loginPage.getErrorMessage(), expected, "Error message mismatch.");
  }

  @Test
  public void validLoginTest() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.enterUsername(config.getProperty("valid_username"));
    loginPage.enterPassword(config.getProperty("valid_password"));
    loginPage.clickLogin();

    // verify homepage URL after login
    String expectedUrl = "https://www.saucedemo.com/inventory.html";
    Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "URL mismatch.");
  }
}
