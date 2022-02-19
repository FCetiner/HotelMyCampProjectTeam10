package tests.us_0007;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelRoomsPage;


public class TC_03 {

    HMCPage hmcPage =new HMCPage();
    HotelRoomsPage roomsPage = new HotelRoomsPage();
    /* Step 1
     **Log-in yapıldıktan sonra "Hotel Management" sekmesinden "Hotel Rooms" sayfasına girilebilmeli ve "List Of Rooms" yazısı görülmeli
     **Kullanıcı url yi girer */

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
      **"Hotel Management" sekmesinden "Hotelş Rooms" butonuna tıklanır  */
    @Test
    public void test03(){

        hmcPage.hotelManagementLinki.click();

        roomsPage.hotelRoomsLink.click();
         }

     /*Step 4
       ** Çıkan sayfada "List Of Rooms" yazısının görüldüğü kontrol edilir
     * */
    @Test
    public void test04(){

        Assert.assertTrue(roomsPage.roomKontrolLink.isDisplayed());
    }
}
