package tests;

import driver.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {
    Browser browser;

    @BeforeTest
    public void setup() {
        browser = new Browser();
        browser.open("chrome");
        browser.goToUrl("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 1)
    public void login() {
        LoginPage loginPage = new LoginPage();

        Assert.assertTrue(loginPage.setUsername("Admin"));
        Assert.assertTrue(loginPage.setPassword("admin123"));
        Assert.assertTrue(loginPage.submit());
        Assert.assertEquals(browser.getTitle(), "OrangeHRM");
    }

    @AfterTest
    public void shutdown() {
        if (browser != null)
            browser.close();
    }
}