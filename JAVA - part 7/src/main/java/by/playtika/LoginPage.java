package by.playtika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page {
    @FindBy(xpath = "//input[@placeholder=\"Ник или e-mail\"]")
    private WebElement loginField;
    @FindBy(xpath = "//input[@type=\"password\"][@data-field=\"login\"]")
    private WebElement passwordField;
    @FindBy(className = "auth-box__auth-submit")
    private WebElement loginButtonFinal;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public MainPage login() {
        loginField.sendKeys("");
        passwordField.sendKeys("");
        loginButtonFinal.click();
        return new MainPage(driver);
    }

}
