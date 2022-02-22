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
    HotelListPage hotelListPage=new HotelListPage();

    @Test
    public void test01() {

        //TC_001 Hoetel Sayafasina Gidelim https://www.hotelmycamp.com/
        hotelListPage = new HotelListPage();
        extentTest = extentReports.createTest("test01", "Anasayfa Giris Testi");
        hotelListPage.anasayfaGiris();
        extentTest.pass("Anasayfa Giris Basarli");
        //Driver.getDriver().get("https://www.hotelmycamp.com/");

    }



    @Test
    public void test02() { // TC_002
        hotelListPage=new HotelListPage();
        //Yönetici Olarak giris yap
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
        extentTest = extentReports.createTest("test02", "Anasayfa Giris Testi");
        hotelListPage.girisYap();
        extentTest.pass("Anasayfa Giris Basarli");
        hotelListPage.anasayfaGiris();
        hotelListPage.loginOutElementi.click();


    }

    @Test
    public void test03() { //TC_003

        //  Yönetici olarak giris yapar.
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
        hotelListPage=new HotelListPage();
        extentTest = extentReports.createTest("test03", "Anasayfa Giris Testi");
        hotelListPage.girisYap();
        extentTest.pass("Anasayfa Giris Basarli");

        // Otel Management Linkini Tikla
        hotelListPage.hotelManagementLinki.click();
        extentTest.pass("Hotel Managent Linkini Tiklanmasi Basarili");

        //Otel List Linkini Tikla,
        hotelListPage.hotelListLinki.click();
        extentTest.pass("Hotel List Linkini Tiklanmasi Basarili");

        //Add Otel Linkini Tikla
        hotelListPage.addHotelLinki.click();
        extentTest.pass("Add Hotel Linki Tiklanmasi Basarili");

        // Create Hotel "Create Hotel" yazini gorunuru oldugunu test et.
        Assert.assertTrue(hotelListPage.CreatHotelYazi.isDisplayed());
        System.out.println("Create Hotel Kayit Formu==>"+hotelListPage.CreatHotelYazi.getText());
        extentTest.pass("Create Hotel yazini gorunuru Basarili");
        hotelListPage.anasayfaGiris();
        hotelListPage.loginOutElementi.click();

    }

    @Test
    public void test04() throws InterruptedException { // TC_004
        hotelListPage=new HotelListPage();

        //  Yönetici olarak giris yapar.
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
        extentTest = extentReports.createTest("test04", "Anasayfa Giris Testi");
        hotelListPage.girisYap();
        extentTest.pass("Anasayfa Giris Basarli");


        // Otel Management Linkini Tikla
       hotelListPage.hotelManagementLinki.click();
       extentTest.pass("Hotel Management Linki tiklanmasi Basarili");

        //Otel List Linkini Tikla,
        hotelListPage.hotelListLinki.click();
        extentTest.pass("Hotel List Linkini Tiklanmasi Basarili");

        //Add Otel Linkini Tikla
       hotelListPage.addHotelLinki.click();
       extentTest.pass("Add Hotel Linki Tiklanmasi Basarili");

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
        Assert.assertTrue(hotelListPage.kayitOlunanOtelTipi.isDisplayed());
        System.out.println("Kayit Olunan Kayit Tipi==>"+ hotelListPage.kayitOlunanOtelTipi.getText());


        // Save Buttunan basıp kaydet.
        Thread.sleep(3000);
        hotelListPage.AddHotelSaveButton.click();

        //Otel başarıyla eklendi Ok buttununa basınız.
        Thread.sleep(3000);
        hotelListPage.AddHotelOkButton.click();

        hotelListPage.anasayfaGiris();
        hotelListPage.loginOutElementi.click();



    }

    @Test
    public void test05() { // TC_005
        hotelListPage=new HotelListPage();


        //  Yönetici olarak giris yapar.
        // Logini Tikla  Kullanici adi  ve sifre degerlerini yazdirip, giris butonuna basin ve giris yapin
        extentTest = extentReports.createTest("test05", "Anasayfa Giris Testi");
        hotelListPage.girisYap();


        // Otel Management Linkini Tikla
        hotelListPage.hotelManagementLinki.click();
        extentTest.pass("Hotel Management Linki Tiklanmasi Basarili");

        // Otel List Linkini Tikla,
        hotelListPage.hotelListLinki.click();
        extentTest.pass("Hotel List Linkini Tiklanmasi Basarili");

        // (LIST OF HOTELS tablosunda, Code,Name,Adrress, Phone,Email yazdigin verilerden herhangi birini gir.
        hotelListPage.ListOfHotelsUsername.sendKeys("aslan"+Keys.ENTER);
        extentTest.pass("ListOf Hotel UserName İsim Yazilmasi Basarili");

        hotelListPage.EmailtextBox.sendKeys("aslan@gmail.com"+Keys.ENTER);
        extentTest.pass("TextBox Email adresi yazilmasi Basarili");

        // Search Buttununa tikla
        hotelListPage.SearchBoxButton.click();
        extentTest.pass("Search BoxButton Tiklanmasi Basarili");

        // aslan ve aslan@gmail.com kayit oldugunu test et.
        Assert.assertTrue(hotelListPage.kayitUserName.isDisplayed());
        System.out.println("Kayit olunan İsim==>"+hotelListPage.kayitUserName.getText());
        extentTest.pass("kayit olunan isim kayit olundugu test edildi");

        Assert.assertTrue(hotelListPage.kayitEmail.isDisplayed());
        extentTest.pass("kayit olunan email adresi ile kayit olundugu test edildi");

        hotelListPage.anasayfaGiris();
        hotelListPage.loginOutElementi.click();

    }
}
