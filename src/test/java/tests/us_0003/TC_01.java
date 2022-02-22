package tests.us_0003;

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
    KullaniciHotelReservationPage hmcPage10mhmt;



    @Test
    public void testCase01() throws InterruptedException {
        hmcPage10mhmt=new KullaniciHotelReservationPage();
        extentTest=extentReports.createTest("kullanici yeni kayit olusturma","\"Log in\" buttonuna tiklayarak, \"Create a new account\"'tan sonra \"save\" yapabilmeli.");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url acıldi");

        // http://www.hotelmycamp.com/ url'e gidilir
        // "Log in" buttonuna tiklanmali
        // "Create a new account" butonuna tiklanilmali
        hmcPage10mhmt.logInButtonu.click();
        extentTest.info("\"Log in\" linkine tiklanildi");
        hmcPage10mhmt.createNewAccount.click();
        extentTest.info("\"Create a new account\" linkine tiklanir");



        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();


        // "Username" boxuna tiklanmali, bilgiler girilmeli
        actions.click(hmcPage10mhmt.createUsername).sendKeys(faker.name().name())

                // "Password" boxuna tiklanmali, bilgiler girilmeli
                .sendKeys(Keys.TAB).sendKeys("Abcd00.")
                // "Email" boxuna tiklanmali, bilgiler girilmeli
                .sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
                // "Full Name" boxuna tiklanmali, bilgiler girilmeli
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName())
                // "Phone No" boxuna tiklanmali, bilgiler girilmeli
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber())
                // "Social Security Number" boxuna tiklanmali, bilgiler girilmeli
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber())
                // "Driving License" boxuan tiklanmali, bilgiler girilmeli
                .sendKeys(Keys.TAB).sendKeys("Yes")
                // "Country" boxuna tiklanmali, bilgiler girilmeli
                .sendKeys(Keys.TAB).sendKeys(faker.country().name())
                // "State" boxuna tiklanmali, bilgiler girilmeli, yoksa bos birakilmali
                .sendKeys(Keys.TAB).
                // "Address" boxuna tiklanmali, bilgiler girilmeli
                sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                // "Working Sector" boxuna tiklanmali, bilgiler girilmeli
                .sendKeys(Keys.TAB).sendKeys(faker.job().position())
                // "Birth Date" boxuna tiklanmali, bilgiler girilmeli
                .sendKeys(Keys.TAB).sendKeys(faker.date().toString())
                .sendKeys(Keys.TAB)
                .perform();

        // "Save" buttonu tiklanmali ve calisip calismadigi test edilmeli
        hmcPage10mhmt.createSaveButton.click();
        extentTest.info("Yenı Hesap olusturuldu");
        extentTest.info("Create account'ta STATE box dolduralamıyor!!!!!");

          // "User Data was inserted successfully" texti test edilmeli, "OK" buttonuna tiklanmali
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertFalse(hmcPage10mhmt.createSaveTexti.isDisplayed());


        hmcPage10mhmt.createOkButton.click();
        hmcPage10mhmt.createOkButton.click();
        extentTest.info(" OK buttonu 2 defa click oluyor!!");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        softAssert.assertAll();

        extentTest.pass("\"User Data was inserted successfully\" text'i gozlenmesi gerekirken gorulemedi...");

Driver.closeDriver();

    }
}
