package tests.us_0005;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelListPage;
import utilities.Driver;

import java.util.Set;

public class TC_003 {
    @Test
    public void test() throws InterruptedException {
        HMCPage hmcPage = new HMCPage();
        HotelListPage hotelListPage = new HotelListPage();
        //Hotel anasayfasina gidin
        // Login butonuna tıklayın
        //geçerli bir username girin
        //geçerli bir password girin
        //Log in  tusuna basin
        hmcPage.girisYap();
        //Hotel Management menüsüne tıklayın
        hmcPage.hotelManagementLinki.click();
        //Hotel List menüsüne tıklayın
        hmcPage.hotelListLinki.click();
        //Details butonuna tıklayın
        hotelListPage.detailsLink.click();

        //Code kutusuna  bir Kod girin
        String ilkSayfa = Driver.getDriver().getWindowHandle();
        Set<String> handleDegerleriSeti = Driver.getDriver().getWindowHandles();
        String sayfa2 = "";
        for (String each : handleDegerleriSeti
        ) {
            if (!each.equals(ilkSayfa)) {
                sayfa2 = each;
            }
        }
        Driver.getDriver().switchTo().window(sayfa2);
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        hotelListPage.codeBox.click();
        hotelListPage.codeBox.clear();
        actions.click(hotelListPage.codeBox)

                .sendKeys("161803")
                .sendKeys(Keys.TAB)
                //Name kutusuna bir İsim girin
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(faker.name().fullName())
                //Adress kutusuna  Adres girin
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(faker.address().fullAddress())

                //Phone kutusuna  Tel No: girin
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(faker.phoneNumber().phoneNumber())
                //Mail kutusuna Email Adresi girin
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.DELETE)
                .sendKeys(faker.internet().emailAddress())
                .perform();
        //Group dropdown butondan "Hotel Type1" seçin
        Select select = new Select(hotelListPage.groupIdBox);
        select.selectByValue("2");
        //Save butonuna tıklayın
        hotelListPage.saveButton.click();
        // Ok butonuna tiklayiniz
        Thread.sleep(2000);
        Assert.assertTrue(hotelListPage.okButton.isDisplayed());
        hotelListPage.okButton.click();


    }
}
