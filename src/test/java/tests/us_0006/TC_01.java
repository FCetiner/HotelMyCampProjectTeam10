package tests.us_0006;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.Driver;

public class TC_01 {
    HMCPage hmcPage =new HMCPage();

    //1-Yonetici olarak ana sayfaya gidin
    @Test
    public void test01() {
        hmcPage.anasayfaGiris();
    }

    //2-Login yazisina tiklayin
    @Test
    public void test02() {
        hmcPage.ilkLoginLinki.click();
    }
}
