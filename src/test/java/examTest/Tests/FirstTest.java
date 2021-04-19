package examTest.Tests;

import examTest.Allure.AllureScreenShooter;
import examTest.Driver;
import examTest.ListenerTest;
import examTest.LoginPage.LoginPage;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static examTest.LoginPage.LoginPage.insertUserName;
@Listeners({ListenerTest.class, AllureScreenShooter.class})
public class FirstTest {
    @BeforeTest
    void init(){
        Driver.getDriver();
    Driver.getURL();}

    @Test
    @Step
    void AuthPage(){
        insertUserName("ntv-212@yandex.com");
        LoginPage.insertUserPassword("MISha2212");
        LoginPage.clickSignInButton();
    }



    @AfterTest
    void quit() {
        Driver.closeDriver();
    }
}
