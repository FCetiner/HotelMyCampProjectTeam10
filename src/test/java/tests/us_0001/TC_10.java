package tests.us_0001;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_10 extends TestBaseRapor {
    //TC10-Instagram fotograflari gorunebilir olmali
    @Test
    public void test(){
        HMCPage hmcPage=new HMCPage();
        extentTest=extentReports.createTest("TC_10","Instagram resimleri gorunurlugu testi");
        hmcPage.anasayfaGiris();
        extentTest.info("anasayfaya gidildi");
        JSUtils.scrollIntoVIewJS(hmcPage.mainPagesectionInstagram);
        ReusableMethods.waitFor(5);
        hmcPage.mainPageInstagramFotograflarListesi.stream().forEach(t-> Assert.assertTrue(t.isDisplayed()));
        extentTest.pass("Instagram resimleri gorulmektedir");

    }
}
