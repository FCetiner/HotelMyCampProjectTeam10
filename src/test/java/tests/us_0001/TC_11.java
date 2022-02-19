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
    hmcPage.mainPageUsefulLinkGiftCard.click();
    String actualUrl=Driver.getDriver().getCurrentUrl();
    softAssert.assertTrue(actualUrl.contains("GiftCard"),"link ilgili sayfaya yonlendirmemektedir");
    }

    @Test
    public void blogLinkTest(){
        hmcPage.mainPageUsefulLinkBlog.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("blog"),"link ilgili sayfaya yonlendirmemektedir");
    }

    @Test
    public void roomsLinkTest(){
        hmcPage.mainPageUsefulLinkRooms.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("rooms"),"link ilgili sayfaya yonlendirmemektedir");
    }

    @Test
    public void amentitiesLinkTest(){
        hmcPage.mainPageUsefulLinkAmentitiesTest.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("amentities"),"link ilgili sayfaya yonlendirmemektedir");
    }

    @Test
    public void career(){
        hmcPage.mainPagePrivacyGiftCareer.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("career"),"link ilgili sayfaya yonlendirmemektedir");
    }

    @Test
    public void aboutUsLinkTest(){
        hmcPage.mainPagePrivacyAboutUs.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("about us"),"link ilgili sayfaya yonlendirmemektedir");
    }
    @Test
    public void contactUsLinkTest(){
        hmcPage.mainPagePrivacyContactUs.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("contact us"),"link ilgili sayfaya yonlendirmemektedir");
    }

    @Test
    public void servicesLinkTest(){
        hmcPage.mainPagePrivacyServices.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("services"),"link ilgili sayfaya yonlendirmemektedir");
    }

    @Test
    public  void telephoneLinkTest(){
        hmcPage.mainPageTelephoneLink.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("telephone"),"link ilgili sayfaya yonlendirmemektedir");
    }

    @Test
    public  void emailLinkTest(){
        hmcPage.mainPageEmailLink.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("email"),"link ilgili sayfaya yonlendirmemektedir");

    }

    @Test
    public  void twitterLinkTest(){
        hmcPage.mainPageFooterTwitterIkon.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("twitter"),"link ilgili sayfaya yonlendirmemektedir");
    }

    @Test
    public  void facebookLinkTest(){
        hmcPage.mainPageFooterFacebookIkon.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("facebook"),"link ilgili sayfaya yonlendirmemektedir");
    }

    @Test
    public  void instagramLinkTest(){
        hmcPage.mainPageFooterInstagramIkon.click();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains("instagram"),"link ilgili sayfaya yonlendirmemektedir");
        Driver.closeDriver();
        softAssert.assertAll();

    }

}
