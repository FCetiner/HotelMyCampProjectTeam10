package tests.us_0007;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.Driver;

public class TC_05 {

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
     **"Hotel Management" sekmesinden "Hotels Rooms" butonuna tıklanır  */
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
    public void test05() throws InterruptedException {

        HotelRoomsPage roomsPage=new HotelRoomsPage();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        roomsPage.deleteButon.click();
        roomsPage.continueOkButon.click();
        roomsPage.errorOkButon.click();


    }


}
