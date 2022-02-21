package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class TC_01 extends TestBaseRapor {

//TC_01-Kullanıcı,  Home, Rooms, Restaurant, AboutBlog, Contact, ve Log in  butonlarini  tiklayabilmeli
    @Test
    public void homeButtonTest() {
        extentTest = extentReports.createTest("TC01 NevBar Butonlari calisiyor mu testi", "HomeButton Testi");
        HMCPage hmcPage = new HMCPage();
        SoftAssert softAssert = new SoftAssert();
        //1-kullanici url'e gider
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(3);
        extentTest.info("Ana sayfaya giriş yapildi");
        //2-Kullanici home butonuna tiklar
        //Kullanici home sayfasina yönlendirilmelidir
        hmcPage.mainPageHomeButton.click();
        extentTest.info("home button tiklandi");
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Hotelmycamp - Home";
        softAssert.assertEquals(actualTitle, expectedTitle, "Home button is not working");
        softAssert.assertAll();
        extentTest.pass("Home button ilgili sayfaya yonlendirme yapmaktadir");
    }

    @Test
    public void roomsButtonTest() {
        extentTest = extentReports.createTest("TC01 NevBar Butonlari calisiyor mu testi", "RoomsButton Testi");
        HMCPage hmcPage = new HMCPage();
        SoftAssert softAssert = new SoftAssert();
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(3);
        extentTest.info("Ana sayfaya giriş yapildi");
        //3-Kullanici rooms butonuna tiklar
        //Kullanicinin rooms sayfasina yönlendirilmelidir
        hmcPage.mainPageRoomsButton.click();
        extentTest.info("rooms button tiklandi");
        boolean isRoomsPage=Driver.getDriver().getCurrentUrl().contains("rooms");
        softAssert.assertTrue(isRoomsPage,"Rooms button is not working");
        softAssert.assertAll();
        extentTest.pass("Rooms button ilgili sayfaya yonlendirme yapmaktadir");
    }

    @Test
    public void restaurantButtonTest() {
        extentTest = extentReports.createTest("TC01 NevBar Butonlari calisiyor mu testi", "RestaurantButton Testi");
        HMCPage hmcPage = new HMCPage();
        SoftAssert softAssert = new SoftAssert();
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(3);
        extentTest.info("Ana sayfaya giriş yapildi");
        //4-Kullanici restaurant butonuna tiklar
        //Kullanicinin restaurant sayfasina yönlendirilmelidir
        hmcPage.mainPageRestaurantButton.click();
        extentTest.info("restaurant button tiklandi");
        boolean isRestaurantPage=Driver.getDriver().getCurrentUrl().contains("restaurant");
        softAssert.assertTrue(isRestaurantPage,"Restaurant button is not working");
        softAssert.assertAll();
        extentTest.pass("Restaurant button ilgili sayfaya yonlendirme yapmaktadir");
    }

    @Test
    public void aboutButtonTest() {
        extentTest = extentReports.createTest("TC01 NevBar Butonlari calisiyor mu testi", "aboutButton Testi");
        HMCPage hmcPage = new HMCPage();
        SoftAssert softAssert = new SoftAssert();
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(3);
        extentTest.info("Ana sayfaya giriş yapildi");
        //5-Kullanici aboutBlog butonuna tiklar
        //Kullanicinin about blog sayfasina yönlendirilmelidir
        hmcPage.mainPageAboutButton.click();
        extentTest.info("about button tiklandi");
        boolean isAboutPage=Driver.getDriver().getCurrentUrl().contains("about");
        softAssert.assertTrue(isAboutPage,"About button is not working");
        softAssert.assertAll();
        extentTest.pass("About button ilgili sayfaya yonlendirme yapmaktadir");
        
    }

    @Test
    public void blogsButtonTest() {
        extentTest = extentReports.createTest("TC01 NevBar Butonlari calisiyor mu testi", "blogBlogButton Testi");
        HMCPage hmcPage = new HMCPage();
        SoftAssert softAssert = new SoftAssert();
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(3);
        extentTest.info("Ana sayfaya giriş yapildi");
        //6-Kullanici blogs butonuna tiklar
        //Kullanicinin blogs sayfasina yönlendirilmelidir
        hmcPage.mainPageBlogButton.click();
        extentTest.info("blog button tiklandi");
        boolean isBlogPage=Driver.getDriver().getCurrentUrl().contains("blog");
        softAssert.assertTrue(isBlogPage,"Blog button is not working");
        softAssert.assertAll();
        extentTest.pass("Blog button ilgili sayfaya yonlendirme yapmaktadir");
    }

    @Test
    public void contactButtonTest() {
        extentTest = extentReports.createTest("TC01 NevBar Butonlari calisiyor mu testi", "contactBlogButton Testi");
        HMCPage hmcPage = new HMCPage();
        SoftAssert softAssert = new SoftAssert();
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(3);
        extentTest.info("Ana sayfaya giriş yapildi");
        //7-Kullanici contact butonuna tiklar
        //Kullanicinin contact sayfasina yönlendirilmelidir
        hmcPage.mainPageContactButton.click();
        extentTest.info("contact button tiklandi");
        boolean isContactPage=Driver.getDriver().getCurrentUrl().contains("contact");
        softAssert.assertTrue(isContactPage,"Contact button is not working");
        softAssert.assertAll();
        extentTest.pass("Contact button ilgili sayfaya yonlendirme yapmaktadir");
    }

}
