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

public class TC_04 {


 /*Step 1
 *Kullanıcı url yi girer */

    @Test
    public void test01(){
        HMCPage hmcPage =new HMCPage();
        SoftAssert softAssert=new SoftAssert();
        hmcPage.anasayfaGiris();
    }
    /*Step 2
     **Geçerli bilgilerle Log-in yapılır
     */
    @Test
    public void test02(){
        HMCPage hmcPage =new HMCPage();
        SoftAssert softAssert=new SoftAssert();
        hmcPage.girisYap();
    }

    /*Step 3
     **"Hotel Management" sekmesinden "Hotelş Rooms" butonuna tıklanır  */
    @Test
    public void test03(){
        HMCPage hmcPage = new HMCPage();
        hmcPage.hotelManagementLinki.click();
        HotelRoomsPage roomsPage = new HotelRoomsPage();
        roomsPage.hotelRoomsLink.click();
    }

    @Test
    public void test04(){
        HotelRoomsPage roomsPage=new HotelRoomsPage();
        roomsPage.detailsLink.click();
    }

    @Test
    public void test05(){
        HotelRoomsPage roomsPage=new HotelRoomsPage();
        roomsPage.hotelIdbox.click();
        Select select = new Select(roomsPage.hotelIdbox);
        select.getFirstSelectedOption();

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();

        actions.click(roomsPage.codeBox).sendKeys((WebElement) faker.code()).
                sendKeys(Keys.TAB).sendKeys(faker.name().name())
                .sendKeys(Keys.TAB).sendKeys(faker.address().city())
                .sendKeys(Keys.TAB).sendKeys(faker.toString())
                .sendKeys(Keys.TAB).sendKeys(faker.commerce().price()).perform();



    }

}
