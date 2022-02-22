package tests.us_0002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_002 extends TestBaseRapor {
    HMCPage hmcPage;
    @Test
    public void yoneticiGirisTesti() {

         hmcPage = new HMCPage();
        hmcPage.anasayfaGiris();
        hmcPage.yoneticigirisYap();
        Assert.assertTrue(hmcPage.managerDrapDown.isDisplayed());
        extentTest=extentReports.createTest("Yonetici giris testi","Yanetici girisi yapilabildi");
        extentTest.pass("Yonatici basarili giris yapabildi");
       // hmcPage.anasayfaGiris();
        //hmcPage.loginOutElementi.click();
        Driver.closeDriver();

    }



}
