package tests.us_0004;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import utilities.ConfigReader;
import utilities.Driver;


public class TC_01 {
    /*
     * TC_001 Hoetel Sayafasina Gidelim https://www.hotelmycamp.com/

     * TC_002 Yönetici Olarak
     * Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin

     * TC_003 Yönetici olarak
     * Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
     * Otel Management Linkini Tikla ,  Otel List Linkini Tikla, Add Otel Linkini Tikla,
     * Create Hotel "Create Hotel" yazini gorunuru oldugunu test et.

     * TC_004 Yönetici olarak
     * Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
     * Otel Management Linkini Tikla ,  Otel List Linkini Tikla, Add Otel Linkini Tikla,
     * Create Hotel formunu daki Code,Name,Adrress, Phone,Email,IDGroup ilgili alanlari doldur
     * Save Buttunan basıp kaydet.

     *TC_005 Yönetici olarak
     * Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
     * Otel Management Linkini Tikla ,  Otel List Linkini Tikla,
     * (LIST OF HOTELS tablosunda, Code,Name,Adrress, Phone,Email yazdigin verilerden herhangi birini gir.
     * Search Buttununa tikla
     * Kayit olup olmadigini test et...
     */




    @Test
    public void test01() {
       //TC_001 Hoetel Sayafasina Gidelim https://www.hotelmycamp.com/
        Driver.getDriver().get("https://www.hotelmycamp.com/");
    }

    @Test
    public void test02() {
         // TC_002 Yönetici Olarak
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
        HMCPage hmcPage=new HMCPage();
        hmcPage.girisYap();
    }

    @Test
    public void test03(){
     // TC_003 Yönetici olarak
    // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
    // Otel Management Linkini Tikla ,  Otel List Linkini Tikla, Add Otel Linkini Tikla,
    // Create Hotel "Create Hotel" yazini gorunuru oldugunu test et.
        HMCPage hmcPage=new HMCPage();
        hmcPage.girisYap();
        hmcPage.hotelManagementLinki.click();
        hmcPage.hotelListLinki.click();
        hmcPage.addHotelLinki.click();
        Assert.assertTrue(hmcPage.CreatHotelYazi.isDisplayed());
}

@Test
    public void test04(){

        // TC_004 Yönetici olarak
    // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
    // Otel Management Linkini Tikla ,  Otel List Linkini Tikla, Add Otel Linkini Tikla,
    // Create Hotel formunu daki Code,Name,Adrress, Phone,Email,IDGroup ilgili alanlari doldur
    // Save Buttunan basıp kaydet.
        HMCPage hmcPage=new HMCPage();
        hmcPage.girisYap();
        hmcPage.hotelManagementLinki.click();
        hmcPage.hotelListLinki.click();
        hmcPage.addHotelLinki.click();

    Actions actions=new Actions(Driver.getDriver());
    Faker faker=new Faker();
    String email=faker.internet().emailAddress();

    actions.click(hmcPage.AddHotelCode)
            .sendKeys(faker.address().zipCode())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.name().firstName())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.address().fullAddress())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.phoneNumber().cellPhone())
            .sendKeys(Keys.TAB)
            .sendKeys(faker.internet().emailAddress())
            .sendKeys(Keys.TAB).sendKeys(Keys.PAGE_DOWN).perform();
    Select select =new Select(hmcPage.IDGroupkutusu);
    select.selectByVisibleText("Hotel Type1");

    hmcPage.AddHotelSaveButton.click();
    hmcPage.AddHotelOkButton.click();


}

}
