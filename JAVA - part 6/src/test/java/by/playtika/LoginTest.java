package by.playtika;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    private static WebDriver driver;
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/dmitriyk/home/user/Work/chrome driver");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.onliner.by");
    }
    @Test
    public void userLogin() throws Exception {
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"userbar\"]/div/div[1]"));
        loginButton.click();
        WebElement loginField = driver.findElement(By.xpath("//input[@placeholder=\"Ник или e-mail\"]"));
        loginField.sendKeys("");
        WebElement passwordField = driver.findElement(By.xpath("//input[@type=\"password\"][@data-field=\"login\"]"));
        passwordField.sendKeys("");
        WebElement loginButtonFinal = driver.findElement(By.className("auth-box__auth-submit"));
        loginButtonFinal.click();
        WebElement catalog = driver.findElement(By.linkText("Каталог"));
        catalog.click();
        WebElement electr = driver.findElement(By.xpath("//li[@class=\"catalog-navigation-classifier__item \"][@data-id=\"1\"]"));
        electr.click();
        WebElement mobAndAcces = driver.findElement(By.xpath("//div[@class=\"catalog-navigation-list__category\"][@data-id=\"1\"]/div/div/div"));
        Actions builder = new Actions(driver);
        builder.moveToElement(mobAndAcces);
        Action mouseoverAndClick = builder.build();
        mouseoverAndClick.perform();
        WebElement mob = driver.findElement(By.xpath("//a[@href=\"https://catalog.onliner.by/mobile\"]"));
        mob.click();
        List<WebElement> mobiles = driver.findElements(By.xpath("//span[@data-bind=\"html: product.extended_name || product.full_name\"]"));
        int index = (int)(Math.random()*mobiles.size());
        WebElement mobile = mobiles.get(index);
        String device = mobile.getText();
        mobile.click();
        WebElement shops = driver.findElement(By.className("button_orange"));
        shops.click();
        WebElement inCart = driver.findElement(By.linkText("В корзину"));
        inCart.click();
        Thread.sleep(5000);
        WebElement cart = driver.findElement(By.className("b-top-navigation-cart__link"));
        cart.click();
        WebElement mobileInCart = driver.findElement(By.xpath("//span[@data-bind=\"html: $data.product.full_name\"]"));
        String deviceInCart = mobileInCart.getText();
        Assert.assertEquals(device, deviceInCart);
    }
}
