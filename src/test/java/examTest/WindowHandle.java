package examTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/*public class WindowHandle {

    public void first() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10000000, TimeUnit.MICROSECONDS);
        String parentWindowHandle = driver.getWindowHandle();

        driver.get("https://google.com");
        driver.get("https://www.duolingo.com/placement/en?isLoggingIn=true");
        WebElement Button = (WebElement) driver.findElements(By.className("_1KqTg"));
        Button.click();

        for (String winHandle : driver.getWindowHandles()){
            if(!winHandle.equals(parentWindowHandle)){
                driver.switchTo().window(winHandle);
                System.out.println("Title of the new window: " + driver.getTitle());
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]" +
                        "/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("nekhaevna2212@gmail.com");
                driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")).click();
            }
        }





} */
