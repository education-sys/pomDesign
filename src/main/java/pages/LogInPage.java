package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LogInPage extends BasePage {

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMsg = By.cssSelector("[data-test='error']");

    public LogInPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

    public void logInAction(){
        type(username, "standard_user");
        driver.findElement(password).sendKeys("secret_sauce");
        click(loginBtn);
    }




}
