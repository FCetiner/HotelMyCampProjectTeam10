package tests.us_0010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_05 extends TestBaseRapor {
    KullaniciHotelReservationPage kullaniciHotelReservationPage;
    @Test
    public void testCase05() throws InterruptedException {
        //http://www.hotelmycamp.com/ url'e gidilir
        //"Log in" butonuna tıklar
        //"Username" ve "password" bilgileri girilir ve "Log in" linkine tiklanir
        //"User Menu" altindaki "Reservations" buttonuna tiklanir
        //"Reservations" sayfasindaki reserve edilen oda kullanici sayfasinda gorulur

        extentTest=extentReports.createTest("kullanicinin yaptıgi rezervasyonu gorme ","\"User menu\"den \"Reservations\" butonunu tiklayarak, otel reservasyonlarini gorebilmeli.");
        kullaniciHotelReservationPage =new KullaniciHotelReservationPage();

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidilir");


        kullaniciHotelReservationPage.logInButtonu.click();
        extentTest.info("\"Log in\" butonuna tıklar");

        kullaniciHotelReservationPage.usernameBox.sendKeys("Firuze"+ Keys.ENTER);
        kullaniciHotelReservationPage.passwordBox.sendKeys("12345Aa."+ Keys.ENTER);
        kullaniciHotelReservationPage.ikinciLoginButonu.click();

        extentTest.info("\"Username\" ve \"password\" bilgileri girilir ve \"Log in\" linkine tiklanir");

        kullaniciHotelReservationPage.profileUrldekiButton.click();
        extentTest.info("\"Profile \" buttonuna tiklandi");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        kullaniciHotelReservationPage.reservationsButton.click();
        extentTest.info("\"User Menu\" altindaki \"Reservations\" buttonuna tiklandi");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(kullaniciHotelReservationPage.reservationsTextStr.isEnabled());
        System.out.println("Kullanici Sayfa Rooms Text " + kullaniciHotelReservationPage.reservationsTextStr);

        softAssert.assertTrue(kullaniciHotelReservationPage.room.isDisplayed());
        extentTest.info("Room yazisi gozuktu");
        System.out.println("room yazisi"+ kullaniciHotelReservationPage.room.getText());
        softAssert.assertTrue(kullaniciHotelReservationPage.price.isDisplayed());
        extentTest.info("Price yazisi gozuktu");
        System.out.println("price  yazisi"+ kullaniciHotelReservationPage.price.getText());
        softAssert.assertTrue(kullaniciHotelReservationPage.startDate.isDisplayed());
        extentTest.info("otele giris  yazisi gozuktu");
        System.out.println("startdate yazisi"+ kullaniciHotelReservationPage.startDate.getText());
        softAssert.assertTrue(kullaniciHotelReservationPage.endDate.isDisplayed());
        extentTest.info("cikis tarihi  yazisi gozuktu");
        System.out.println("endDate yazisi"+ kullaniciHotelReservationPage.endDate.getText());
        softAssert.assertTrue(kullaniciHotelReservationPage.approved.isDisplayed());
        extentTest.info("approved yazisi gozuktu");
        System.out.println("approved yazisi"+ kullaniciHotelReservationPage.approved.getText());
        extentTest.pass("\"Reservations\" sayfasindaki reserve edilen oda kullanici sayfasinda goruldu");
        extentTest.info("Reserve edilen ayni oda, ayni tarihte baska kullanici tarafindan da reserve edilebiliyor");
        Driver.closeDriver();
    }
}
