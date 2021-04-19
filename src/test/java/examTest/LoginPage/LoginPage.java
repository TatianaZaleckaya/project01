package examTest.LoginPage;



import examTest.BasePage;

import static examTest.LoginPage.LoginPageLocators.*;

public class LoginPage extends BasePage {


    public static void insertUserName(String text){
        input(USERNAME_INPUT, text );
    }

    public static void insertUserPassword(String text) {
        input(PASSWORD_INPUT, text);
    }

    public static void clickSignInButton() {
        clickButton(SIGN_IN_BUTTON);
    }
}
