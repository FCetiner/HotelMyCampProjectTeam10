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

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement firstLoginButton;


    @FindBy(xpath = "//input[@id='UserName']")

    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement managerYaziLinki;

    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement listOfUsersYaziElementi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement detailsLinki;
    @FindBy(xpath = "(//div[@class='caption'])[1]")
    public WebElement editYaziLinki;

    public void bekle(int saniye) {

        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Yönetici Giriş yap methodu olusturulacak
    public void yoneticiGirisYap() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        firstLoginButton.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();
    }
    //Kullanici Giriş yap  methodu oluşturulacak


}
