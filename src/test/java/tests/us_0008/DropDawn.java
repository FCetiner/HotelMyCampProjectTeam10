package tests.us_0008;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class DropDawn {
    @Test
    public void DropDawn (){
        // https://the-internet.herokuapp.com/dropdown adresine gidin.
       // driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownElementi = Driver.getDriver().findElement(By.xpath("//select[@id='dropdown']"));
        //    1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        Select select = new Select(dropdownElementi);
        select.selectByIndex(1); // 0. index başlık
        System.out.println(select.getFirstSelectedOption().getText());

        //    2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());

        //    3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());
        //    4.Tüm dropdown değerleri(value) yazdırın
        List<WebElement> optionList = select.getOptions();
        for (WebElement each: optionList
        ) {
            System.out.println(each.getText());
        }
        //    5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe bulundugunu test ediniz
        int actualSize=optionList.size();
        int expectedsize=4;
        Assert.assertEquals(actualSize,expectedsize);
    }
}
