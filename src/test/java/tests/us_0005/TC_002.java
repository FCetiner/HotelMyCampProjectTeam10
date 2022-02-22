package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelListPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_002 extends TestBaseRapor {
    HMCPage hmcPage = new HMCPage();
    HotelListPage hotelListPage = new HotelListPage();

    @Test
    public void test() throws IOException {

        extentTest = extentReports.createTest("TC_002", "Yönetici olarak otel kayıt formuna ulaşabilmeli");

        //Hotel anasayfasina gidin
        extentTest.info("web sitesi başarılıyla açıldı");

        // Login butonuna tıklayın
        extentTest.info("web sitesi başarılıyl");

        //geçerli bir username girin
        extentTest.info("geçerli bir username girildi");

        //geçerli bir password girin
        extentTest.info("geçerli bir password girildi");

        //Log in  tusuna basin
        hotelListPage.anasayfaGiris();
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

        //"Edit Hotel" başlığının görünürlüğünü kontrol edin
        Assert.assertTrue(hotelListPage.editTextElement.isDisplayed());
        extentTest.pass(" Edit Hotel başlığının görünürlüğünü doğurlandı");
        ReusableMethods.getScreenshot("Edit Hotel başlığının görünürlüğünü doğurlandı");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelListPage.logOut.click();
    }
}
