package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.JSUtils;
import utilities.TestBaseRapor;

public class TC_07 {
    //TC_07-Happy Guests, Rooms, Staffs,Destination bolumu gorunur olmali
    //extends TestBaseRapor

    @Test
    public void test(){
        //1-kullanici url'e gider
        HMCPage hmcPage=new HMCPage();
        hmcPage.anasayfaGiris();
    //    extentTest.info("anasayfaya gidildi");
    //    extentTest=extentReports.createTest("TC_07","Happy Guests, Rooms, Staffs,Destination elementlerinin gorunurlugu test edildi");
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageOtelBilgileriBasliklari1);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hmcPage.mainPageOtelBilgileriBasliklari1.isDisplayed());
        softAssert.assertTrue(hmcPage.mainPageOtelBilgileriBasliklari2.isDisplayed());
        softAssert.assertTrue(hmcPage.mainPageOtelBilgileriBasliklari3.isDisplayed());
        softAssert.assertTrue(hmcPage.mainPageOtelBilgileriBasliklari4.isDisplayed());

        softAssert.assertAll();
        //    extentTest.pass("Tum otel basliklari gorunur oldugu test edildi");
    }

}
