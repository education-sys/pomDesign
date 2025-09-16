package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CheckOutOverviewPage extends BasePage {

    private By checkoutGreenButton = By.id("checkout");

    public CheckOutOverviewPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

    public void clickOnCheckoutGreenButton(){
        driver.findElement(checkoutGreenButton).click();
    }








}
