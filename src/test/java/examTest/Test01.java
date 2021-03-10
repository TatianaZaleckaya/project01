package examTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test01 {
    @BeforeTest
    void init(){Driver.getDriver();
    Driver.getURL();}

    @Test
    void AuthPage(){
        LoginPage.insertUserName("nekhaevna2212@gmail.com");
        LoginPage.insertUserPassword("vMCu2TW2DfsjvRX");
        LoginPage.clickSignInButton();
    }
    @Test
    void AuthPage1(){

        Assert.assertEquals("Duolingo - Лучший в мире способ учить языки", TitlePage.TitPage());
    }
}
