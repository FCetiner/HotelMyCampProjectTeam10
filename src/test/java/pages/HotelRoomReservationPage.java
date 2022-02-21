package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
    @FindBy(xpath ="(//tbody//tr[1])//td[14]" )
    WebElement detailButton;
    @FindBy(id="AdultAmount")
    WebElement adultAmountTextBox;
    @FindBy(xpath = "(//button[text()='Save'])[1]")
    WebElement saveButtonTextBox;

    @FindBy(id ="btnDelete")
    WebElement deleteButton;



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

    public void userInfoUpdate() throws InterruptedException {
        detailButton.click();

        adultAmountTextBox.clear();

        adultAmountTextBox.sendKeys("3");

        saveButtonTextBox.click();

        Assert.assertTrue(saveButtonTextBox.isEnabled());

    }


    public void deleteReservation(){
        detailButton.click();
        Assert.assertTrue(deleteButton.isEnabled());
        deleteButton.click();

    }





















}
