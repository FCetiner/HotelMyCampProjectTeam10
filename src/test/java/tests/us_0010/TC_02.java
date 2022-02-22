package tests.us_0010;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {
    KullaniciHotelReservationPage kullaniciHotelReservationPage;
    @Test
    public void testCase02(){

        extentTest=extentReports.createTest("kullanici giris yapma ve oda arama","\"Rooms\" tiklayarak, \"Advanced Search\"'de katagorileri secerek \"search\" yapabilmeli");
        kullaniciHotelReservationPage =new KullaniciHotelReservationPage();

        Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");

        kullaniciHotelReservationPage.logInButtonu.click();
        extentTest.info("\"Log in\" buttonuna tiklanildi");
        kullaniciHotelReservationPage.usernameBox.sendKeys("Firuze"+ Keys.ENTER);
        kullaniciHotelReservationPage.passwordBox.sendKeys("12345Aa."+ Keys.ENTER);
        kullaniciHotelReservationPage.ikinciLoginButonu.click();
        extentTest.info("Kullanici girisi yapti");

        kullaniciHotelReservationPage.roomsButton.click();
        extentTest.info("\"Rooms\" buttonuna tiklanildi");

        kullaniciHotelReservationPage.checkInDateTextBox.click();
        kullaniciHotelReservationPage.checkInDateTextBox.sendKeys("08/15/2021"+ Keys.ENTER);
        kullaniciHotelReservationPage.checOutDateTextBox.click();
        extentTest.info("Giris tarihi girildi");

        kullaniciHotelReservationPage.checOutDateTextBox.sendKeys("08/29/2021"+ Keys.ENTER);
        extentTest.info("Cikis tarihi girildi");
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", kullaniciHotelReservationPage.searchButton);

        Select objSelect = new Select(kullaniciHotelReservationPage.selectRoomTextBox);
        objSelect.selectByIndex(6);

        Select objSelect1 = new Select(kullaniciHotelReservationPage.selectAdultTextBox);
        objSelect1.selectByIndex(5);

        Select objSelect2 = new Select(kullaniciHotelReservationPage.selectChildrenTextBox);
        objSelect2.selectByIndex(5);

        extentTest.info("\"Advanced Search\" textin altindaki boxlar dolduruldu");
        kullaniciHotelReservationPage.searchButton.click();
        extentTest.info("Arama  buttonuna tiklanildi");

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Rooms"));
        extentTest.pass("\"Rooms\" sayfasina gidildigi test edildi");

        Driver.closeDriver();
    }
}
