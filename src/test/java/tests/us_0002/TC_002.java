package tests.us_0002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;

public class TC_002 {
    @Test
    public void yoneticiGirisTesti() {

        HMCPage hmcPage = new HMCPage();
        hmcPage.anasayfaGiris();
        hmcPage.yoneticigirisYap();
        Assert.assertTrue(hmcPage.managerDrapDown.isDisplayed());

    }



}
