package by.playtika;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shops extends Page {
    @FindBy(linkText = "В корзину")
    private WebElement inCart;
    @FindBy(className = "b-top-navigation-cart__link")
    private WebElement cart;

    public Shops(WebDriver driver) {
        super(driver);
    }
    public Cart clickOnCart() throws Exception {
        inCart.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("В корзине")));
        cart.click();
        return new Cart(driver);
    }
}
