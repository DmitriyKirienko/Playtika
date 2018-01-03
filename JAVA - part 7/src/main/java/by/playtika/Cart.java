package by.playtika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends Page {
    @FindBy(xpath = "//span[@data-bind=\"html: $data.product.full_name\"]")
    private WebElement mobileInCart;

    public Cart(WebDriver driver) {
        super(driver);
    }
    public String getDeviceInCart() {
        return mobileInCart.getText();
    }

}
