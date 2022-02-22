package tests.us_0007;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.TestBaseRapor;


public class TC_01 extends TestBaseRapor {

    Actions actions;
    HMCPage hmcPage;
    HotelRoomsPage roomsPage;
    /*  Yönetici olarak anasayfaya gidebilmeli
     **Kullanıcı url yi girer */

    @Test
    public void test01(){
        actions=new Actions(Driver.getDriver());
        hmcPage =new HMCPage();
        roomsPage=new HotelRoomsPage();
        extentTest=extentReports.createTest("TC_01","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.anasayfaGiris();
        extentTest.info("Url ye gidildi");

    }

    /*
       ** Log-in butonunun görülür olduğunu kontrol eder  */

    @Test
    public void test02(){
        hmcPage =new HMCPage();
        Assert.assertTrue(hmcPage.ilkLoginLinki.isDisplayed());
        extentTest.pass("Log-in butonu görüldü");


    }
}
