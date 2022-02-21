package tests.us_0003;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    KullaniciHotelReservationPage hmcPage10mhmt=new KullaniciHotelReservationPage();



    @Test
    public void testCase01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        // http://www.hotelmycamp.com/ url'e gidilir
        // "Log in" buttonuna tiklanmali
        // "Create a new account" butonuna tiklanilmali
        hmcPage10mhmt.logInButtonu.click();
        hmcPage10mhmt.createNewAccount.click();



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

          // "User Data was inserted successfully" texti test edilmeli, "OK" buttonuna tiklanmali
          //  String actualSaveText=hmcPage10mhmt.createSaveTexti.getText();
          //  System.out.println("actualtext"+actualSaveText);
          //  String expSaveText="User Data was inserted successfully";
          //  Assert.assertEquals(actualSaveText,expSaveText);
          //  hmcPage10mhmt.successOkButonu.click();
        //hmcPage10mhmt.createOkButton.click();

        Driver.closeDriver();

    }
}
