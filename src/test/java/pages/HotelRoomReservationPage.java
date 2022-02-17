package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;

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



    public void HMCLogin(){
        HotelRoomReservationPage elements=new HotelRoomReservationPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        elements.homePageLoginButton.click();
        elements.usernameTextBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        elements.passwordTextBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        elements.loginPageLoginButton.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Admin"));





    }


















}
