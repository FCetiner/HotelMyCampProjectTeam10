package tests.us_00010;

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

    @Test
    public void testCase02(){

        extentTest=extentReports.createTest("kullanici giris yapma ve oda arama","\"Rooms\" tiklayarak, \"Advanced Search\"'de katagorileri secerek \"search\" yapabilmeli");
        KullaniciHotelReservationPage hmcPage10=new KullaniciHotelReservationPage();

        Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Url gidildi");

        hmcPage10.logInButtonu.click();
        extentTest.info("\"Log in\" buttonuna tiklanildi");
        hmcPage10.usernameBox.sendKeys("Firuze"+ Keys.ENTER);
        hmcPage10.passwordBox.sendKeys("12345Aa."+ Keys.ENTER);
        hmcPage10.ikinciLoginButonu.click();
        extentTest.info("Kullanici girisi yapti");

        hmcPage10.roomsButton.click();
        extentTest.info("\"Rooms\" buttonuna tiklanildi");

        hmcPage10.checkInDateTextBox.click();
        hmcPage10.checkInDateTextBox.sendKeys("08/15/2021"+ Keys.ENTER);
        hmcPage10.checOutDateTextBox.click();
        extentTest.info("Giris tarihi girildi");

        hmcPage10.checOutDateTextBox.sendKeys("08/29/2021"+ Keys.ENTER);
        extentTest.info("Cikis tarihi girildi");
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", hmcPage10.searchButton);

        Select objSelect = new Select(hmcPage10.selectRoomTextBox);
        objSelect.selectByIndex(6);

        Select objSelect1 = new Select(hmcPage10.selectAdultTextBox);
        objSelect1.selectByIndex(5);

        Select objSelect2 = new Select(hmcPage10.selectChildrenTextBox);
        objSelect2.selectByIndex(5);

        extentTest.info("\"Advanced Search\" textin altindaki boxlar dolduruldu");
        hmcPage10.searchButton.click();
        extentTest.info("Arama  buttonuna tiklanildi");

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Rooms"));
        extentTest.pass("\"Rooms\" sayfasina gidildigi test edildi");

        Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
        hmcPage10.logOut.click();
    }
}
