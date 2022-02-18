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

    @FindBy(xpath = "//span[text()='Hotel Management']")
    WebElement hotelManagementText;
    @FindBy(xpath = "((//ul[@class='sub-menu'])[3]/li)[3]")
    WebElement roomReservationTextBox;


    public void HMCLogin() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        homePageLoginButton.click();
        usernameTextBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordTextBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginPageLoginButton.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Admin"));






    }



    public void hotelManagementTextKontrol(){
        hotelManagementText.click();
        roomReservationTextBox.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("List Of Reservations"));
    }

















}
