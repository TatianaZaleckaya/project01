package examTest.LoginPage;

import org.openqa.selenium.By;

public class LoginPageLocators {

    final static By USERNAME_INPUT =   By.cssSelector("input[data-test='email-input']");
    final static By PASSWORD_INPUT =   By.cssSelector("input[data-test='password-input']");
    final static By SIGN_IN_BUTTON =   By.xpath("//*[@id=\"overlays\"]/div[5]/div/div/form/div[1]/button");
}
