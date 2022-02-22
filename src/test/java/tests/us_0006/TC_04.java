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

public class TC_04 extends TestBaseRapor {
    HMCPage hmcPage ;
    HotelRoomsPage roomsPage ;
    Actions actions ;
    Faker faker ;

    @Test
    public void test01() {
        hmcPage = new HMCPage();
        roomsPage = new HotelRoomsPage();
        hmcPage.anasayfaGiris();
        faker = new Faker();
        extentTest=extentReports.createTest("Yonetici otel odasi ekeleme testi","Otel odasi basari ile eklendi");
        hmcPage.ilkLoginLinki.click();
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmcPage.loginButonu.click();
        hmcPage.hotelManagementLinki.click();
        roomsPage.hotelRoomsLink.click();
        roomsPage.addRoomLink.click();
        Select select = new Select(roomsPage.hotelIdbox);
        roomsPage.hotelIdbox.click();
        select.selectByIndex(2);
     /*   actions.click(roomsPage.codeBox).sendKeys("2313").perform();
        actions.click(roomsPage.nameBox).sendKeys(faker.name().name()).perform();
        actions.click(roomsPage.locationButon).sendKeys(faker.address().city()).perform();
        actions.click(roomsPage.descriptionBox).sendKeys(faker.toString()).perform();
        actions.click(roomsPage.priceBox).sendKeys("200").perform();
        ReusableMethods.waitFor(2);
        Select select1= new Select(roomsPage.roomTypeButon);
        roomsPage.roomTypeButon.click();
        select1.selectByIndex(2);
        ReusableMethods.waitFor(2);
        actions.click(roomsPage.maxAdultButon).sendKeys("2").perform();
        actions.click(roomsPage.maxAdultButon).sendKeys(Keys.TAB).sendKeys("2").perform();
        roomsPage.isAvailableButon.click();
        ReusableMethods.waitFor(2);
        roomsPage.saveButon.click();
        ReusableMethods.waitFor(3);
        roomsPage.okButton.click(); */
        extentTest.pass("Otel odasi basari ile eklenedi");
         Driver.closeDriver();
    }
    }
