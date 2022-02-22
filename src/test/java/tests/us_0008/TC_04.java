package tests.us_0008;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
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
        HMCPage hmcPage=new HMCPage();
    @Test
public void reservationKayitTesti () throws InterruptedException {

        extentTest=extentReports.createTest("Reservation testi","REservation testi yapildi");
        hmcPage =new HMCPage();
        hmcPage.girisYap();
        HotelRoomReservationPage hotelRoomReservationPage=new HotelRoomReservationPage();
        Assert.assertTrue(hotelRoomReservationPage.systemManagementButton.isDisplayed());
        hotelRoomReservationPage.hotelManagementButtonu.click();
        ReusableMethods.waitFor(3);
        hotelRoomReservationPage.roomReservationsButton.click();
        extentTest.info("Yonetici dogru username ve password ile giris yapabildi");

        hotelRoomReservationPage.addRoomReservationButton.click();
        Assert.assertTrue(hotelRoomReservationPage.createHotelroomreservatıonYazisi.isDisplayed());
        extentTest.pass("Hotel room reservatıon yazisi gorunuyor");
        Select select =new Select(hotelRoomReservationPage.IDUserDropDown);
        select.selectByIndex(1);

        Select slct=new Select(hotelRoomReservationPage.IDUserOdaDropDown);
        List<WebElement> odaListesi=slct.getOptions();
        odaListesi.get(8).click();
            Faker faker = new Faker();

        hotelRoomReservationPage.priceReservation.sendKeys("250");
        extentTest.info("Price girisi yapildi");
        hotelRoomReservationPage.dateStart();
        extentTest.info("Date start girisi yapildi");
        hotelRoomReservationPage.dateEnd();
        extentTest.info("Date end girisi yapildi");
        hotelRoomReservationPage.adultAmount.sendKeys(faker.number().digit());
        extentTest.info("Yetiskin sayisi yazildi");
        hotelRoomReservationPage.childrenAmount.sendKeys(faker.number().digit());
        extentTest.info("Cocuk sayisi yazildi");
        hotelRoomReservationPage.contactNameSurname.sendKeys(faker.name().fullName());
        extentTest.info("Isim girisi yazildi");
        hotelRoomReservationPage.contactPhone.click();
        hotelRoomReservationPage.contactPhone.sendKeys(faker.phoneNumber().cellPhone());
        extentTest.info("Telefon numarasi yazildi");
        ReusableMethods.waitFor(3);
        hotelRoomReservationPage.contactEmail.sendKeys(faker.internet().emailAddress());
        extentTest.info("Email adresi yazildi");
        hotelRoomReservationPage.notes.sendKeys(faker.number().digit());

        if (!hotelRoomReservationPage.approvedElementi.isSelected()){
                hotelRoomReservationPage.approvedElementi.click();
        }
        if(!hotelRoomReservationPage.isPaidEmenti.isSelected()){
                hotelRoomReservationPage.isPaidEmenti.click();
        }
        hotelRoomReservationPage.saveButonu.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(hotelRoomReservationPage.saveDogrulama.isDisplayed());
       Assert.assertTrue(hotelRoomReservationPage.okButton.isEnabled());
       hotelRoomReservationPage.okButton.click();

        extentTest.pass("Reservation kayidi yapildi");
        Driver.closeDriver();
    }
}
