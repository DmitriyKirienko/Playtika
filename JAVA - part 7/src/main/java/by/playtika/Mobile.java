package by.playtika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mobile extends Page {
    @FindBy(className = "button_orange")
    private WebElement shops;

    public Mobile(WebDriver driver) {
        super(driver);
    }
    public Shops clickOnShops() {
       shops.click();
       return new Shops(driver);
    }

}
