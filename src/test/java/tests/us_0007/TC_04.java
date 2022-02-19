package tests.us_0007;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04 {
    HotelRoomsPage roomsPage=new HotelRoomsPage();

    HMCPage hmcPage = new HMCPage();
    /*Step 1
     *Kullanıcı url yi girer */

    @Test
    public void test01() {
        HMCPage hmcPage = new HMCPage();
        SoftAssert softAssert = new SoftAssert();
        hmcPage.anasayfaGiris();
    }

    /*Step 2
     **Geçerli bilgilerle Log-in yapılır
     */
    @Test
    public void test02() {
        HMCPage hmcPage = new HMCPage();
        SoftAssert softAssert = new SoftAssert();
        hmcPage.girisYap();
    }

    /*Step 3
     **"Hotel Management" sekmesinden "Hotels Rooms" butonuna tıklanır  */
    @Test
    public void test03() {
        HMCPage hmcPage = new HMCPage();
        hmcPage.hotelManagementLinki.click();
        roomsPage.hotelRoomsLink.click();
    }

    /*Step4
    **İlk sıradaki "Details" butonu tıklanır     */
    @Test
    public void test04() {
        HotelRoomsPage roomsPage = new HotelRoomsPage();
        roomsPage.detailsLink.click();
    }

    /*Step5
    **Sayfadaki tüm bilgiler değiştirilerek "Save" butonuna tıklanır */
    @Test
    public void test05() {
        HotelRoomsPage roomsPage = new HotelRoomsPage();
        roomsPage.hotelIdbox.click();
        Select select = new Select(roomsPage.hotelIdbox);
        select.getFirstSelectedOption();

        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

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

    }

}


