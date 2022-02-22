package tests.us_0007;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_04 extends TestBaseRapor {
    HotelRoomsPage roomsPage=new HotelRoomsPage();
    HMCPage hmcPage = new HMCPage();

    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    /*Step 1
     *Kullanıcı url yi girer */

    @Test
    public void test01() {

        extentTest=extentReports.createTest("TC_04_01","Anasayfaya giris yapabilmeli.");
        hmcPage.anasayfaGiris();
        extentTest.info("Url ye gidildi");
    }

    /*Step 2
     **Geçerli bilgilerle Log-in yapılır
     */
    @Test
    public void test02() {
        extentTest=extentReports.createTest("TC_04_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.girisYap();
        extentTest.info("Gecerli bilgilerle log in yapıldı");
    }

    /*Step 3
     **"Hotel Management" sekmesinden "Hotels Rooms" butonuna tıklanır  */
    @Test
    public void test03() {
        extentTest=extentReports.createTest("TC_04_03","\"Hotel Management\" buttonuna tiklayarak, \"Hotel Rooms\" butonuna tıklanmalı.");
        hmcPage.hotelManagementLinki.click();
        roomsPage.hotelRoomsLink.click();
        extentTest.info("Hotel Management ve Hotel Rooms butonlarına tıklanıldı");
    }

    /*Step4
    **İlk sıradaki "Details" butonu tıklanır     */
    @Test
    public void test04() {
        extentTest=extentReports.createTest("TC_04_04","Hotel Rooms sayfasından \"Details\" butonuna tıklanmalı");
        roomsPage.detailsLink.click();
        extentTest.info("Details butonuna tıklandı");
    }

    /*Step5
    **Sayfadaki tüm bilgiler değiştirilerek "Save" butonuna tıklanır */
    @Test
    public void test05() {
        extentTest=extentReports.createTest("TC_04_05","Sayfadaki tüm bilgiler değiştirilip \"Save\" nutonu tıklanmalı ");
        roomsPage.hotelIdbox.click();
        Select select = new Select(roomsPage.hotelIdbox);
        select.selectByIndex(1);


        actions.click(roomsPage.codeBox).sendKeys(Keys.CLEAR).sendKeys("9999").
                sendKeys(Keys.TAB).sendKeys(Keys.CLEAR).sendKeys(faker.name().name())
                .sendKeys(Keys.TAB).sendKeys(Keys.CLEAR).sendKeys(faker.address().city())
                .sendKeys(Keys.TAB).sendKeys(Keys.CLEAR).sendKeys(faker.toString())
                .sendKeys(Keys.TAB).sendKeys(Keys.CLEAR).sendKeys(faker.commerce().price())
                .perform();

        ReusableMethods.waitFor(3);

        roomsPage.roomTypeButon.click();
        select.getFirstSelectedOption();
        ReusableMethods.waitFor(3);
        actions.click(roomsPage.maxAdultButon).sendKeys(Keys.CLEAR).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys(Keys.CLEAR).sendKeys("2").perform();



        roomsPage.isAvailableButon.click();
        roomsPage.saveButon.click();
        roomsPage.okButton.click();


        extentTest.info("Bilgiler  başarıyla değistirildi ");

        actions.moveToElement(roomsPage.managerDropDownButton).perform();
        ReusableMethods.waitFor(2);
        roomsPage.logOutButton.click();

    }

}


