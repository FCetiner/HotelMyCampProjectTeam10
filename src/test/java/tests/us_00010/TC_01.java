package tests.us_00010;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ArrayList;
import java.util.List;

public class TC_01 extends TestBaseRapor {
    KullaniciHotelReservationPage hmcPage10 = new KullaniciHotelReservationPage();

    /* http://www.hotelmycamp.com/ url'e gidilir
 "Log in" buttonuna tiklanmali
  "Create a new account" butonuna tiklanilmali
 "Username" boxuna tiklanmali, bilgiler girilmeli
 "Password" boxuna tiklanmali, bilgiler girilmeli
 "Email" boxuna tiklanmali, bilgiler girilmeli
 "Full Name" boxuna tiklanmali, bilgiler girilmeli
 "Phone No" boxuna tiklanmali, bilgiler girilmeli
 "Social Security Number" boxuna tiklanmali, bilgiler girilmeli
 "Driving License" boxuan tiklanmali, bilgiler girilmeli
 "Country" boxuna tiklanmali, bilgiler girilmeli
 "State" boxuna tiklanmali, bilgiler girilmeli, yoksa bos birakilmali
 "Address" boxuna tiklanmali, bilgiler girilmeli
 "Working Sector" boxuna tiklanmali, bilgiler girilmeli
 "Birth Date" boxuna tiklanmali, bilgiler girilmeli
 "Save" buttonu tiklanmali ve calisip calismadigi test edilmeli
 "User Data was inserted successfully" texti test edilmeli, "OK" buttonuna tiklanmali */
    @Test
    public void testCase01() {
        extentTest=extentReports.createTest("kullanici yeni kayit olusturma","\"Log in\" buttonuna tiklayarak, \"Create a new account\"'tan sonra \"save\" yapabilmeli.");
         Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");

        hmcPage10.logInButtonu.click();
        extentTest.info("\"Log in\" buttonuna tiklanildi");

        hmcPage10.createNewAccount.click();
        extentTest.info("\"Create a new account\" butonuna tiklanir");

        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        actions.click(hmcPage10.createUsername).sendKeys(faker.name().name())
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
                .sendKeys(Keys.TAB).sendKeys("15.05.1996")
                .sendKeys(Keys.TAB)
                .perform();
        hmcPage10.createSaveButton.click();
        extentTest.info("Kullanici yeni hesap olusturdu");
        extentTest.info("Create account'ta STATE buttonuna yazilamadi");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hmcPage10.createSaveTexti.isDisplayed());
        extentTest.pass("\"User Data was inserted successfully\" yazisi gorulemesi gerekirken gorulemedi.");

        hmcPage10.createOkButton.click();
        hmcPage10.createOkButton.click();
        extentTest.info("Yeni hesap olusturturduktan sonra OK buttonu 2 kere tiklanildi.bir kez tiklanmiyor");
       Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

softAssert.assertAll();
    }
}