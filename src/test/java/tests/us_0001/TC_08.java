package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.JSUtils;
import utilities.TestBaseRapor;

public class TC_08 extends TestBaseRapor {
    //TC_08-Misafir yorumlari bolumu gorunur olmali

    @Test
    public void test(){
        //1-kullanici url'e gider
        HMCPage hmcPage=new HMCPage();
        extentTest=extentReports.createTest("TC08 Misafir yorumlari gorunurlugu testi","Misafi yorumlari elementi gorunurlugu testi");
        hmcPage.anasayfaGiris();
        extentTest.info("anasayfaya gidildi");
        JSUtils.scrollIntoVIewJS(hmcPage.mainPagemisafirYorumlariWebElemet);
        Assert.assertTrue(hmcPage.mainPagemisafirYorumlariWebElemet.isDisplayed());
        extentTest.pass("Misafir yorumlari gorulmektedir");

    }
}
