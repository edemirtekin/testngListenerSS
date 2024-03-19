package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotMethod {

    //Screen Shot Method
    public static void captureScreenshot(String testName) {

        /*
        1- Burada benzersiz bir dosya adı oluşturmak için zaman formatı kullanılarak "timestamp" isimli bir string ifade oluşturduk
        2- Dosya yolunu (path) tanımladık
        3- Screenshot alabilmek için gerekli kodları ekledik

        1- Here we created a string expression named "timestamp" using the time format to create a unique file name.
        2- We defined the file path
        3- We added the necessary codes to take screenshots
         */

        String timestamp = new SimpleDateFormat("hh_mm_ss_ddMMyyyy").format(new Date());
        String path = "TestOutput/failureSS" + "[" + testName + "]" + timestamp + ".png";
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();

        try {
            FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(path));
            System.out.println("Screenshot taken: " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
