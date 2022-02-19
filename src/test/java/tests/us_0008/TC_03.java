package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomReservationPage;

public class TC_03 {
    @Test
    public void rezervasyonSayfasıTesti () throws InterruptedException {
        HMCPage hmcPage=new HMCPage();
        hmcPage.girisYap();

        HotelRoomReservationPage hotelRoomReservationPage=new HotelRoomReservationPage();
        Assert.assertTrue(hotelRoomReservationPage.systemManagementButton.isDisplayed());
        hotelRoomReservationPage.hotelManagementButtonu.click();
        Thread.sleep(3000);
        hotelRoomReservationPage.roomReservationsButton.click();

    }
}