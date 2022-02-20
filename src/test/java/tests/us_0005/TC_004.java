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

public class TC_004 extends TestBaseRapor {

    HMCPage hmcPage = new HMCPage();
    HotelListPage hotelListPage = new HotelListPage();

    @Test
    public void test() throws IOException {

        extentTest = extentReports.createTest("TC_004", "Yönetici olarak yapılan guncellemeyi gorebilmeli");

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

        //IDHotel  arama kutusuna IDHotel  no girin
        hotelListPage.searchCodeBox.click();
        extentTest.pass("Code arama kutusuna tıklandı");
        hotelListPage.searchCodeBox.sendKeys(hotelListPage.idString);
        extentTest.info("Code arama kutusuna" + hotelListPage.idString + "yazıldı");

        //Search buttonu tiklayin
        hotelListPage.searchBoxButton.click();
        extentTest.pass("Search butonu tıklandı");


        //Degistirilen Hotel billgilerini kontrol edin
        Assert.assertTrue(hotelListPage.foundedDetailsElement.isDisplayed());
        extentTest.pass("Aranan hotel bulundu");
        ReusableMethods.getScreenshot("Aranan hotel bulundu");



        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelListPage.logOut.click();

    }

}
