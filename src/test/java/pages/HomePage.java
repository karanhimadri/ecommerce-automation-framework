package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  WebDriver driver;

  public HomePage(WebDriver driver) {
    this.driver = driver;
  }

  private By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
  private By cartBadge = By.className("shopping_cart_badge");

  public void addProductToCart() {
    driver.findElement(addToCartButton).click();
  }

  public String getCartCount() {
    return driver.findElement(cartBadge).getText();
  }
}
