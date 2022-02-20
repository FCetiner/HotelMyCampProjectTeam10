package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class HotelRoomReservationPage {
    public HotelRoomReservationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//***************Gokhan Bey-Hacer Hanim**************************
@FindBy(id = "navLogon")
WebElement homePageLoginButton;

    @FindBy(id="UserName")
    WebElement usernameTextBox;
    @FindBy(id="Password")
    WebElement passwordTextBox;
    @FindBy(id="btnSubmit")
    WebElement loginPageLoginButton;



    public void HMCLogin(){
        HotelRoomReservationPage elements=new HotelRoomReservationPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        elements.homePageLoginButton.click();
        elements.usernameTextBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        elements.passwordTextBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        elements.loginPageLoginButton.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Admin"));





    }

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement systemManagementButton;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement hotelManagementButtonu;

    @FindBy (xpath = "(//span[@class='title'])[2]")
    public WebElement userManagemetElement;

    @FindBy (xpath="/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[3]/a")
    public WebElement roomReservationsButton;

    @FindBy (xpath = "//span[@class='hidden-480']")
    public WebElement addRoomReservationButton;

    @FindBy (className = "caption")
    public WebElement createHotelroomreservatıonYazisi;

    @FindBy (xpath = "(//select[@class='form-control input-lg required'])[1]")
        public WebElement IDUserDropDown;

    @FindBy (xpath = "(//select[@class='form-control input-lg required'])[2]")
    public WebElement IDUserOdaDropDown;

    @FindBy(xpath = "//input[@id='Price']")
    public WebElement priceReservation;

    @FindBy (xpath = "//input[@id='DateStart']")
    public WebElement dataStart;

    @FindBy (xpath = "//input[@id='DateEnd']")
    public WebElement dataEnd;

    @FindBy(xpath = "//input[@id='AdultAmount']")
    public WebElement adultAmount;

    @FindBy (xpath = "//input[@id='ChildrenAmount']")
    public WebElement childrenAmount;

    @FindBy (xpath = "//input[@id='ContactNameSurname']")
    public WebElement contactNameSurname;

    @FindBy (xpath = "//input[@id='ContactPhone']")
    public WebElement contactPhone;

    @FindBy (xpath = "//input[@id='ContactEmail']")
    public WebElement contactEmail;

    @FindBy (xpath = "//input[@id='Notes']")
    public WebElement notes;

    @FindBy(xpath = "//input[@id='Approved']")
    public WebElement approvedElementi;

    @FindBy (xpath = "//input[@id='IsPaid']")
    public WebElement isPaidEmenti;

    @FindBy (xpath = "//button[@id='btnSubmit']")
    public WebElement saveButonu;

@FindBy(xpath = "(//button[@class='btn default'])[2]")
public WebElement baslangicDate;
@FindBy(xpath = "(//button[@class='btn default'])[3]")
    public WebElement bitisDate;
@FindBy (xpath = "@FindBy (//div[@class='bootbox)\n")
public WebElement saveDogrulama;
@FindBy (xpath = "//button[@class='btn btn-primary']")
public WebElement okButton;
}
