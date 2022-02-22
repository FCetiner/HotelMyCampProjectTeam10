package tests.us_0006;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelListPage;
import pages.HotelRoomsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {
    HMCPage hmcPage = new HMCPage();

    //1-Yonetici olarak ana sayfaya gidin
    @Test
    public void test01() {
        extentTest=extentReports.createTest("TC_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
      hmcPage.anasayfaGiris();
        extentTest.info("Url ye gidildi");
    }
    //2-Login yazisina tiklayin
    @Test
    public void test02() {
        extentTest=extentReports.createTest("TC_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.ilkLoginLinki.click();
        extentTest.info("\"Log in\" linkine tiklanildi");
    }
    //3-Yonetici olarak gecerli bir username girin
    @Test
    public void test03() {
    extentTest=extentReports.createTest("TC_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
       hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        extentTest.info("\"UsernameBox\" kutusuna gecerli bir yonetici adi girldi");
    }

    //4-Yonetici olarak gecerli bir password girin
    @Test
    public void test04() {
        extentTest=extentReports.createTest("TC_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        extentTest.info("\"passwordBox\" kutusuna gecerli bir password girildi");
    }
    //5-Login butonuna tiklayin

    @Test
    public void test05() {
        extentTest=extentReports.createTest("TC_02","\"Log in\" buttonuna tiklayarak, giris yapabilmeli.");
        hmcPage.loginButonu.click();
        extentTest.info("\"login\" butonuna tiklanildi");
    }

}
