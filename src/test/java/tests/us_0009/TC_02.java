package tests.us_0009;

import org.testng.annotations.Test;
import pages.HotelRoomReservationPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {


    HotelRoomReservationPage elements;
    @Test
    public void test() throws InterruptedException {
        elements=new HotelRoomReservationPage();
        extentTest=extentReports.createTest("Login Testi","Login testi yapildi.");
        extentTest.info("Anasayfaya gidildi");

        elements=new HotelRoomReservationPage();
        elements.HMCLogin();
        extentTest.pass("Login islemi basarili");

        Driver.closeDriver();
    }
}
