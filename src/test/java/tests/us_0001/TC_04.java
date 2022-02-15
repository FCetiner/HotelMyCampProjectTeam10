package tests.us_0001;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;

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
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageSayfaOrtasiWelcomToOurHotelYaziElementi);
        softAssert.assertTrue(hmcPage.mainPageSayfaOrtasiWelcomToOurHotelYaziElementi.isDisplayed());
    }

    @Test(priority = 2)
    public void facebookLinkiTest(){
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageilkFacebookIkonu);
        //3-Facebook linkini tiklar
        //Facebook sayfasina yonlendirilir
        hmcPage.mainPageilkFacebookIkonu.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedWord="facebook";
        softAssert.assertTrue(actualUrl.contains(expectedWord));
    }

    @Test(priority = 3)
    public void googlePlusLinkiTesti(){
        //4-Google linkini tiklar
        //Google plus sayfasina yonlendirilir
        hmcPage.mainPageilkGooglePlusIkonu.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedWord="google";
        softAssert.assertTrue(actualUrl.contains(expectedWord));

    }

    @Test(priority = 4)
    public void InstagramLinkiTesti(){
        //5-Instagram linkini tiklar
        //Instagram sayfasina yonlendirilir
        hmcPage.mainPageilkInstagramIkonu.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedWord="instagram";
        softAssert.assertTrue(actualUrl.contains(expectedWord));
        softAssert.assertAll();
    }








}
