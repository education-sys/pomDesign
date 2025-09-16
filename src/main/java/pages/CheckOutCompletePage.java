package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CheckOutCompletePage extends BasePage {

    private By orderCompletedSection = By.id("checkout_complete_container");

    public CheckOutCompletePage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

    public boolean orderCompletedSectionPresent(){
        return driver.findElement(orderCompletedSection).isDisplayed();
    }






}
