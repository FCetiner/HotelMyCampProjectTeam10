package tests.us_0008;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomReservationPage;
import utilities.ReusableMethods;

import java.util.List;

public class TC_04 {

    @Test
public void reservationKayitTesti () throws InterruptedException {
        HMCPage hmcPage =new HMCPage();
        hmcPage.girisYap();
        HotelRoomReservationPage hotelRoomReservationPage=new HotelRoomReservationPage();
        Assert.assertTrue(hotelRoomReservationPage.systemManagementButton.isDisplayed());
        hotelRoomReservationPage.hotelManagementButtonu.click();
            ReusableMethods.waitFor(3);
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
            Faker faker = new Faker();
        hotelRoomReservationPage.priceReservation.sendKeys("250");
        hotelRoomReservationPage.dataStart.sendKeys((CharSequence) faker.date());
        hotelRoomReservationPage.dataEnd.sendKeys((CharSequence) faker.date());

        hotelRoomReservationPage.adultAmount.sendKeys(faker.number().digit());                          //BAK OLDUMU
        hotelRoomReservationPage.childrenAmount.sendKeys((CharSequence) faker.random());                           //OLDUMU
        hotelRoomReservationPage.contactNameSurname.sendKeys(faker.name().fullName());
        hotelRoomReservationPage.contactPhone.sendKeys(faker.phoneNumber().phoneNumber());
        hotelRoomReservationPage.contactEmail.sendKeys(faker.internet().emailAddress());
        hotelRoomReservationPage.notes.sendKeys(faker.number().digit());

        if (!hotelRoomReservationPage.approvedElementi.isSelected()){
                hotelRoomReservationPage.approvedElementi.click();
        }
        if(hotelRoomReservationPage.isPaidEmenti.isSelected()){
                hotelRoomReservationPage.isPaidEmenti.click();
        }
        hotelRoomReservationPage.saveButonu.click();



    }
}
