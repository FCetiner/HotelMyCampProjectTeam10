package tests.us_0009;

import org.testng.annotations.Test;
import pages.HotelRoomReservationPage;

import javax.swing.text.Element;

public class TC_03 {


    @Test
    public void hotelManagement() throws InterruptedException {

        HotelRoomReservationPage elements=new HotelRoomReservationPage();
        elements.HMCLogin();
        elements.hotelManagementTextKontrol();




    }
}
