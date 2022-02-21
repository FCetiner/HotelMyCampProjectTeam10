package tests.us_0007;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_05 extends TestBaseRapor {

    HMCPage hmcPage =new HMCPage();
    HotelRoomsPage roomsPage = new HotelRoomsPage();
    Actions actions=new Actions(Driver.getDriver());



    /*Step 1
     *Kullanıcı url yi girer */

    @Test
    public void test01(){

        extentTest=extentReports.createTest("TC_05_01","Anasayfaya giris yapabilmeli.");
        hmcPage.anasayfaGiris();
        extentTest.info("Url ye gidildi");
    }
    /*Step 2
     **Geçerli bilgilerle Log-in yapılır
     */
    @Test
    public void test02(){
        extentTest=extentReports.createTest("TC_05_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.girisYap();
        extentTest.info("Gecerli bilgilerle log in yapıldı");
    }

    /*Step 3
     **"Hotel Management" sekmesinden "Hotels Rooms" butonuna tıklanır  */
    @Test
    public void test03(){

        extentTest=extentReports.createTest("TC_05_03","\"Hotel Management\" buttonuna tiklayarak, \"Hotel Rooms\" butonuna tıklanmalı.");
        hmcPage.hotelManagementLinki.click();
        roomsPage.hotelRoomsLink.click();
        extentTest.info("Hotel Management ve Hotel Rooms butonlarına tıklanıldı");
    }

    /*Step 4
    ** Herhangi bir "Details" butonu tıklanır */

    @Test
    public void test04(){

        extentTest=extentReports.createTest("TC_05_04","Hotel Rooms sayfasından \"Details\" butonuna tıklanmalı");
        roomsPage.detailsLink.click();
        extentTest.info("Details butonuna tıklandı");
    }

    /*Step 5
    ** Sayfanın en sonuna gelinerek "Delete" butonu tıklanır, verilen hata mesajları onaylanır */
    @Test
    public void test05() throws InterruptedException {

        extentTest=extentReports.createTest("TC_05_05","Sayfanın sonuna gelinip \"Delete\" butonuna tıklanarak oda silinmeli");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        roomsPage.deleteButon.click();
        roomsPage.continueOkButon.click();
        ReusableMethods.waitFor(3);
        roomsPage.errorOkButon.click();

        extentTest.info("Oda silinemedi,hata mesajı verdi");
        actions.moveToElement(roomsPage.managerDropDownButton).perform();
        ReusableMethods.waitFor(2);
        roomsPage.logOutButton.click();

    }


}
