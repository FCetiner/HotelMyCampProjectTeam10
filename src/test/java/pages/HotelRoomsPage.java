package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelRoomsPage {

    public HotelRoomsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //***************Burak Bey-Deniz Hanim**************************

    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement hotelRoomsLink;

    @FindBy(xpath = "//span[@class ='hidden-480']")
    public WebElement addRoomLink;

    @FindBy(xpath = "//a[@class ='btn btn-xs default']")
    public WebElement detailsLink;

    @FindBy(xpath = "//a[text() ='List Of Hotelrooms']")
    public WebElement roomKontrolLink;


    @FindBy(xpath = "//select[@id='IDHotel']")
    public WebElement hotelIdbox ;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeBox ;

    @FindBy(xpath = "//input[@id='Name']")
    public WebElement nameBox ;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeButon ;

    @FindBy(xpath = "//input[@id='Location']")
    public WebElement locationButon ;

    @FindBy(xpath = "//select[@id='IDGroupRoomType']")
    public WebElement roomTypeButon ;

    @FindBy(xpath = "//input[@id='MaxAdultCount']")
    public WebElement maxAdultButon ;

    @FindBy(xpath = "//input[@id='IsAvailable']")
    public WebElement isAvailableButon ;

    @FindBy(xpath = "//button[@class='btn green']")
    public WebElement saveButon ;

    @FindBy(xpath = "//button[@id='btnDelete']")
    public WebElement deleteButon ;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement continueOkButon ;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement errorOkButon ;
































}
