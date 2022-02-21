package tests.us_0009;

import org.testng.annotations.Test;
import pages.HotelRoomReservationPage;
import utilities.TestBaseRapor;

import javax.swing.text.Element;

public class TC_03 extends TestBaseRapor {


    @Test
    public void hotelManagement() throws InterruptedException {
        extentTest=extentReports.createTest("Hotel Management yazisi kontrolü","Hotel Management yazisi kontrol ediliyor.");
        extentTest.info("Anasayfaya gidildi");

        HotelRoomReservationPage elements=new HotelRoomReservationPage();
        elements.HMCLogin();
        extentTest.pass("Login Testi basarili");
        elements.hotelManagementTextKontrol();
        extentTest.pass("Hotel Management yazisi basariyla test edildi");





    }
}
