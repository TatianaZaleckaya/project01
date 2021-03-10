package examTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private static WebDriver driver = Driver.getDriver();
    protected static WebElement initElement(By by){
        return driver.findElement(by);
    }

    protected static String getTitle(){
        return driver.getTitle();
    }

        protected static void input(By element, String text){
        initElement(element).sendKeys(text);
    }
    protected static void clickButton(By element){
        initElement(element).click();
    }



}
