package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelListPage;
import utilities.TestBaseRapor;

public class TC_002 extends TestBaseRapor {
    @Test
    public void test(){
        HMCPage hmcPage = new HMCPage();
        HotelListPage hotelListPage=new HotelListPage();
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
    }
}
