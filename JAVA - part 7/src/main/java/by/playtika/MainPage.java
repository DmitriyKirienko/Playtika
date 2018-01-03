package by.playtika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page {
    private final String BASE_URL = "https://www.onliner.by";

    @FindBy(xpath = "//*[@id=\"userbar\"]/div/div[1]")
    private WebElement loginButton;
    @FindBy(linkText = "Каталог")
    private WebElement catalogButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage clickOnLoginButton() {
        loginButton.click();
        return new LoginPage(driver);
    }

    public void openPage() {
        driver.navigate().to(BASE_URL);
    }
    public Catalog clickOnCatalog() {
        catalogButton.click();
        return new Catalog(driver);
    }

}
