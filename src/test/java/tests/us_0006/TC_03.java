package tests.us_0006;

import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelRoomsPage;
import utilities.ConfigReader;

public class TC_03 {

    HMCPage hmcPage = new HMCPage();
    HotelRoomsPage roomsPage = new HotelRoomsPage();
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
    //3-Yonetici olarak gecerli bir username girin
    @Test
    public void test03() {
        hmcPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }
    //4-Yonetici olarak gecerli bir password girin
    @Test
    public void test04(){
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }
    //5-Login butonuna tiklayin
    @Test
    public void test05() {
        hmcPage.loginButonu.click();
    }
    //6-Hotel management yazisina tiklayin
    @Test
    public void test06() {
        hmcPage.hotelManagementLinki.click();
    }

    //7-Hotel rooms yazisina tiklayin
    @Test
    public void test07() {
       roomsPage.hotelRoomsLink.click();
    }
}
