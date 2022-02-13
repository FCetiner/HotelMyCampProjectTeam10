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

    public void anasayfaGiris(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }


    //Yönetici Giriş yap methodu olusturulacak
    //Kullanici Giriş yao methodu oluşturulacak

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;


    public void girisYap() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

    }

}
