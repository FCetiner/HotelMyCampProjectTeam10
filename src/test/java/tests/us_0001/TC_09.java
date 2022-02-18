package tests.us_0001;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.TestBaseRapor;

public class TC_09 extends TestBaseRapor {
    //TC09-Recent Blog bolumu icerisindeki elementler tiklanabilir olmali.

    @Test
    public void test(){
        HMCPage hmcPage=new HMCPage();
        extentTest=extentReports.createTest("TC_08","Misafi yorumlari elementi gorunurlugu testi");
        hmcPage.anasayfaGiris();
        extentTest.info("anasayfaya gidildi");
        SoftAssert softAssert=new SoftAssert();
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageBlogsWebElement1);
        hmcPage.mainPageBlogsWebElement1.click();
        extentTest.info("1. Blog linki tiklandi");
        String actualUrl1= Driver.getDriver().getCurrentUrl();
        String expectedWord="ContentDetails";
        softAssert.assertTrue(actualUrl1.contains(expectedWord),"1. Blog sayfasi acilmamaktadir");
        Driver.getDriver().navigate().back();

        hmcPage.mainPageBlogsWebElement2.click();
        extentTest.info("2. Blog linki tiklandi");
        String actualUrl2= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl2.contains(expectedWord),"2. Blog sayfasi acilmamaktadir");
        Driver.getDriver().navigate().back();

        hmcPage.mainPageBlogsWebElement3.click();
        extentTest.info("3. Blog linki tiklandi");
        String actualUrl3= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl3.contains(expectedWord),"3. Blog sayfasi acilmamaktadir");
        Driver.getDriver().navigate().back();

        hmcPage.mainPageBlogsWebElement4.click();
        extentTest.info("4. Blog linki tiklandi");
        String actualUrl4= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl4.contains(expectedWord),"4. Blog sayfasi acilmamaktadir");

        softAssert.assertAll();
        extentTest.pass("Blog linkleri calismaktadir");

    }



}
