package tests.us_0010;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_05 extends TestBaseRapor {
    @Test
    public void testCase05() throws InterruptedException {
        //http://www.hotelmycamp.com/ url'e gidilir
        //"Log in" butonuna tıklar
        //"Username" ve "password" bilgileri girilir ve "Log in" linkine tiklanir
        //"User Menu" altindaki "Reservations" buttonuna tiklanir
        //"Reservations" sayfasindaki reserve edilen oda kullanici sayfasinda gorulur

        extentTest=extentReports.createTest("kullanicinin yaptıgi rezervasyonu gorme ","\"User menu\"den \"Reservations\" butonunu tiklayarak, otel reservasyonlarini gorebilmeli.");
        KullaniciHotelReservationPage hmcPage10=new KullaniciHotelReservationPage();

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidilir");

        hmcPage10.logInButtonu.click();
        extentTest.info("\"Log in\" butonuna tıklar");

        hmcPage10.usernameBox.sendKeys("Firuze"+ Keys.ENTER);
        hmcPage10.passwordBox.sendKeys("12345Aa."+ Keys.ENTER);
        hmcPage10.ikinciLoginButonu.click();
        extentTest.info("\"Username\" ve \"password\" bilgileri girilir ve \"Log in\" linkine tiklanir");

        hmcPage10.profileUrldekiButton.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP)
                .perform();
        hmcPage10.reservationsButton.click();
        extentTest.info("\"User Menu\" altindaki \"Reservations\" buttonuna tiklanir");

        Assert.assertTrue(hmcPage10.reservationsTextStr.isEnabled());
        System.out.println("Kullanici Sayfa Rooms Text " + hmcPage10.reservationsTextStr);

        Assert.assertTrue(hmcPage10.room.isDisplayed());
        System.out.println("room yazisi"+hmcPage10.room.getText());
        Assert.assertTrue(hmcPage10.price.isDisplayed());
        System.out.println("price  yazisi"+hmcPage10.price.getText());
        Assert.assertTrue(hmcPage10.startDate.isDisplayed());
        System.out.println("startdate yazisi"+hmcPage10.startDate.getText());
        Assert.assertTrue(hmcPage10.endDate.isDisplayed());
        System.out.println("endDate yazisi"+hmcPage10.endDate.getText());
        Assert.assertTrue(hmcPage10.approved.isDisplayed());
        System.out.println("approved yazisi"+hmcPage10.approved.getText());
        extentTest.pass("\"Reservations\" sayfasindaki reserve edilen oda kullanici sayfasinda gorulur");
        extentTest.info("Reserve edilen ayni oda, ayni tarihte baska kullanici tarafindan da reserve edilebiliniyor");
    }
}
