package tests.us_0001;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_04 extends TestBaseRapor{
    HMCPage hmcPage=new HMCPage();
    SoftAssert softAssert=new SoftAssert();

    //TC_04-Welcome to our hotel bolumu gorunebilmeli, altindaki sosyal medya hesaplari tklanabilir olmali


    @BeforeClass
    public void sayfayaGit(){
        //1-kullanici url'e gider
        hmcPage.anasayfaGiris();
    }


    @Test(priority = 1)
    public void WelcometoHotelTest(){
        //2-Sayfada aşagi gider ve Welcome to Hotel yazisini gorur
        extentTest=extentReports.createTest("TC04 Sosyal Medya hesaplari linkleri testi","Welcome to Hotel Basligi gorunurlugu test edildi");
        extentTest.info("Anasayfaya gidildi");
        ReusableMethods.waitFor(5);
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageSayfaOrtasiWelcomToOurHotelYaziElementi);
        softAssert.assertTrue(hmcPage.mainPageSayfaOrtasiWelcomToOurHotelYaziElementi.isDisplayed());
        extentTest.info("Welcome to Hotel yazi elementi goruldu");
    }

    @Test(priority = 2)
    public void facebookLinkiTesti(){
        extentTest=extentReports.createTest("TC04 Sosyal Medya hesaplari linkleri testi","Anasayfada bulunan facebook linki test edildi");
        extentTest.info("Anasayfaya gidildi");
        ReusableMethods.waitFor(3);
        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageilkFacebookIkonu);
        extentTest.info("Facebook ikonu tiklandi");
        //3-Facebook linkini tiklar
        //Facebook sayfasina yonlendirilir
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedWord="facebook";
        softAssert.assertTrue(actualUrl.contains(expectedWord),"facebook sayfasina gidilmedi");
        softAssert.assertAll();
        extentTest.pass("facebook linki calisiyor");
    }

    @Test(priority = 3)
    public void googlePlusLinkiTesti(){
        extentTest=extentReports.createTest("TC04 Sosyal Medya hesaplari linkleri testi","Anasayfada bulunan googlePlus linki test edildi");
        extentTest.info("Anasayfaya gidildi");
        //4-Google linkini tiklar
        //Google plus sayfasina yonlendirilir
        ReusableMethods.waitFor(3);
        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageilkGooglePlusIkonu);
         extentTest.info("Google plus ikonu tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedWord="google";
        softAssert.assertTrue(actualUrl.contains(expectedWord),"googlePlus sayfasina gidilmedi");
        softAssert.assertAll();
        extentTest.pass("googlePlus linki calisiyor");
    }

    @Test(priority = 4)
    public void InstagramLinkiTesti(){
        extentTest=extentReports.createTest("TC04 Sosyal Medya hesaplari linkleri testi","Anasayfada bulunan Instagram linki test edildi");
        extentTest.info("Anasayfaya gidildi");
        //5-Instagram linkini tiklar
        //Instagram sayfasina yonlendirilir
        ReusableMethods.waitFor(3);
        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageilkInstagramIkonu);
        extentTest.info("Instagram ikonu tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedWord="instagram";
        softAssert.assertTrue(actualUrl.contains(expectedWord),"instagram sayfasina gidilmedi");
        softAssert.assertAll();
        extentTest.pass("Instagram linki calisiyor");
    }


}
