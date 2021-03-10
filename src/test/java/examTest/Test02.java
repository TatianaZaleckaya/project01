package examTest;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test02 {
    @BeforeTest
    void init(){Driver.getDriver();
    Driver.getURL();
    }


    @Test
    void registration(){
        RegistrationPage.getPage(By.xpath("//*[@id=\"overlays\"]/div[5]/div/div/div[2]/button"));
        RegistrationPage.clickBut();
        RegistrationPage.insertUserAge("zal83.83@mail.ru");
        RegistrationPage.insertUserName("Tanya");
        RegistrationPage.insertEmail("");
        RegistrationPage.insertUserPassword("TatiAna1313");
        RegistrationPage.clickSignInButton();
    }
    @AfterTest
    public static void quit() {
        Driver.getDriver().quit();
    }


}
