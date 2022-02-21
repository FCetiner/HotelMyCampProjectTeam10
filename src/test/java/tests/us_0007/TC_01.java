package tests.us_0007;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class TC_01 extends TestBaseRapor {

    Actions actions=new Actions(Driver.getDriver());
    HMCPage hmcPage =new HMCPage();
    HotelRoomsPage roomsPage=new HotelRoomsPage();
    /*  Yönetici olarak anasayfaya gidebilmeli
     **Kullanıcı url yi girer */

    @Test
    public void test01(){

        extentTest=extentReports.createTest("TC_01","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.anasayfaGiris();
        extentTest.info("Url ye gidildi");
    }

    /*
       ** Log-in butonunun görülür olduğunu kontrol eder  */

    @Test
    public void test02(){
        Assert.assertTrue(hmcPage.ilkLoginLinki.isDisplayed());
        extentTest.pass("Log-in butonu görüldü");


    }
}
