package tests.us_0005;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCPage;
import pages.HotelListPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;

public class TC_005 {
    @Test
    public void test() throws IOException {
        HMCPage hmcPage = new HMCPage();
        HotelListPage hotelListPage = new HotelListPage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //Actions actions = new Actions(Driver.getDriver());
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
        hotelListPage.detailsElement.click();

        //Delete butonuna tıklayın
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        // String ilkSayfa = Driver.getDriver().getWindowHandle();
        // Set<String> handleDegerleriSeti = Driver.getDriver().getWindowHandles();
        // String sayfa2 = "";
        // for (String each : handleDegerleriSeti
        // ) {
        //     if (!each.equals(ilkSayfa)) {
        //         sayfa2 = each;
        //     }
        // }
        // Driver.getDriver().switchTo().window(sayfa2);

        hotelListPage.deleteButtonWebElement.click();
        ReusableMethods.waitFor(3);


        //"Would you like to continue?" yazısının görünürlüğünü kontrol et
        Assert.assertTrue(hotelListPage.deleteAlertTextWebElement.isDisplayed());
        //Ok Butonuna tıkla
        hotelListPage.alertOKButtonWebElement.click();
        //Otel bilgisinin silindiğini kontrol edin


        ReusableMethods.switchToWindow("Admin - List Of Hotels");
        Driver.getDriver().navigate().refresh();




    }
}
