package pages;

import jdk.jfr.consumer.RecordedMethod;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;

import java.util.List;

public class HMCPage {


    public HMCPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }



    //***************Ferhat-Funda Hanim-Çagri Bey**************************


    public void anasayfaGiris() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }

   public void yoneticigirisYap() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();

    }

    @FindBy( xpath ="//a[text()='Hotelmycamp']")
    public WebElement hotelMyCampYazisi;

    @FindBy (xpath = "//li[@class='nav-item']")
    public List<WebElement> anasayfadakiWebElementler;

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy (xpath ="//li[@class='dropdown dropdown-user']" )
    public WebElement managerDrapDown;

    @FindBy(xpath ="//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;

    @FindBy(xpath = "//div[@Class='caption']")
    public WebElement CreatHotelYazi;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement AddHotelCode;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement IDGroupkutusu;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement AddHotelSaveButton;

    @FindBy(xpath = "//button[@Class='btn btn-primary']")
    public WebElement AddHotelOkButton;

    @FindBy(xpath = "(//input[@Class='form-control form-filter input-sm'])[6]")
    public WebElement EmailtextBox;

    @FindBy(xpath = "//button[@Class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement SearchBoxButton;

    //**************MAIN PAGE NAVBAR LOCATELERI*******************
    @FindBy(id = "navHome")
    public WebElement mainPageHomeButton;

    @FindBy(id = "navRooms")
    public WebElement mainPageRoomsButton;

    @FindBy(id = "navRestaurant")
    public WebElement mainPageRestaurantButton;

    @FindBy(id = "navAbout")
    public WebElement mainPageAboutButton;

    @FindBy(id = "navBlog")
    public WebElement mainPageBlogButton;

    @FindBy(id = "navContact")
    public WebElement mainPageContactButton;

    //*************************************************

    @FindBy(xpath = "//h1[.='Log in']")
    public WebElement loginPageLoginTextWebElement;

    @FindBy(xpath = "//a[.='Hotelmycamp']")
    public WebElement mainPageHotelMyCampTextWebElement;

    @FindBy (id = "checkin_date")
    public WebElement mainPageCheckInDateBox;

    @FindBy(id = "checkout_date")
    public WebElement mainPageCheckOutDateBox;

    @FindBy(id = "IDRoomType")
    public WebElement mainPageRoomTypeDropDown;

    @FindBy(id = "AdultCount")
    public WebElement mainPageAdultCountDropdown;

    @FindBy(xpath = "//input[@value='Check Availability']")
    public WebElement mainPageCheckAvailabilityButton;



    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement logInButtonu;

    @FindBy(xpath = "//span[text()='Create a new account']")
    public WebElement createNewAccount;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement createUsername;


    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement createSaveButton;

    @FindBy(xpath = "/div[@class='bootbox-body']")
    public WebElement createSaveTexti;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement createOkButton;

    @FindBy(xpath = "//h2[.='Welcome To Our Hotel']")
    public WebElement mainPageSayfaOrtasiWelcomToOurHotelYaziElementi;

    @FindBy(xpath = "(//a[@href='#'])[1]")
    public WebElement mainPageilkFacebookIkonu;

    @FindBy(xpath = "(//a[@href='#'])[2]")
    public WebElement mainPageilkGooglePlusIkonu;

    @FindBy(xpath = "(//a[@href='#'])[3]")
    public WebElement mainPageilkInstagramIkonu;

    public void girisYap() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();

    }
    @FindBy(xpath = "//div[@class='d-flex justify-content-center']")
    public List<WebElement> mainPageServiceLogoWebElementListesi;

    @FindBy(xpath = "(//h2[@class='mb-4'])[3]")
    public WebElement mainPageOurRoomsTitleWebElement;

    @FindBy(xpath = "(//a[.='View Room Details '])[1]")
    public WebElement mainPageViewRoomDetailsWebElement1;

    @FindBy(xpath = "(//a[.='View Room Details '])[2]")
    public WebElement mainPageViewRoomDetailsWebElement2;

    @FindBy(xpath = "(//a[.='View Room Details '])[3]")
    public WebElement mainPageViewRoomDetailsWebElement3;

    @FindBy(xpath = "(//a[.='View Room Details '])[4]")
    public WebElement mainPageViewRoomDetailsWebElement4;

    @FindBy(xpath = "(//a[.='View Room Details '])[5]")
    public WebElement mainPageViewRoomDetailsWebElement5;

    @FindBy(xpath = "(//a[.='View Room Details '])[6]")
    public WebElement mainPageViewRoomDetailsWebElement6;

    @FindBy(xpath = "//div[@class='block-18 text-center']")
    public List<WebElement> mainPageHappyGuestsBasliklarListesi;

    @FindBy(xpath = "(//div[@class='container'])[13]")
    public WebElement mainPagemisafirYorumlariWebElemet;

    @FindBy(xpath = "(//div[@class='text mt-3 d-block'])[1]")
    public WebElement mainPageBlogsWebElement1;

    @FindBy(xpath = "(//div[@class='text mt-3 d-block'])[2]")
    public WebElement mainPageBlogsWebElement2;

    @FindBy(xpath = "(//div[@class='text mt-3 d-block'])[3]")
    public WebElement mainPageBlogsWebElement3;

    @FindBy(xpath = "(//div[@class='text mt-3 d-block'])[4]")
    public WebElement mainPageBlogsWebElement4;

    @FindBy(xpath = "//section[@class='instagram']")
    public WebElement mainPagesectionInstagram;

    @FindBy(xpath = "//a[@class='insta-img image-popup']")
    public List<WebElement> mainPageInstagramFotograflarListesi;

    @FindBy(xpath = "//footer[@class='ftco-footer ftco-bg-dark ftco-section']")
    public  WebElement mainPageFooter;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[1]")
    public WebElement mainPageUsefulLinkBlog;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[2]")
    public WebElement mainPageUsefulLinkRooms;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[3]")
    public WebElement mainPageUsefulLinkAmentitiesTest;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[4]")
    public WebElement mainPageUsefulLinkGiftCard;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[5]")
    public WebElement mainPagePrivacyGiftCareer;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[6]")
    public WebElement mainPagePrivacyAboutUs;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[7]")
    public WebElement mainPagePrivacyContactUs;

    @FindBy(xpath = "(//a[@class='py-2 d-block'])[8]")
    public WebElement mainPagePrivacyServices;

    @FindBy(xpath = "(//span[@class='text'])[2]")
    public WebElement mainPageTelephoneLink;

    @FindBy(xpath = "(//span[@class='text'])[3]")
    public WebElement mainPageEmailLink;

    @FindBy(xpath = "//span[@class='icon-twitter']")
    public WebElement mainPageFooterTwitterIkon;

    @FindBy(xpath = "(//span[@class='icon-instagram'])[2]")
    public WebElement mainPageFooterInstagramIkon;

    @FindBy(xpath = "(//span[@class='icon-facebook'])[2]")
    public WebElement mainPageFooterFacebookIkon;

    @FindBy(id = "section-counter")
    public WebElement sectionCounterOtelBilgileriBolumu;

    //

}
