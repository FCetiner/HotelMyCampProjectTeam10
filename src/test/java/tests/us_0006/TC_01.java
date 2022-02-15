package tests.us_0006;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HMCPage;

public class TC_01 {
    //1-Yonetici olarak ana sayfaya gidin
    @Test
    public void test01() {
        HMCPage hmcPage = new HMCPage();
        SoftAssert softAssert = new SoftAssert();
        hmcPage.anasayfaGiris();
    }

    //2-Login yazisina tiklayin
    @Test
    public void test02() {
        HMCPage hmcPage = new HMCPage();
        SoftAssert softAssert = new SoftAssert();
        hmcPage.ilkLoginLinki.click();

    }
}
