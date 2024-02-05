package tests.day15_TestNG_POM;

import net.bytebuddy.build.Plugin;
import org.apache.hc.core5.reactor.Command;
import org.testng.annotations.Test;

public class C03_PriorityKurallari {

    // https://www.testotomasyonu.com/ adresine gidin.
    // Olusturacaginiz 3 farkli test method’unda asagida verilen görevleri yapin.
    //	1. Test : Testotomasyonu ana sayfaya gittiginizi test edin
    //	2. Test : search Box’i kullanarak “phone” icin arama yapin \
    //            ve arama sonucunda urun bulunabildigini test edin
    //  3.Test : ilk urunu tiklayin ve urun isminin case sensitive olmaksizin phone icerdigini test edin

    @Test(priority = 10)
    public void TestotomasyonTesti() {
        System.out.println("test otomasyonu testi calisti");
    }


    @Test(priority = -37)
    public void WiseQuarterTesti() {
        System.out.println("test otomasyonu testi calisti");
    }


    @Test
    public void YoutubeTesti() {
        System.out.println("test otomasyonu testi calisti");
    }

}