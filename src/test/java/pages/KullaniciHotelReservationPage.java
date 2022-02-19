package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KullaniciHotelReservationPage {
    public KullaniciHotelReservationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement logInButtonu;
    @FindBy(xpath = "//span[text()='Create a new account']")
    public WebElement createNewAccount;
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement createUsername;



    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement createSaveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement createSaveTexti;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement createOkButton;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement ikinciLoginButonu;

    @FindBy(xpath = "//a[.='Rooms']")
    public WebElement roomsButton;
    @FindBy(xpath = "//input[@class='form-control checkout_date required']")
    public WebElement checOutDateTextBox;

    @FindBy(xpath = "//input[@class='form-control checkin_date required']")
    public WebElement checkInDateTextBox;

    @FindBy(xpath = "(//select[@class='form-control'])[1]")
    public WebElement selectRoomTextBox;

    @FindBy(xpath = "(//select[@class='form-control'])[2]")
    public WebElement selectAdultTextBox;

    @FindBy(xpath = "(//select[@class='form-control'])[3]")
    public  WebElement selectChildrenTextBox;

    @FindBy(xpath = "//input[@id='location']")
    public WebElement locationTextBox;


    @FindBy(xpath = "//input[@value='Search']")
    public WebElement searchButton;
}
