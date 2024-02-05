package tests.day14_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utulities.TestBase;

import javax.swing.text.html.HTMLEditorKit;

public class C01_testNGIlkTesti extends TestBase {

    @Test
    public void aramaTesti(){

       //Testotomasyonu anasayfasina gidin
       driver.get ("https://www.testotomasyonu.com/");
       // phone icinarama yap

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

       // arama sonucu urun bulunabildigini test etin

        WebElement aramaSonucElementi = driver.findElement(By.xpath("//*[@*='produckt-count-text']"));

        String unExpectedSonucYazisi = "0 product found";

        String actualSonucYazisi = aramaSonucElementi.getText();
        Assert.assertNotEquals(actualSonucYazisi,unExpectedSonucYazisi);
    }
}
