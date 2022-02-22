package tests.us_0009;

import org.testng.annotations.Test;
import pages.HotelRoomReservationPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {
    /*
    1- Yonetici HotelMyCamp sayfasina gider.
    2- Yonetici sag üstteki login butonuna tiklar.
    3- Yönetici isim ve password textbox'larina dogru kullanici adi ve sifre girer.
    4- Yönetici login butonuna basar.
    5- Title'in Admin yazisi icerdigini gorur.
*/

    HotelRoomReservationPage elements=new HotelRoomReservationPage();
    @Test
    public void test() throws InterruptedException {

        extentTest=extentReports.createTest("Login Testi","Login testi yapildi.");
        extentTest.info("Anasayfaya gidildi");

        elements=new HotelRoomReservationPage();
        elements.HMCLogin();
        extentTest.pass("Login islemi basarili");

        Driver.closeDriver();

    }
}
