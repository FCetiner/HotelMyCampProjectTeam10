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

public class TC_04 {
    HMCPage hmcPage = new HMCPage();
    HotelRoomsPage roomsPage = new HotelRoomsPage();

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    //1-Yonetici olarak ana sayfaya gidin
    @Test
    public void test01() {
        hmcPage.anasayfaGiris();
    }
    //2-Login yazisina tiklayin

    @Test
    public void test02() {
        hmcPage.ilkLoginLinki.click();
    }
    //3-Yonetici olarak gecerli bir username girin
    @Test
    public void test03() {
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }
    //4-Yonetici olarak gecerli bir password girin
    @Test
    public void test04(){
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }
    //5-Login butonuna tiklayin
    @Test
    public void test05() {
        hmcPage.loginButonu.click();
    }
    //6-Hotel management yazisina tiklayin
    @Test
    public void test06() {
        hmcPage.hotelManagementLinki.click();
    }
    //7-Hotel rooms yazisina tiklayin
    @Test
    public void test07() {
        roomsPage.hotelRoomsLink.click();
    }
    //8-Add HotelRoom butonuna tiklayin
    @Test
    public void test08() {
        roomsPage.addRoomLink.click();
    }
    //9-ID Hotel Dropdown dan Hotel secin
    @Test
    public void test09() {
        Select select = new Select(roomsPage.hotelIdbox);
        roomsPage.hotelIdbox.click();
        select.selectByIndex(2);
    }
    //10- Code box una tiklayip gecerli bir numara girin
    @Test
    public void test10() {

        actions.click(roomsPage.codeBox).sendKeys(Keys.CLEAR).sendKeys("2313").perform();
    }

    //11-Name box una tiklayip oda ismini girin
    @Test
    public void test11() {
        actions.click(roomsPage.nameBox).sendKeys(Keys.CLEAR).sendKeys(faker.name().name()).perform();
    }

    //12-Location box una tiklayip gecerli bir adres girin
    @Test
    public void test12() {
        actions.click(roomsPage.locationButon).sendKeys(Keys.CLEAR).sendKeys(faker.address().city()).perform();
    }
    //13-Description kısmına birseyler yazin
    @Test
    public void test13() {
        actions.click(roomsPage.descriptionBox).sendKeys(Keys.CLEAR).sendKeys(faker.toString()).perform();
    }
    //14-Price kismina  price degeri girin
    @Test
    public void test14() {
        actions.click(roomsPage.priceBox).sendKeys(Keys.CLEAR).sendKeys(faker.commerce().price()).perform();
        ReusableMethods.waitFor(2);
    }
    //15-Room Type dropDown dan oda tipini belirleyin
    @Test
    public void test15() {
        Select select = new Select(roomsPage.roomTypeButon);
        roomsPage.roomTypeButon.click();
        select.selectByIndex(2);
        ReusableMethods.waitFor(2);
    }
    //16-Max Adult count box undan adult sayisi girin
    @Test
    public void test16() {
        actions.click(roomsPage.maxAdultButon).sendKeys(Keys.CLEAR).sendKeys("2").perform();
    }
    //17-Max Children count  box undan cocuk sayisi girin
    @Test
    public void test17() {
    actions.click(roomsPage.maxAdultButon).sendKeys(Keys.TAB).sendKeys(Keys.CLEAR).sendKeys("2").perform();
    }
    //18-Approved kutusuna tıklayin
    @Test
    public void test18() {
        roomsPage.isAvailableButon.click();
        ReusableMethods.waitFor(2);
    }
    //19-Save butonuna basin
    @Test
    public void test19() {
        roomsPage.saveButon.click();
        ReusableMethods.waitFor(3);
    }
    //20-Cikan Pop-up'ta ok butonuna basin
    @Test
    public void test20() {
        roomsPage.okButton.click();
    }


    }
