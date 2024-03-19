package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ScreenshotListener;


@Listeners(ScreenshotListener.class)

public class Test01 {

    @Test
    public void SsTest() {

        // Visit YouTube
        Driver.getDriver().get("https:youtube.com");
        System.out.println(Driver.getDriver().getTitle());

        // an expression not included in the title was written to make the test fail.
        // testin fail olması için title da olmayan bir ifade yazıldı.
        Assert.assertTrue(Driver.getDriver().getTitle().contains("xxx"));
    }
}
