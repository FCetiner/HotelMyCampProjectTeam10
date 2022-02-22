package tests.us_0006;

import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {

    HMCPage hmcPage ;
    HotelRoomsPage roomsPage ;

    @Test
    public void test01() {
        hmcPage = new HMCPage();
        hmcPage.anasayfaGiris();
        roomsPage = new HotelRoomsPage();
        extentTest=extentReports.createTest("Yonetici girisi","Basarili giris yapildi");
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPage.loginButonu.click();
        hmcPage.hotelManagementLinki.click();
        roomsPage.hotelRoomsLink.click();
        extentTest.pass("yonetici basarili giris yapti");
        Driver.closeDriver();

    }

}
