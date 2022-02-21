package tests.us_0002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.TestBaseRapor;

public class TC_001 extends TestBaseRapor {

    @Test
    public void anasayfaTesti(){

        HMCPage hmcpage=new HMCPage();
        hmcpage.anasayfaGiris();
        Assert.assertTrue(hmcpage.hotelMyCampYazisi.isDisplayed());
        extentTest=extentReports.createTest("Anasayfa giris testi","Basarili giris yapilabildi");
        extentTest.pass("Anasayfaya basarili giris yapılabildi");

        for (int i = 0; i < hmcpage.anasayfadakiWebElementler.size(); i++) {
            Assert.assertTrue(hmcpage.anasayfadakiWebElementler.get(i).isDisplayed());
        }
        Assert.assertTrue(hmcpage.ilkLoginLinki.isDisplayed());
        extentTest.pass("Anasayfada ki web elementler gorundu");

    }

}
