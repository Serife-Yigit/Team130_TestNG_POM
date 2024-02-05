package tests.day15_TestNG_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utulities.Driver;

import java.util.List;

public class C04_DependsOnMethods {

    List<WebElement> bulunanUrunElementleriList;

    @Test(dependsOnMethods = "a")
    public void a() {

        Driver.getDriver().get("https://www.youtube.com");

        String expectedUrl = "https://www.testotomasyonu.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test(dependsOnMethods = "b")
    public void b() {

        //	2. Test : search Box’i kullanarak “phone” icin arama yapin \
        //            ve arama sonucunda urun bulunabildigini test edin
        WebElement aramakutusu = Driver.getDriver().findElement(By.id("global-search"));

        aramakutusu.sendKeys("phone" + Keys.ENTER);

        bulunanUrunElementleriList = Driver.getDriver().findElements(By.xpath("//*[@*='product-box my-2  py-1']"));

        Assert.assertTrue(bulunanUrunElementleriList.size() > 0);

    }

    @Test(dependsOnMethods = "c")
    public void c() {
        //  3.Test : ilk urunu tiklayin
        //  ve urun isminin case sensitive olmaksizin phone icerdigini test edin
    }
}
