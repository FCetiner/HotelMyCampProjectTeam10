package tests.us_0009;

import org.testng.annotations.Test;
import pages.HotelRoomReservationPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {
    HotelRoomReservationPage elements;

    @Test
    public void hotelManagement() throws InterruptedException {
        elements=new HotelRoomReservationPage();
        extentTest=extentReports.createTest("Hotel Management yazisi kontrolü","Hotel Management yazisi kontrol ediliyor.");
        extentTest.info("Anasayfaya gidildi");

        elements=new HotelRoomReservationPage();
        elements.HMCLogin();
        extentTest.pass("Login Testi basarili");
        elements.hotelManagementTextKontrol();
        extentTest.pass("Hotel Management yazisi basariyla test edildi");


        Driver.closeDriver();

    }
}
