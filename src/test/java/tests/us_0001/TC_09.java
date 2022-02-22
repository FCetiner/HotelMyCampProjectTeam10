package tests.us_0001;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_09 extends TestBaseRapor {
    //TC09-Recent Blog bolumu icerisindeki elementler tiklanabilir olmali.
    HMCPage hmcPage=new HMCPage();
    @Test
    public void blog1LinkiTesti() {
        hmcPage = new HMCPage();
        extentTest = extentReports.createTest("TC09 Recent Blog linkleri Testi", "1. blog linkinin calisip calismadigi test edildi ");
        hmcPage.anasayfaGiris();
        extentTest.info("anasayfaya gidildi");
        ReusableMethods.waitFor(5);
        SoftAssert softAssert = new SoftAssert();
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageBlogsWebElement1);
        hmcPage.mainPageBlogsWebElement1.click();
        extentTest.info("1. Blog linki tiklandi");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedWord = "ContentDetails";
        softAssert.assertTrue(actualUrl.contains(expectedWord), "1. Blog sayfasi acilmamaktadir");
        softAssert.assertAll();
        extentTest.pass("1. blog linki calismaktadir");
    }

    @Test
    public void blog2LinkiTesti() {
        hmcPage = new HMCPage();
        extentTest = extentReports.createTest("TC09 Recent Blog linkleri Testi", "2. blog linkinin calisip calismadigi test edildi ");
        hmcPage.anasayfaGiris();
        extentTest.info("anasayfaya gidildi");
        ReusableMethods.waitFor(5);
        SoftAssert softAssert = new SoftAssert();
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageBlogsWebElement2);
        hmcPage.mainPageBlogsWebElement2.click();
        extentTest.info("2. Blog linki tiklandi");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedWord = "ContentDetails";
        softAssert.assertTrue(actualUrl.contains(expectedWord),"2. Blog sayfasi acilmamaktadir");
        softAssert.assertAll();
        extentTest.pass("2. blog linki calismaktadir");
    }

    @Test
    public void blog3LinkiTesti() {
        HMCPage hmcPage = new HMCPage();
        extentTest = extentReports.createTest("TC09 Recent Blog linkleri Testi", "3. blog linkinin calisip calismadigi test edildi ");
        hmcPage.anasayfaGiris();
        extentTest.info("anasayfaya gidildi");
        ReusableMethods.waitFor(3);
        SoftAssert softAssert = new SoftAssert();
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageBlogsWebElement3);
        hmcPage.mainPageBlogsWebElement3.click();
        extentTest.info("3. Blog linki tiklandi");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedWord = "ContentDetails";
        softAssert.assertTrue(actualUrl.contains(expectedWord),"3. Blog sayfasi acilmamaktadir");
        softAssert.assertAll();
        extentTest.pass("2. blog linki calismaktadir");
    }

    @Test
    public void blog4LinkiTesti() {
        hmcPage = new HMCPage();
        extentTest = extentReports.createTest("TC09 Recent Blog linkleri Testi", "4. blog linkinin calisip calismadigi test edildi ");
        hmcPage.anasayfaGiris();
        extentTest.info("anasayfaya gidildi");
        ReusableMethods.waitFor(3);
        SoftAssert softAssert = new SoftAssert();
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageBlogsWebElement3);
        hmcPage.mainPageBlogsWebElement4.click();
        extentTest.info("4. Blog linki tiklandi");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedWord = "ContentDetails";
        softAssert.assertTrue(actualUrl.contains(expectedWord),"3. Blog sayfasi acilmamaktadir");
        softAssert.assertAll();
        extentTest.pass("3. blog linki calismaktadir");
    }

}
