package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import static utilities.ScreenShotMethod.captureScreenshot;

public class ScreenshotListener implements ITestListener {

    /*
     Burada override edilen "onTestFailure" metodu sayesinde fail olan testler ile ilgili istediğimiz bir aksiyonu
     metot içine yazarak gerçekleştirebiliriz.
     Biz burada screenshot metodunu çağırarak ekran resmi almasını sağladık. İhtiyaçlar doğrultusunda düzenlenebilir.

     This method runs when the test fails. We added a method called "captureScreenshot" here to take a screenshot.
     This place can be arranged for different needs.
     */

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test01 failed: " + result.getName());
        captureScreenshot(result.getName());
    }
}
