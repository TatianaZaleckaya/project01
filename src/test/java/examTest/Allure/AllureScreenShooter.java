package examTest.Allure;

import examTest.Allure.AllureHelpers;
import org.testng.ITestResult;
import org.testng.reporters.ExitCodeListener;

public class AllureScreenShooter extends ExitCodeListener {

    /**
     * Класс для снятия скриншотов Allure.
     *
     * @param result - это ITestResult.
     */
    public void onTestFailure(final ITestResult result) {
        super.onTestFailure(result);
        AllureHelpers.takeScreenshot();

    }
}