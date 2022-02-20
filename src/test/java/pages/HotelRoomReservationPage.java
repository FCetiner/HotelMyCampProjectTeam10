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

    @FindBy(xpath = "//span[text()='Hotel Management']")
    WebElement hotelManagementText;
    @FindBy(xpath = "((//ul[@class='sub-menu'])[3]/li)[3]")
    WebElement roomReservationTextBox;


    public void HMCLogin() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        homePageLoginButton.click();
        usernameTextBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordTextBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginPageLoginButton.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Admin"));

    }















































    public void hotelManagementTextKontrol(){
        hotelManagementText.click();
        roomReservationTextBox.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("List Of Reservations"));
    }

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement systemManagementButton;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement hotelManagementButtonu;

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









}
