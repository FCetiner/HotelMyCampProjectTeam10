package tests.us_0001;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_11 extends TestBaseRapor {
    //TC11-Sayfanin en altinda bulunan  linkler ilgili sayfaya yonlendirmeli
    HMCPage hmcPage=new HMCPage();
    SoftAssert softAssert=new SoftAssert();

    @BeforeMethod
    public void sayfayaGit(){
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(3);
        JSUtils.scrollIntoVIewJS(hmcPage.mainPageFooter);
    }

    @Test
    public void giftCardLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","gifcard linki test edildi");
        hmcPage.mainPageUsefulLinkGiftCard.click();
        extentTest.info("giftCard linki tiklandi");
    String actualUrl=Driver.getDriver().getCurrentUrl();
    softAssert.assertTrue(actualUrl.contains("GiftCard"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("giftCard linki calismaktadir");
    }

    @Test
    public void blogLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","blog linki test edildi");
        hmcPage.mainPageUsefulLinkBlog.click();
        extentTest.info("blog linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("blog"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("blog linki calismaktadir");
    }

    @Test
    public void roomsLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","rooms linki test edildi");
        hmcPage.mainPageUsefulLinkRooms.click();
        extentTest.info("rooms linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("rooms"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("rooms linki calismaktadir");
    }

    @Test
    public void amentitiesLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","amentities linki test edildi");
        hmcPage.mainPageUsefulLinkAmentitiesTest.click();
        extentTest.info("amentities linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("amentities"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("amentities linki calismaktadir");
    }

    @Test
    public void career(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","career linki test edildi");
        hmcPage.mainPagePrivacyGiftCareer.click();
        extentTest.info("career linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("career"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("career linki calismaktadir");
    }

    @Test
    public void aboutUsLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","about us linki test edildi");
        hmcPage.mainPagePrivacyAboutUs.click();
        extentTest.info("aboutUs linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("about us"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("aboutUs linki calismaktadir");
    }
    @Test
    public void contactUsLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","contact linki test edildi");
        hmcPage.mainPagePrivacyContactUs.click();
        extentTest.info("ContactUs linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("contact us"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("contactUs linki calismaktadir");
    }

    @Test
    public void servicesLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","service linki test edildi");
        hmcPage.mainPagePrivacyServices.click();
        extentTest.info("Services linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("services"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("services linki calismaktadir");
    }

    @Test
    public  void telephoneLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","telephone linki test edildi");
        hmcPage.mainPageTelephoneLink.click();
        extentTest.info("telephone linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("telephone"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("telephone linki calismaktadir");
    }

    @Test
    public  void emailLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","email linki test edildi");
        hmcPage.mainPageEmailLink.click();
        extentTest.info("email linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("email"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("email linki calismaktadir");

    }

    @Test
    public  void twitterLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","twitter linki test edildi");
        hmcPage.mainPageFooterTwitterIkon.click();
        extentTest.info("twitter linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("twitter"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("twitter linki calismaktadir");
    }

    @Test
    public  void facebookLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","facebook linki test edildi");
        hmcPage.mainPageFooterFacebookIkon.click();
        extentTest.info("facebook linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("facebook"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("facebook linki calismaktadir");
    }

    @Test
    public  void instagramLinkTest(){
        extentTest=extentReports.createTest("TC11 MainPage Footage bolumu link testi","instagram linki test edildi");
        hmcPage.mainPageFooterInstagramIkon.click();
        extentTest.info("instagram linki tiklandi");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("instagram"),"link ilgili sayfaya yonlendirmemektedir");
        softAssert.assertAll();
        extentTest.pass("instagram linki calismaktadir");
    }

}
