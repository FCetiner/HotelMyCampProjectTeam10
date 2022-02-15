package tests.us_00010;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.KullaniciHotelReservationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {
    KullaniciHotelReservationPage hmcPage10=new KullaniciHotelReservationPage();

    /* http://www.hotelmycamp.com/ url'e gidilir
 "Log in" buttonuna tiklanmali
  "Create a new account" butonuna tiklanilmali
 "Username" boxuna tiklanmali, bilgiler girilmeli
 "Password" boxuna tiklanmali, bilgiler girilmeli
 "Email" boxuna tiklanmali, bilgiler girilmeli
 "Full Name" boxuna tiklanmali, bilgiler girilmeli
 "Phone No" boxuna tiklanmali, bilgiler girilmeli
 "Social Security Number" boxuna tiklanmali, bilgiler girilmeli
 "Driving License" boxuan tiklanmali, bilgiler girilmeli
 "Country" boxuna tiklanmali, bilgiler girilmeli
 "State" boxuna tiklanmali, bilgiler girilmeli, yoksa bos birakilmali
 "Address" boxuna tiklanmali, bilgiler girilmeli
 "Working Sector" boxuna tiklanmali, bilgiler girilmeli
 "Birth Date" boxuna tiklanmali, bilgiler girilmeli
 "Save" buttonu tiklanmali ve calisip calismadigi test edilmeli
 "User Data was inserted successfully" texti test edilmeli, "OK" buttonuna tiklanmali */
    @Test
    public void testCase01() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        hmcPage10.logInButtonu.click();
        hmcPage10.createNewAccount.click();
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(hmcPage10.createUsername).sendKeys(faker.name().name())
                .sendKeys(Keys.TAB).sendKeys("12345Aa.")
                .sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB).sendKeys("No")
                .sendKeys(Keys.TAB).sendKeys(faker.country().name())
                .sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.job().position())
                .sendKeys(Keys.TAB).sendKeys("15.08.1994")
                .sendKeys(Keys.TAB)
                .perform();
        hmcPage10.createSaveButton.click();


        String actualSaveText=hmcPage10.createSaveTexti.getText();
        System.out.println("actualtext"+actualSaveText);
        String expSaveText="User Data was inserted successfully";
        // Assert.assertEquals(actualSaveText,expSaveText);
        hmcPage10.createOkButton.click();
        hmcPage10.createOkButton.click();

    }
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
acilan "Rooms" sayfa test edilmeli    */
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

        hmcPage10.selectRoomTextBox.click();
        hmcPage10.selectRoomTextBox.sendKeys("King"+ Keys.ENTER);
        Thread.sleep(3000);

        hmcPage10.selectAdultTextBox.click();
        hmcPage10.selectRoomTextBox.sendKeys("3 Adult"+ Keys.ENTER);
        Thread.sleep(3000);

        hmcPage10.selectChildrenTextBox.click();
        hmcPage10.selectRoomTextBox.sendKeys("1 Children"+ Keys.ENTER);

        hmcPage10.searchButton.click();



    }

}