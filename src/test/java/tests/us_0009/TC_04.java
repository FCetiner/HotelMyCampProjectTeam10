package tests.us_0009;

import org.testng.annotations.Test;
import pages.HotelRoomReservationPage;
import utilities.TestBaseRapor;

public class TC_04 extends TestBaseRapor {
    @Test
    public void updateReservationInfo() throws InterruptedException {
        extentTest=extentReports.createTest("Update Reservation kontrolü","Update Reservation kontrol ediliyor.");
        extentTest.info("Anasayfaya gidildi");

        HotelRoomReservationPage hotelRoomReservationPage=new HotelRoomReservationPage();
        hotelRoomReservationPage.HMCLogin();
        extentTest.pass("Login islemi basarili");
        hotelRoomReservationPage.hotelManagementTextKontrol();
        extentTest.pass("Hotel Management yazisi basariyla kontrol edildi");

        hotelRoomReservationPage.userInfoUpdate();
        extentTest.pass("Update islemi Test edildi");



    }
}
