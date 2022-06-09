import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class N11WebTest extends BaseTest
{

    @Test
    public void N11WebEndtoEnd() throws InterruptedException {

            //1 sn bekletilir
            n11Web.waitSeconds(1);

            //arama alanına tıklanır
            n11Web.clickOnElement(n11Web.searchField);

            //5 sn bekletilir
            n11Web.waitSeconds(5);

            //daha sonra tıklanır
            n11Web.clickOnElement(n11Web.dahaSonraButon);

            //5 sn bekletilir
            n11Web.waitSeconds(5);

            //arama alanına computer yazılır
            n11Web.sendKeysToTheElement(n11Web.searchField, "bilgisayar");

            //5 sn bekletilir
            n11Web.waitSeconds(5);

            //ara butonu tıklanır
            n11Web.clickOnElement(n11Web.searchButonu);

            //5 sn bekletilir
            n11Web.waitSeconds(5);

            //bilgisayarBilgisi
            n11Web.clickOnElement(n11Web.bilgisayarBilgisi);

            //5 sn bekletilir
            n11Web.waitSeconds(5);

            //kampanyabutonukapat
            n11Web.clickOnElement(n11Web.kampanyaKapatButon);

            //5 sn bekletilir
            n11Web.waitSeconds(5);

            n11Web.clickOnElement(n11Web.sepeteEkleButonu);

            //5 sn bekletilir
            n11Web.waitSeconds(5);

            //sepette beklenen ve gerçek değeri karşılaştır
            n11Web.validateIsEquals(n11Web.sepetBeklenenDeger,n11Web.getTextOfAnElement(n11Web.sepetKontrolText));

            //sağ üstten sepete gidilir
            n11Web.clickOnElement(n11Web.sepetİkonu);

            //5 sn bekletilir
            n11Web.waitSeconds(5);

            //sepet dolu kontrolü yapılır
            n11Web.validateIsEquals(n11Web.sepetteBeklenenText, n11Web.getTextOfAnElement(n11Web.sepetteGercekDeger));

            //5 sn bekletilir
            n11Web.waitSeconds(2);

        }

    }

