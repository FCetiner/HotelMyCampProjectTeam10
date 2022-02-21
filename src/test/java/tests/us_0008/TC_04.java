package tests.us_0008;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomReservationPage;

import java.util.List;

public class TC_04 {
    //1_Yönetici olarak ADDROOM
    //2_Yönetici olarak Create Hotel room reservation yazısı görülmeli.
    //3_Yönetici olarak ID user girisi yapılmalı.
    //4_Yönetici olarak Price  girisi yapılmalı.
    //5_Yönetici olarak Date Starts girisi yapılmalı.
    //6_Yönetici olarak Date End girisi yapılmalı.
    //7_Yönetici olarak Adult Amount girisi yapılmalı.
    //8_Yönetici olarak Children Amaunt girisi yapılmalı.
    //9_Yönetici olarak ConcatNameSurname girisi yapılmalı.
    //10_Yönetici olarak Concat Phone girisi yapılmalı.
    //11_Yönetici olarak Concat Email girisi yapılmalı.
    //12_Yönetici olarak Notes kısmı ıstege gore doldurulmalı.
    //13_Yönetici olarak Save butonu tıklanmalı.
    @Test
public void reservationKayitTesti () throws InterruptedException {
        HMCPage hmcPage =new HMCPage();
        hmcPage.girisYap();
        HotelRoomReservationPage hotelRoomReservationPage=new HotelRoomReservationPage();
        Assert.assertTrue(hotelRoomReservationPage.systemManagementButton.isDisplayed());
        hotelRoomReservationPage.hotelManagementButtonu.click();
        Thread.sleep(3000);
        hotelRoomReservationPage.roomReservationsButton.click();

        // TC_04 un başı
      //  HotelRoomReservationPage hotelRoomReservationPage = new HotelRoomReservationPage();
        hotelRoomReservationPage.addRoomReservationButton.click();
        Assert.assertTrue(hotelRoomReservationPage.createHotelroomreservatıonYazisi.isDisplayed());

        Select select =new Select(hotelRoomReservationPage.IDUserDropDown);
        select.selectByIndex(1);

        Select slct=new Select(hotelRoomReservationPage.IDUserOdaDropDown);
        List<WebElement> odaListesi=slct.getOptions();
        odaListesi.get(8).click();

        hotelRoomReservationPage.priceReservation.sendKeys("250");
        hotelRoomReservationPage.dataStart.sendKeys("20/06/2022");
        hotelRoomReservationPage.dataEnd.sendKeys("20/07/2022");
//7_Yönetici olarak Adult Amount girisi yapılmalı.
//8_Yönetici olarak Children Amaunt girisi yapılmalı.
//9_Yönetici olarak ConcatNameSurname girisi yapılmalı.
//10_Yönetici olarak Concat Phone girisi yapılmalı.
//11_Yönetici olarak Concat Email girisi yapılmalı.
//12_Yönetici olarak Notes kısmı ıstege gore doldurulmalı.
//13_Yönetici olarak Save butonu tıklanmalı.


    }
}
