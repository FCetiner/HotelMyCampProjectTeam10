package tests.us_0009;

import org.testng.annotations.Test;
import pages.HotelRoomReservationPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_05 extends TestBaseRapor {
    HotelRoomReservationPage hotelRoomReservationPage;
    @Test
    public void deleteReservation() throws InterruptedException {
        extentTest=extentReports.createTest("Delete Reservation kontrolü","Delete Reservation kontrol ediliyor.");
        extentTest.info("Anasayfaya gidildi");
        hotelRoomReservationPage=new HotelRoomReservationPage();
        hotelRoomReservationPage.HMCLogin();
        extentTest.pass("Login islemi basarili");
        hotelRoomReservationPage.hotelManagementTextKontrol();
        extentTest.pass("Hotel Management yazisi basariyla kontrol edildi");
        hotelRoomReservationPage.deleteReservation();
        extentTest.pass("Delete islemi Test edildi");


        Driver.closeDriver();
    }
}
