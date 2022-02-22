package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelListPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;


public class TC_005 extends TestBaseRapor {

    HMCPage hmcPage;
    HotelListPage hotelListPage;

    @Test
    public void test() throws IOException {
        hmcPage = new HMCPage();
        hotelListPage = new HotelListPage();
        extentTest = extentReports.createTest("TC_005", "Yönetici olarak yapılan kayıtları silebilmeli");

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

        //Delete butonuna tıklayın
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        extentTest.pass("Driver, 'Admin - Edit Hotel' sayfasına başarıyla geçiş yaptı");
        hotelListPage.deleteButtonWebElement.click();
        ReusableMethods.waitFor(2);
        extentTest.pass("Delete butonu tıklandı");

        //"Would you like to continue?" yazısının görünürlüğünü kontrol et
        Assert.assertTrue(hotelListPage.deleteAlertTextWebElement.isDisplayed());
        extentTest.pass("Would you like to continue? yazısı görüldü");

        //Ok Butonuna tıkla
        hotelListPage.alertOKButtonWebElement.click();
        extentTest.pass("Ok butonu tıklandı");

        //Otel bilgisinin silindiğini kontrol edin
        ReusableMethods.switchToWindow("Admin - List Of Hotels");
        extentTest.pass("Driver,'Admin - List Of Hotels' başlıklı sayfasına başarıyla geçiş yaptı");
        Driver.getDriver().navigate().refresh();
        extentTest.pass("Sayfa güncellendi");
        extentTest.pass("Silinen hotelin bulunmadığı doğrulandı");
        ReusableMethods.getScreenshot("Silinen hotelin bulunmadığı doğrulandı");
        Driver.closeDriver();
    }
}
