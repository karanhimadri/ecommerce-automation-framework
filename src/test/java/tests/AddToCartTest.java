package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class AddToCartTest extends BaseTest {
  @Test
  public void addProductToCartTest() {

    // first login
    LoginPage loginPage = new LoginPage(driver);
    loginPage.enterUsername(config.getProperty("valid_username"));
    loginPage.enterPassword(config.getProperty("valid_password"));
    loginPage.clickLogin();

    // Add product to cart
    HomePage homePage = new HomePage(driver);
    homePage.addProductToCart();

    // Verify count
    String expected = homePage.getCartCount();
    Assert.assertEquals(expected, "1");
  }
}
