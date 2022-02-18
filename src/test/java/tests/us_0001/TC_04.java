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
import utilities.TestBaseRapor;

public class TC_04 {
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
     //   extentTest=extentReports.createTest("","");
     //   extentTest.info("Anasayfaya gidildi");
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageSayfaOrtasiWelcomToOurHotelYaziElementi);
        softAssert.assertTrue(hmcPage.mainPageSayfaOrtasiWelcomToOurHotelYaziElementi.isDisplayed());
     //   extentTest.info("Welcome to Hotel yazi elementi goruldu");
    }

    @Test(priority = 2)
    public void facebookLinkiTest(){
        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageilkFacebookIkonu);
       // extentTest.info("Facebook ikonu tiklandi");
        //3-Facebook linkini tiklar
        //Facebook sayfasina yonlendirilir
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedWord="facebook";
        softAssert.assertTrue(actualUrl.contains(expectedWord),"facebook sayfasina gidilmedi");

    }

    @Test(priority = 3)
    public void googlePlusLinkiTesti(){
        //4-Google linkini tiklar
        //Google plus sayfasina yonlendirilir
        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageilkGooglePlusIkonu);
       // extentTest.info("Google plus ikonu tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedWord="google";
        softAssert.assertTrue(actualUrl.contains(expectedWord),"googlePlus sayfasina gidilmedi");

    }

    @Test(priority = 4)
    public void InstagramLinkiTesti(){
        //5-Instagram linkini tiklar
        //Instagram sayfasina yonlendirilir
        JSUtils.elementiGoreneKadarKaydirVeTikla(hmcPage.mainPageilkInstagramIkonu);
       // extentTest.info("Instagram ikonu tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedWord="instagram";
        softAssert.assertTrue(actualUrl.contains(expectedWord),"instagram sayfasina gidilmedi");

    }



    @AfterClass
    public void teardown(){
       Driver.closeDriver();
        softAssert.assertAll();
       // extentTest.pass("Test basarili");
    }



}
