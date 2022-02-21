package tests.us_0006;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {

    HMCPage hmcPage =new HMCPage();

    //1-Yonetici olarak ana sayfaya gidin
    @Test
    public void test01() {
        extentTest=extentReports.createTest("TC_01","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.anasayfaGiris();

        extentTest.info("Url ye gidildi");
    }

    //2-Login yazisina tiklayin
    @Test
    public void test02() {
        extentTest=extentReports.createTest("TC_01","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(4);
        hmcPage.ilkLoginLinki.click();
        extentTest.info("\"Log in\" linkine tiklanildi");

    }

}
