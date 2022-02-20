package tests.us_0008;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomReservationPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class TC_04 extends TestBaseRapor {

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
            extentTest=extentReports.createTest("Reservation testi","REservation testi yapildi");
        hotelRoomReservationPage.addRoomReservationButton.click();
        Assert.assertTrue(hotelRoomReservationPage.createHotelroomreservatıonYazisi.isDisplayed());

        Select select =new Select(hotelRoomReservationPage.IDUserDropDown);
        select.selectByIndex(1);

        Select slct=new Select(hotelRoomReservationPage.IDUserOdaDropDown);
        List<WebElement> odaListesi=slct.getOptions();
        odaListesi.get(8).click();
            Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());

        hotelRoomReservationPage.priceReservation.sendKeys("250");
        hotelRoomReservationPage.dataStart.sendKeys( "08/20/2022");
        hotelRoomReservationPage.dataEnd.sendKeys("09/25/2022");
        hotelRoomReservationPage.adultAmount.sendKeys(faker.number().digit());
        hotelRoomReservationPage.childrenAmount.sendKeys(faker.number().digit());
        hotelRoomReservationPage.contactNameSurname.sendKeys(faker.name().fullName());
        hotelRoomReservationPage.contactPhone.click();
        hotelRoomReservationPage.contactPhone.sendKeys(faker.phoneNumber().cellPhone());
        ReusableMethods.waitFor(3);
        hotelRoomReservationPage.contactEmail.sendKeys(faker.internet().emailAddress());
        hotelRoomReservationPage.notes.sendKeys(faker.number().digit());

        if (!hotelRoomReservationPage.approvedElementi.isSelected()){
                hotelRoomReservationPage.approvedElementi.click();
        }
        if(!hotelRoomReservationPage.isPaidEmenti.isSelected()){
                hotelRoomReservationPage.isPaidEmenti.click();
        }
        hotelRoomReservationPage.saveButonu.click();
        ReusableMethods.waitFor(3);

       Assert.assertTrue(hotelRoomReservationPage.okButton.isEnabled());
       hotelRoomReservationPage.okButton.click();
        extentTest.pass("Reservation kayidi yapildi");
        Driver.closeDriver();
    }
}
