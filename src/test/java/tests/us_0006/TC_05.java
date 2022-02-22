package tests.us_0006;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_05 extends TestBaseRapor {
    HMCPage hmcPage ;
    HotelRoomsPage roomsPage ;
    Actions actions ;
    Faker faker ;
    @Test
    public void test01() {
        hmcPage = new HMCPage();
        roomsPage = new HotelRoomsPage();
        actions = new Actions(Driver.getDriver());
        faker = new Faker();
        extentTest = extentReports.createTest("otel oda bilgilerini guncelleme testi","Basari ile guncelleme gerceklestirildi");
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(3);
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPage.loginButonu.click();
        hmcPage.hotelManagementLinki.click();
        roomsPage.hotelRoomsLink.click();
        roomsPage.addRoomLink.click();
        Select select = new Select(roomsPage.hotelIdbox);
        roomsPage.hotelIdbox.click();
        select.selectByIndex(3);
        actions.click(roomsPage.codeBox).sendKeys(Keys.CLEAR).sendKeys("2313").perform();
        actions.click(roomsPage.nameBox).sendKeys(Keys.CLEAR).sendKeys(faker.name().name()).perform();
        actions.click(roomsPage.locationButon).sendKeys(Keys.CLEAR).sendKeys(faker.address().city()).perform();
        actions.click(roomsPage.descriptionBox).sendKeys(Keys.CLEAR).sendKeys(faker.toString()).perform();
        actions.click(roomsPage.priceBox).sendKeys(Keys.CLEAR).sendKeys("200").perform();
        ReusableMethods.waitFor(2);
        Select select1 = new Select(roomsPage.roomTypeButon);
        roomsPage.roomTypeButon.click();
        select1.selectByIndex(2);
        ReusableMethods.waitFor(2);
        actions.click(roomsPage.maxAdultButon).sendKeys(Keys.CLEAR).sendKeys("2").perform();
        actions.click(roomsPage.maxAdultButon).sendKeys(Keys.TAB).sendKeys(Keys.CLEAR).sendKeys("2").perform();
        roomsPage.isAvailableButon.click();
        ReusableMethods.waitFor(2);
        roomsPage.saveButon.click();
        ReusableMethods.waitFor(3);
        roomsPage.okButton.click();
        roomsPage.arrowUpButton.click();
        ReusableMethods.waitFor(2);
        extentTest.pass("Basari ile oda guncellemesi yapildi");
        Driver.closeDriver();
    }
}
