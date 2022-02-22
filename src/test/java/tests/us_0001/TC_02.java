package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {
    //TC_02-Kullanıcı, arka plandaki resimleri görebilmeli
    HMCPage hmcPage=new HMCPage();

    @Test
    public void logoGorunuyorMuTesti(){
        hmcPage=new HMCPage();
        extentTest=extentReports.createTest("Logo testi","Site logosunun gorunurlugu testi");
        hmcPage.anasayfaGiris();
        extentTest.info("Ana sayfaya gidildi");
        boolean isDisplayed= hmcPage.mainPageHotelMyCampTextWebElement.isDisplayed();
        Assert.assertTrue(isDisplayed);
        extentTest.pass("Logonun gorunur oldugu test edildi");

    }
}
