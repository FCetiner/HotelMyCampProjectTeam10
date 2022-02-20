package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomReservationPage;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_03 extends TestBaseRapor {
    @Test
    public void rezervasyonSayfasıTesti () throws InterruptedException {
        HMCPage hmcPage=new HMCPage();
        hmcPage.girisYap();

        HotelRoomReservationPage hotelRoomReservationPage=new HotelRoomReservationPage();
        Assert.assertTrue(hotelRoomReservationPage.systemManagementButton.isDisplayed());
        hotelRoomReservationPage.hotelManagementButtonu.click();
        ReusableMethods.waitFor(3);
        hotelRoomReservationPage.roomReservationsButton.click();
        Assert.assertTrue(hotelRoomReservationPage.addRoomReservationButton.isDisplayed());

        extentTest=extentReports.createTest("Reservation sayfasina giris testi","Reservation sayfasina basarili giris yapildi");
        extentTest.pass("Reservation sayfasina basarili giris yapildi");
        hmcPage.anasayfaGiris();
        hmcPage.loginOutElementi.click();
    }
}
