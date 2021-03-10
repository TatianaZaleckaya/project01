package examTest;


import org.openqa.selenium.By;

import static examTest.RegistrationPageLocation.*;

public class RegistrationPage extends BasePage {

    public static void getPage (By element){
        initElement(element).click();}

    public static void insertUserAge (String text){
        input(AGE_UNPUT, text );
    }

    public static void insertUserName(String text) {
        input(NAME_UNPUT, text);
    }

    public static void insertEmail(String text){
        input(EMAIL_UNPUT, text);
    }

    public static void insertUserPassword (String text) { input(PASSWORD_UNPUT, text);}

    public static void clickSignInButton() {
        clickButton(SING_IN_BUTTON);
    }
    public static void clickBut(){clickButton(AGE_UNPUT);}


}
