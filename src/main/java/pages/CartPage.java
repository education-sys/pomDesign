package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CartPage extends BasePage {

    private By finishButton = By.id("finish");

    public CartPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

    public void clickOnFinishButton(){
        waitForVisible(finishButton).click();
    }









}
