package tests.us_0004;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelListPage;
import utilities.Driver;
import utilities.TestBaseRapor;


public class TC_01 extends TestBaseRapor {

    @Test
    public void test01() {

        //TC_001 Hoetel Sayafasina Gidelim https://www.hotelmycamp.com/
        HotelListPage hotelListPage = new HotelListPage();
        extentTest = extentReports.createTest("test01", "Anasayfa Giris Testi");
        hotelListPage.anasayfaGiris();
        extentTest.pass("Anasayfa Giris Basarli");
        //Driver.getDriver().get("https://www.hotelmycamp.com/");
        Driver.closeDriver();
    }



    @Test
    public void test02() { // TC_002

        HotelListPage hotelListPage=new HotelListPage();
        //Yönetici Olarak giris yap
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
         hotelListPage.girisYap();
         Driver.closeDriver();
    }

    @Test
    public void test03() { //TC_003

        //  Yönetici olarak giris yapar.
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
        HotelListPage hotelListPage=new HotelListPage();
        hotelListPage.girisYap();

        // Otel Management Linkini Tikla
        hotelListPage.hotelManagementLinki.click();

        //Otel List Linkini Tikla,
        hotelListPage.hotelListLinki.click();

        //Add Otel Linkini Tikla
        hotelListPage.addHotelLinki.click();

        // Create Hotel "Create Hotel" yazini gorunuru oldugunu test et.
        Assert.assertTrue(hotelListPage.CreatHotelYazi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void test04() { // TC_004
        HotelListPage hotelListPage=new HotelListPage();

        //  Yönetici olarak giris yapar.
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
       hotelListPage.girisYap();

        // Otel Management Linkini Tikla
       hotelListPage.hotelManagementLinki.click();

        //Otel List Linkini Tikla,
        hotelListPage.hotelListLinki.click();

        //Add Otel Linkini Tikla
       hotelListPage.addHotelLinki.click();

        // Create Hotel formunu daki Code,Name,Adrress, Phone,Email,IDGroup ilgili alanlari doldur
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();

        actions.click(hotelListPage.AddHotelCode)

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
        Select select = new Select(hotelListPage.IDGroupkutusu);
        select.selectByVisibleText("Hotel Type1");

        // Save Buttunan basıp kaydet.
        hotelListPage.AddHotelSaveButton.click();

        //Otel başarıyla eklendi Ok buttununa basınız.
        hotelListPage.AddHotelOkButton.click();
Driver.closeDriver();

    }

    @Test
    public void test05() { // TC_005
        HotelListPage hotelListPage=new HotelListPage();


        //  Yönetici olarak giris yapar.
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
        hotelListPage.girisYap();

        // Otel Management Linkini Tikla
        hotelListPage.hotelManagementLinki.click();

        // Otel List Linkini Tikla,
        hotelListPage.hotelListLinki.click();

        // (LIST OF HOTELS tablosunda, Code,Name,Adrress, Phone,Email yazdigin verilerden herhangi birini gir.
        hotelListPage.ListOfHotelsUsername.sendKeys("mustafa"+Keys.ENTER);
        hotelListPage.EmailtextBox.sendKeys("hana@gmail.com"+Keys.ENTER);
        // Search Buttununa tikla
        hotelListPage.SearchBoxButton.click();

        // mustafa ve hana@gmail.com kayit oldugunu
        // Kayit olmadugunu test et.










    }
}
