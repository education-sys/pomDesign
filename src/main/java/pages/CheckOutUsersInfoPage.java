package pages;

import org.openqa.selenium.By;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CheckOutUsersInfoPage extends BasePage {

    private By firstNameInputField = By.id("first-name");

    private By lastNameInputField = By.id("last-name");

    private By zipCodeInputField = By.id("postal-code");

    private By continueButton = By.id("continue");

    Faker faker = new Faker();

    public CheckOutUsersInfoPage(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }

    public void fillUsersInfoAndContinue(){
        driver.findElement(firstNameInputField).sendKeys(faker.name().firstName());
        driver.findElement(lastNameInputField).sendKeys(faker.name().lastName());
        driver.findElement(zipCodeInputField).sendKeys("11080");
        driver.findElement(continueButton).click();
    }

}
