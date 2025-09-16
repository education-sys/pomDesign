package tests;

import pages.*;

import java.time.Duration;

import static tests.BaseTest.driver;

public class SortingTests {

    LogInPage logInPage = new LogInPage(driver, Duration.ofSeconds(10));
    HomePage homePage = new HomePage(driver, Duration.ofSeconds(10));
    CheckOutCompletePage checkOutCompletePage = new CheckOutCompletePage(driver, Duration.ofSeconds(10));
    CheckOutOverviewPage checkOutOverviewPage = new CheckOutOverviewPage(driver, Duration.ofSeconds(10));
    CheckOutUsersInfoPage checkOutUsersInfoPage = new CheckOutUsersInfoPage(driver, Duration.ofSeconds(10));
    CartPage cartPage = new CartPage(driver, Duration.ofSeconds(10));
















}
