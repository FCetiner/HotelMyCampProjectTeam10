package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_07 extends TestBaseRapor{
    //TC_07-Happy Guests, Rooms, Staffs,Destination bolumu gorunur olmali
    HMCPage hmcPage=new HMCPage();

    @Test
    public void test(){
        //1-kullanici url'e gider
        hmcPage=new HMCPage();
        extentTest=extentReports.createTest("TC07 Baslik Gorunurlugu Testleri","Happy Guests, Rooms, Staffs,Destination elementlerinin gorunurlugu test edildi");
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(4);
        extentTest.info("anasayfaya gidildi");
        JSUtils.scrollIntoVIewJS(hmcPage.sectionCounterOtelBilgileriBolumu);
        ReusableMethods.waitFor(5);
        hmcPage.mainPageHappyGuestsBasliklarListesi.stream().forEach(t-> Assert.assertTrue(t.isDisplayed()));
        extentTest.pass("Tum otel basliklari gorunur oldugu test edildi");
    }

}
