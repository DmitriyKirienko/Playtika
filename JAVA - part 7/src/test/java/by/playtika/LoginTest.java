package by.playtika;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    private static WebDriver driver;
    @BeforeMethod
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/dmitriyk/home/user/Work/chrome driver");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(invocationCount = 10)
    public void loginTest() throws Exception {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
        mainPage.clickOnCatalog();
        Catalog catalog = new Catalog(driver);
        catalog.clickOnElectronika();
        catalog.clickOnMobileAndAcces();
        catalog.clickOnMobiles();
        Mobiles mobiles = new Mobiles(driver);
        mobiles.clickOnMobile();
        Mobile mobile = new Mobile(driver);
        mobile.clickOnShops();
        Shops shops = new Shops(driver);
        shops.clickOnCart();
        Cart cart = new Cart(driver);
        Assert.assertEquals(mobiles.getDevice(), cart.getDeviceInCart());
        driver.close();

    }

}
