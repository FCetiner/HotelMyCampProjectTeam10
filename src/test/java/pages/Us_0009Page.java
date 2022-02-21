package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class Us_0009Page {
    public Us_0009Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "navLogon")
    WebElement homePageLoginButton;

    @FindBy(id="UserName")
    WebElement usernameTextBox;
    @FindBy(id="Password")
    WebElement passwordTextBox;
    @FindBy(id="btnSubmit")
    WebElement loginPageLoginButton;



    public void HMCLogin(){
        Us_0009Page elements=new Us_0009Page();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        elements.homePageLoginButton.click();
        elements.usernameTextBox.sendKeys(ConfigReader.getProperty("HMCValidUserName"));
        elements.passwordTextBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        elements.loginPageLoginButton.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Admin"));





    }

}


