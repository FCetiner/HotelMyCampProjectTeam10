package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.TestBaseRapor;

public class TC_01  extends TestBaseRapor{
    HMCPage hmcPage=new HMCPage();

    @Test
    public void anasayfaGirisTesti(){
        hmcPage=new HMCPage();
        hmcPage.anasayfaGiris();
        Assert.assertTrue(hmcPage.hotelMyCampYazisi.isDisplayed());
        extentTest=extentReports.createTest("Anasayfaya giris testi","Anasayfaya basarili giris yapilabildi");
        extentTest.pass("Anasayfaya giris yapildi");

}
}
