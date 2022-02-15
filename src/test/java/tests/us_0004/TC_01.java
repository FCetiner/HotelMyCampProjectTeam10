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
     * Kayit olmadugunu test et....
     */


    @Test
    public void test01() {
        //TC_001 Hoetel Sayafasina Gidelim https://www.hotelmycamp.com/
        Driver.getDriver().get("https://www.hotelmycamp.com/");
    }

    @Test
    public void test02() { // TC_002

        HMCPage hmcPage = new HMCPage();
        //Yönetici Olarak giris yap
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
         hmcPage.girisYap();
    }

    @Test
    public void test03() { //TC_003

        //  Yönetici olarak giris yapar.
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
        HMCPage hmcPage = new HMCPage();
        hmcPage.girisYap();

        // Otel Management Linkini Tikla
        hmcPage.hotelManagementLinki.click();

        //Otel List Linkini Tikla,
        hmcPage.hotelListLinki.click();

        //Add Otel Linkini Tikla
        hmcPage.addHotelLinki.click();

        // Create Hotel "Create Hotel" yazini gorunuru oldugunu test et.
        Assert.assertTrue(hmcPage.CreatHotelYazi.isDisplayed());
    }

    @Test
    public void test04() { // TC_004
        HMCPage hmcPage = new HMCPage();

        //  Yönetici olarak giris yapar.
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
        hmcPage.girisYap();

        // Otel Management Linkini Tikla
        hmcPage.hotelManagementLinki.click();

        //Otel List Linkini Tikla,
        hmcPage.hotelListLinki.click();

        //Add Otel Linkini Tikla
        hmcPage.addHotelLinki.click();

        // Create Hotel formunu daki Code,Name,Adrress, Phone,Email,IDGroup ilgili alanlari doldur
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();

        actions.click(hmcPage.AddHotelCode)

                // Code textbox doldurunuz
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                // Username yaziniz
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                // Addres yaziniz
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                // Telefon Number yaziniz
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                // Email Adderessinizi yaziniz
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys(Keys.PAGE_DOWN).perform();
        // Hotel tipi seciniz
        Select select = new Select(hmcPage.IDGroupkutusu);
        select.selectByVisibleText("Hotel Type1");

        // Save Buttunan basıp kaydet.
        hmcPage.AddHotelSaveButton.click();

        //Otel başarıyla eklendi Ok buttununa basınız.
        hmcPage.AddHotelOkButton.click();


    }

    @Test
    public void test05() { // TC_005
        HMCPage hmcPage = new HMCPage();


        //  Yönetici olarak giris yapar.
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
        hmcPage.girisYap();

        // Otel Management Linkini Tikla
        hmcPage.hotelManagementLinki.click();

        // Otel List Linkini Tikla,
        hmcPage.hotelListLinki.click();

        // (LIST OF HOTELS tablosunda, Code,Name,Adrress, Phone,Email yazdigin verilerden herhangi birini gir.
        hmcPage.EmailtextBox.sendKeys("hana@gmail.com"+Keys.ENTER);
        // Search Buttununa tikla
        hmcPage.SearchBoxButton.click();

        // Kayit olmadugunu test et....




    }
}
