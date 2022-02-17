package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class HotelListPage {
    public HotelListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    /***************Hadi Bey-Murat Bey*******************/

    @FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement managerYaziLinki;

    @FindBy(xpath = "(//a[@class ='btn btn-xs default'])[1]")
    public WebElement detailsLink;


    @FindBy(xpath = "(//div[@class='caption'])[1]")
    public WebElement editYaziLinki;

    @FindBy(xpath= "//input[@id='Code']")  //input[@id='Code']
    public WebElement codeBox;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement groupIdBox;

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okButton;







}
