package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelListPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_001 extends TestBaseRapor {
    @Test
    public void test() throws IOException {

        HMCPage hmcPage = new HMCPage();
        HotelListPage hotelListPage = new HotelListPage();
        extentTest = extentReports.createTest("TC_001", "Hotel anasayfasina gidilebilmeli ve Yönetici olarak giriş yapabilmeli");
        //Hotel anasayfasina gidin
        extentTest.info("web sitesi başarılıyla açıldı");
        // Login butonuna tıklayın
        extentTest.pass("log in butonuna tıklandı");
        //geçerli bir username girin
        extentTest.info("geçerli bir username girildi");
        //geçerli bir password girin
        extentTest.info("geçerli bir password girildi");
        //Log in  tusuna basin
        hmcPage.girisYap();
        extentTest.pass("Yönetici olarak giriş yapıldı");
        //"manager" yazisinin gorundugunu kontrol edin
        Assert.assertTrue(hotelListPage.managerTextElement.isDisplayed());
        extentTest.pass("manager yazısı görüldü");
        ReusableMethods.waitForVisibility(hotelListPage.managerTextElement, 2);

        //ReusableMethods.getScreenshot("Giris yapildi");
        extentTest.pass("driver başarılıyla kapatıldı");
        Driver.closeDriver();


    }

}
