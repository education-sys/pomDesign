package tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;
import pages.LogInPage;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;
    protected static BasePage basePage;

    @BeforeClass
    public static void beforeAll() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        max time to wait for a page load
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//        max time for asynchronous JS run
        basePage = new BasePage(driver, Duration.ofSeconds(10));
    }

    @Before
    public void beforeEach() {
        basePage.navigateTo("https://www.saucedemo.com/");
    }

    @After
    public void afterEach() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void afterAll() {
        driver.quit();
    }
}

