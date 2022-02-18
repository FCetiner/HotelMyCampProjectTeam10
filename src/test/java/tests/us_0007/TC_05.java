package tests.us_0007;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05 {

    HMCPage hmcPage =new HMCPage();
    HotelRoomsPage roomsPage = new HotelRoomsPage();
    Actions actions=new Actions(Driver.getDriver());



    /*Step 1
     *Kullanıcı url yi girer */

    @Test
    public void test01(){

        hmcPage.anasayfaGiris();
    }
    /*Step 2
     **Geçerli bilgilerle Log-in yapılır
     */
    @Test
    public void test02(){

        hmcPage.girisYap();
    }

    /*Step 3
     **"Hotel Management" sekmesinden "Hotels Rooms" butonuna tıklanır  */
    @Test
    public void test03(){

        hmcPage.hotelManagementLinki.click();

        roomsPage.hotelRoomsLink.click();
    }

    /*Step 4
    ** Herhangi bir "Details" butonu tıklanır */

    @Test
    public void test04(){

        roomsPage.detailsLink.click();
    }

    /*Step 5
    ** Sayfanın en sonuna gelinerek "Delete" butonu tıklanır, verilen hata mesajları onaylanır */
    @Test
    public void test05() throws InterruptedException {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        roomsPage.deleteButon.click();
        roomsPage.continueOkButon.click();
        ReusableMethods.waitFor(3);
        roomsPage.errorOkButon.click();


    }


}
