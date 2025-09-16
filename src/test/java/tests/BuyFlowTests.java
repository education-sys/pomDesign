package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.*;

import java.time.Duration;

public class BuyFlowTests extends BaseTest {

    LogInPage logInPage = new LogInPage(driver, Duration.ofSeconds(10));
    HomePage homePage = new HomePage(driver, Duration.ofSeconds(10));
    CheckOutCompletePage checkOutCompletePage = new CheckOutCompletePage(driver, Duration.ofSeconds(10));
    CheckOutOverviewPage checkOutOverviewPage = new CheckOutOverviewPage(driver, Duration.ofSeconds(10));
    CheckOutUsersInfoPage checkOutUsersInfoPage = new CheckOutUsersInfoPage(driver, Duration.ofSeconds(10));
    CartPage cartPage = new CartPage(driver, Duration.ofSeconds(10));



    @Test
    public void buyflow() {
        logInPage.logInAction();
        homePage.addToCartAction();
        checkOutOverviewPage.clickOnCheckoutGreenButton();
        checkOutUsersInfoPage.fillUsersInfoAndContinue();
        cartPage.clickOnFinishButton();
        Assert.assertTrue(checkOutCompletePage.orderCompletedSectionPresent());
    }


    


}
