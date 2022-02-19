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






















}
