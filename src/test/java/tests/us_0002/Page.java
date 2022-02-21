package tests.us_0002;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Page {

    public Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public void anasayfaGiris(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }
    @FindBy (xpath = "(//a[@class='nav-link'])[7]")
    public WebElement anasayfaLogin;

    @FindBy( xpath ="//a[text()='Hotelmycamp']")
    public WebElement hotelMyCampYazisi;

    @FindBy (xpath = "//li[@class='nav-item']")
    public List<WebElement> anasayfadakiWebElementler;
}
