package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HMCPage {
    public HMCPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }



    public void anasayfaGiris(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }

    public void girisYap() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();

    }


    //Yönetici Giriş yap methodu olusturulacak
    //Kullanici Giriş yao methodu oluşturulacak

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

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

    @FindBy(xpath = "(//span[@class='icon-facebook'])[1]")
    public WebElement mainPageilkFacebookIkonu;

    @FindBy(xpath = "(//span[@class='icon-google-plus'])[1]")
    public WebElement mainPageilkGooglePlusIkonu;

    @FindBy(xpath = "(//span[@class='icon-instagram'])[1]")
    public WebElement mainPageilkInstagramIkonu;









}



