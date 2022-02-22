package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomReservationPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {
    HMCPage hmcPage;
    @Test
    public void rezervasyonSayfasıTesti () throws InterruptedException {
        extentTest=extentReports.createTest("Reservation sayfasina giris testi","Reservation sayfasina basarili giris yapildi");
        hmcPage=new HMCPage();
        hmcPage.girisYap();

        HotelRoomReservationPage hotelRoomReservationPage=new HotelRoomReservationPage();
        Assert.assertTrue(hotelRoomReservationPage.systemManagementButton.isDisplayed());
        extentTest.pass("System Management Buttonu gorunebilir");
        hotelRoomReservationPage.hotelManagementButtonu.click();
        ReusableMethods.waitFor(3);
        extentTest.pass("Hotel Management Buttonu erisilebilir");
        hotelRoomReservationPage.roomReservationsButton.click();
        Assert.assertTrue(hotelRoomReservationPage.addRoomReservationButton.isDisplayed());
        extentTest.pass("Add Room Reservation Buttonu erisilebilir");
        extentTest.pass("Reservation sayfasina basarili giris yapildi");

        Driver.closeDriver();
    }
}
