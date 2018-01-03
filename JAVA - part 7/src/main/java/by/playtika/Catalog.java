package by.playtika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Catalog extends Page {
    @FindBy(xpath = "//li[@class=\"catalog-navigation-classifier__item \"][@data-id=\"1\"]")
    private WebElement electronika;
    @FindBy(xpath = "//div[@class=\"catalog-navigation-list__category\"][@data-id=\"1\"]/div/div/div")
    private WebElement mobileAndAcces;
    @FindBy(xpath = "//a[@href=\"https://catalog.onliner.by/mobile\"]")
    private WebElement mobiles;


    public Catalog(WebDriver driver) {
        super(driver);
    }

    public void clickOnElectronika() {
        electronika.click();
    }
    public void clickOnMobileAndAcces() {
        Actions builder = new Actions(driver);
        builder.moveToElement(mobileAndAcces);
        Action mouseoverAndClick = builder.build();
        mouseoverAndClick.perform();
    }
    public Mobiles clickOnMobiles() {
        mobiles.click();
        return new Mobiles(driver);
    }
}
