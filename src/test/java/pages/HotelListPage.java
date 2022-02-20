package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class HotelListPage {
    public HotelListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    /***************Hadi Bey-Murat Bey*******************/

    @FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement managerTextElement;

    @FindBy(xpath = "(//a[@class ='btn btn-xs default'])[1]")
    public WebElement detailsElement;


    @FindBy(xpath = "(//div[@class='caption'])[1]")
    public WebElement editTextElement;

    @FindBy(xpath = "//input[@id='Code']")  //input[@id='Code']
    public WebElement codeBox;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement groupIdBox;

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okButton;

    @FindBy(xpath = "//input[@name='Code']")
    public WebElement searchCodeBox;

    @FindBy(xpath = "//button[@Class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement searchBoxButton;


    @FindBy(xpath = "//a[@class='btn btn-xs default']")
    public WebElement foundedDetailsElement;

    @FindBy(xpath = "//button[@id='btnDelete']")
    public WebElement deleteButtonWebElement;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement alertOKButtonWebElement;

    @FindBy(xpath = "//div[text()='Would you like to continue?']")
    public WebElement deleteAlertTextWebElement;

    Faker faker = new Faker();
    public String idString=faker.idNumber().invalid();

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logOut;




}
