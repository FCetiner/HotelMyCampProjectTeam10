package pages;







import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;



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

        Thread.sleep(2000);
        saveButtonTextBox.click();

        Assert.assertTrue(saveButtonTextBox.isEnabled());

    }


    public void deleteReservation(){
        detailButton.click();
        Assert.assertTrue(deleteButton.isEnabled());
        deleteButton.click();

    }



    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement systemManagementButton;

    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement hotelManagementButtonu;

    @FindBy (xpath = "(//span[@class='title'])[2]")
    public WebElement userManagemetElement;

    @FindBy (xpath="/html/body/div[3]/div[1]/div/ul/li[3]/ul/li[2]/ul/li[3]/a")
    public WebElement roomReservationsButton;

    @FindBy (xpath = "//span[@class='hidden-480']")
    public WebElement addRoomReservationButton;


    @FindBy (className = "caption")
    public WebElement createHotelroomreservatıonYazisi;

    @FindBy (xpath = "(//select[@class='form-control input-lg required'])[1]")
        public WebElement IDUserDropDown;

    @FindBy (xpath = "(//select[@class='form-control input-lg required'])[2]")
    public WebElement IDUserOdaDropDown;

    @FindBy(xpath = "//input[@id='Price']")
    public WebElement priceReservation;

    @FindBy (xpath = "//input[@id='DateStart']")
    public WebElement dateStartWebElement;

    @FindBy (xpath = "//input[@id='DateEnd']")
    public WebElement dateEndWebElement;

    @FindBy(xpath = "//input[@id='AdultAmount']")
    public WebElement adultAmount;

    @FindBy (xpath = "//input[@id='ChildrenAmount']")
    public WebElement childrenAmount;

    @FindBy (xpath = "//input[@id='ContactNameSurname']")
    public WebElement contactNameSurname;

    @FindBy (xpath = "//input[@id='ContactPhone']")
    public WebElement contactPhone;

    @FindBy (xpath = "//input[@id='ContactEmail']")
    public WebElement contactEmail;

    @FindBy (xpath = "//input[@id='Notes']")
    public WebElement notes;

    @FindBy(xpath = "//input[@id='Approved']")
    public WebElement approvedElementi;


    @FindBy (xpath = "//input[@id='IsPaid']")
    public WebElement isPaidEmenti;

    @FindBy (xpath = "//button[@id='btnSubmit']")
    public WebElement saveButonu;


    @FindBy (xpath = " //div[@class='bootbox-body']")
    public WebElement saveDogrulama;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement okButton;


    public void dateStart() {
        LocalDate localDate = LocalDate.now();
        LocalDate eklenmisLocalDate = localDate.plusMonths(3);
        DateTimeFormatter duzenliDateStart = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String localDateStr = eklenmisLocalDate.format(duzenliDateStart);
        dateStartWebElement.click();
        dateStartWebElement.sendKeys(localDateStr);
    }
    public void dateEnd() {
        LocalDate localDate = LocalDate.now();
        LocalDate eklenmisLocalDate = localDate.plusMonths(3).plusDays(15);
        DateTimeFormatter duzenliDateStart = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String localDateStr = eklenmisLocalDate.format(duzenliDateStart);
        dateEndWebElement.click();
        dateEndWebElement.sendKeys(localDateStr);
    }

}
