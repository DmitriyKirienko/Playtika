package by.playtika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Mobiles extends Page {

    private String device;
    @FindBy(xpath = "//span[@data-bind=\"html: product.extended_name || product.full_name\"]")
    private List<WebElement> mobiles;

    public Mobiles(WebDriver driver) {
        super(driver);
    }
    public Mobile clickOnMobile() {
        List<WebElement> mobiles1 = mobiles;
        int index = (int)(Math.random()*mobiles.size());
        WebElement mobile = mobiles1.get(index);
        device = mobile.getText();
        mobile.click();
        return new Mobile(driver);
    }
    public String getDevice() {
        return device;
    }


}
