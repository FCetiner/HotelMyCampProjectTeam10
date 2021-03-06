package tests.us_0010;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {
    KullaniciHotelReservationPage kullaniciHotelReservationPage;


    @Test
    public void testCase01() {
        kullaniciHotelReservationPage = new KullaniciHotelReservationPage();
        extentTest=extentReports.createTest("kullanici yeni kayit olusturma","\"Log in\" buttonuna tiklayarak, \"Create a new account\"'tan sonra \"save\" yapabilmeli.");
         Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");

        kullaniciHotelReservationPage.logInButtonu.click();
        extentTest.info("\"Log in\" buttonuna tiklanildi");

        kullaniciHotelReservationPage.createNewAccount.click();
        extentTest.info("\"Create a new account\" butonuna tiklanir");

        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        actions.click(kullaniciHotelReservationPage.createUsername).sendKeys(faker.name().name())
                .sendKeys(Keys.TAB).sendKeys("12345Aa.")
                .sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB).sendKeys("No")
                .sendKeys(Keys.TAB).sendKeys(faker.country().name())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.job().position())
                .sendKeys(Keys.TAB).sendKeys("15.05.1994")
                .sendKeys(Keys.TAB)
                .perform();
        kullaniciHotelReservationPage.createSaveButton.click();
        extentTest.info("Kullanici yeni hesap olusturdu");
        extentTest.info("Create account'ta STATE buttonuna yazilamadi");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(kullaniciHotelReservationPage.createSaveTexti.isDisplayed());
        extentTest.pass("\"User Data was inserted successfully\" yazisi gorulemesi gerekirken gorulemedi...");

        kullaniciHotelReservationPage.createOkButton.click();
        kullaniciHotelReservationPage.createOkButton.click();
        extentTest.info("Yeni hesap olusturturduktan sonra OK buttonu 2 kere tiklanildi.bir kez tiklanmiyor");
        softAssert.assertAll();
        Driver.closeDriver();
    }
}