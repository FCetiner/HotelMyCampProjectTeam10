package tests.us_0007;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class TC_03 extends TestBaseRapor {

    Actions actions=new Actions(Driver.getDriver());
    HMCPage hmcPage =new HMCPage();
    HotelRoomsPage roomsPage = new HotelRoomsPage();
    /* Step 1
     **Log-in yapıldıktan sonra "Hotel Management" sekmesinden "Hotel Rooms" sayfasına girilebilmeli
     * ve "List Of Rooms" yazısı görülmeli
     **Kullanıcı url yi girer */

    @Test
    public void test01(){

        extentTest=extentReports.createTest("TC_03_01","Anasayfaya giris yapabilmeli.");

        hmcPage.anasayfaGiris();
        extentTest.info("Url ye gidildi");

    }
    /*Step 2
     **Geçerli bilgilerle Log-in yapılır
     */
    @Test
    public void test02(){
            hmcPage =new HMCPage();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(hmcPage.hotelManagementLinki.isDisplayed());

        extentTest=extentReports.createTest("TC_03_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.girisYap();
        extentTest.info("Gecerli bilgilerle log in yapıldı");
    }

    /*Step 3
      **"Hotel Management" sekmesinden "Hotelş Rooms" butonuna tıklanır  */
    @Test
    public void test03(){

        extentTest=extentReports.createTest("TC_03_03","\"Hotel Management\" buttonuna tiklayarak, \"Hotel Rooms\" butonuna tıklanmalı.");

        hmcPage.hotelManagementLinki.click();
        roomsPage.hotelRoomsLink.click();
        extentTest.info("Hotel Management ve Hotel Rooms butonlarına tıklanıldı");
         }

     /*Step 4
       ** Çıkan sayfada "List Of Rooms" yazısının görüldüğü kontrol edilir
     * */
    @Test
    public void test04(){
        extentTest=extentReports.createTest("TC_03_04","List Of Rooms yazısı görülmeli");

        Assert.assertTrue(roomsPage.roomKontrolLink.isDisplayed());
        extentTest.pass("ListOfRooms yazısı görüldü");
        actions.moveToElement(roomsPage.managerDropDownButton).perform();
        ReusableMethods.waitFor(2);
        roomsPage.logOutButton.click();
    }
}
