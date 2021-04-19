package examTest.Tests;

import examTest.Driver;
import examTest.RegistrationPage.RegistrationPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest {
    @BeforeTest
    void init(){
        Driver.getDriver();
    Driver.getURL();
    }


    @Test
    @Step
    void registration(){
        RegistrationPage.getPage(By.xpath("//*[@id=\"overlays\"]/div[5]/div/div/div[2]/button"));
        RegistrationPage.clickBut();
        RegistrationPage.insertUserAge("");
        RegistrationPage.insertUserName("Tanya");
        RegistrationPage.insertEmail("");
        RegistrationPage.insertUserPassword("TatiAna1313");
        RegistrationPage.clickSignInButton();
    }
    @AfterTest
    void quit() {
        Driver.closeDriver();
    }


}
