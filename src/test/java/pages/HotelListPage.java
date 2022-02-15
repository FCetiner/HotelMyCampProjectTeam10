package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class HotelListPage {
    public HotelListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //***************Hadi Bey-Murat Bey**************************

    @FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement managerYaziLinki;



















}
