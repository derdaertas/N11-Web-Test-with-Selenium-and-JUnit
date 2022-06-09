import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//driver'ın ayağa kalkarken exception fırlatmasını önlemek için yazıldı
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver;
    //N11Web class'ın bir örneği (instance'ı yaratıldı)
    N11Web n11Web;

    //teste başlamadan önce yapılacaklar
    @BeforeAll
    public void setUp()
    {
        System.out.println("Driver ayağa kaldırılıyor...");
        System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver");
        driver = new FirefoxDriver();
        System.out.println("Driver ayağa kaldırıldı.");

        n11Web = new N11Web(driver);

        driver.get("https://www.n11.com/");
        System.out.println("N11 Web Sayfası açıldı.");
    }

    @AfterAll
    public void tearDown()
    {
        driver.quit();
        System.out.println("Driver kapatıldı.");
    }

}
