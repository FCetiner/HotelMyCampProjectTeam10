package tests.us_0006;


import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {

    HMCPage hmcPage;

    //1-Yonetici olarak ana sayfaya gidin
    @Test
    public void test01() {
        hmcPage =new HMCPage();
        extentTest=extentReports.createTest("TC_01","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.anasayfaGiris();

        extentTest.info("Url ye gidildi");
    }

    //2-Login yazisina tiklayin
    @Test
    public void test02() {
        hmcPage =new HMCPage();
        extentTest=extentReports.createTest("TC_01","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.anasayfaGiris();
        ReusableMethods.waitFor(4);
        hmcPage.ilkLoginLinki.click();
        extentTest.info("\"Log in\" linkine tiklanildi");
        Driver.closeDriver();

    }

}
