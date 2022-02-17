package tests.us_00010;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02 {
    KullaniciHotelReservationPage hmcPage10=new KullaniciHotelReservationPage();
    @Test
    public void testCase02() throws InterruptedException {
        /*
"http://www.hotelmycamp.com/ url'e gidilir
"Rooms" buttonu tiklanır
"Advanced Search" textin altindaki boxlar birer tab inilerek doldurulmali
"Check in Date" boxuna tiklanmali ve otelde kalis sure araligini belirlemeli,
"Select Room Type" boxuna tiklanmali, type secilmeli
"Select Adult Count" boxuna tiklanmali, kisi sayi secilmeli
"0 Children" boxuna tiklanmali, cocuk sayisi secilmeli
"Location" boxuna tiklanmali ve bos birakmali
"Search" buttonuna tiklanmali
"Rooms" sayfasina gittigi test edilir   */
        Driver.getDriver().navigate().to(ConfigReader.getProperty("HMCUrl"));
        hmcPage10.logInButtonu.click();
        hmcPage10.usernameBox.sendKeys("Firuze"+ Keys.ENTER);
        hmcPage10.passwordBox.sendKeys("12345Aa."+ Keys.ENTER);
        hmcPage10.ikinciLoginButonu.click();
        hmcPage10.roomsButton.click();

        hmcPage10.checkInDateTextBox.click();
        hmcPage10.checkInDateTextBox.sendKeys("08/10/2021"+ Keys.ENTER);
        hmcPage10.checOutDateTextBox.click();
        hmcPage10.checOutDateTextBox.sendKeys("08/20/2021"+ Keys.ENTER);

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", hmcPage10.searchButton);

        Select objSelect = new Select(hmcPage10.selectRoomTextBox);
        objSelect.selectByIndex(6);

        Select objSelect1 = new Select(hmcPage10.selectAdultTextBox);
        objSelect1.selectByIndex(5);

        Select objSelect2 = new Select(hmcPage10.selectChildrenTextBox);
        objSelect2.selectByIndex(5);


        hmcPage10.searchButton.click();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Rooms"));


    }
}
