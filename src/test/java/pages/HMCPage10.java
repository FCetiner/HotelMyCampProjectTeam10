package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage10 {
    public HMCPage10(){
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

}
