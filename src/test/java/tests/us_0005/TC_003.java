package tests.us_0005;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelListPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;


public class TC_003 extends TestBaseRapor {
    @Test
    public void test() throws InterruptedException, IOException {
        HMCPage hmcPage = new HMCPage();
        HotelListPage hotelListPage = new HotelListPage();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        extentTest = extentReports.createTest("TC_003", "Yönetici olarak otel bilgilerini güncelleyebilmeli");

        //Hotel anasayfasina gidin
        extentTest.info("web sitesi başarılıyla açıldı");

        // Login butonuna tıklayın
        extentTest.info("web sitesi başarılıyl");

        //geçerli bir username girin
        extentTest.info("geçerli bir username girildi");

        //geçerli bir password girin
        extentTest.info("geçerli bir password girildi");

        //Log in  tusuna basin
        hmcPage.girisYap();
        extentTest.pass("Yönetici olarak giriş yapıldı");

        //Hotel Management menüsüne tıklayın
        hmcPage.hotelManagementLinki.click();
        extentTest.pass("Management menüsü tıklandı");

        //Hotel List menüsüne tıklayın
        hmcPage.hotelListLinki.click();
        extentTest.pass("Hotel List menüsü tıklandı");

        //Details butonuna tıklayın
        hotelListPage.detailsElement.click();
        extentTest.pass("Details butonuna tıklandı");

        //Code kutusuna  bir Kod girin
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        extentTest.pass("Driver, 'Admin - Edit Hotel' sayfasına başarıyla geçiş yaptı");


        hotelListPage.codeBox.click();
        extentTest.pass("Code kutusuna tıklandı");

        hotelListPage.codeBox.clear();
        extentTest.info("Code kutusu temizlendi");

        actions.click(hotelListPage.codeBox)

                .sendKeys(hotelListPage.idString)
                .sendKeys(Keys.TAB)

                //Name kutusuna bir İsim girin
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(faker.name().fullName())

                //Adress kutusuna  Adres girin
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(faker.address().fullAddress())

                //Phone kutusuna  Tel No: girin
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(faker.phoneNumber().phoneNumber())

                //Mail kutusuna Email Adresi girin
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(faker.internet().emailAddress())
                .perform();

        extentTest.pass("Code kutusuna" + hotelListPage.idString + " yazıldı");
        extentTest.info("Name kutusuna geçiş yapıldı ve temizlendi");
        extentTest.pass("Name kutusuna isim yazıldı");
        extentTest.info("Adress kutusuna geçiş yapıldı ve temizlendi");
        extentTest.pass("Adress kutusuna adres yazıldı");
        extentTest.info("Phone kutusuna geçiş yapıldı ve temizlendi");
        extentTest.pass("Phone kutusuna telefon numarası yazıldı");
        extentTest.info("Email kutusuna geçiş yapıldı ve temizlendi");
        extentTest.pass("Email kutusuna email yazıldı");

        //Group dropdown butondan "Hotel Type1" seçin

        Select select = new Select(hotelListPage.groupIdBox);
        select.selectByValue("2");
        extentTest.info("Group dropdowna geçiş yapıldı");
        extentTest.pass("Hotel Type1 seçildi");

        //Save butonuna tıklayın
        hotelListPage.saveButton.click();
        extentTest.pass("Save butonuna tıklandı");

        // Ok butonuna tiklayiniz
        Thread.sleep(1000);
        Assert.assertTrue(hotelListPage.okButton.isDisplayed());
        hotelListPage.okButton.click();
        extentTest.pass("OK butonuna tıklandı");
        ReusableMethods.getScreenshot("OK butonuna tıklandı");


    }
}
