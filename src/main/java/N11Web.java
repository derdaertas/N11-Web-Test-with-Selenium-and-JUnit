import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class N11Web {
    private WebDriver driver;

    public By searchField = By.id("searchData");

    public By searchButonu = By.cssSelector("a[class='searchBtn']");

    public By bilgisayarTıklama = By.cssSelector("h3[class='adGroupProduct']");

    public By dahaSonraButon = By.cssSelector("button[class='dn-slide-deny-btn']");

    public By kampanyaKapatButon = By.id("shareWinTooltipClose");

    public By sepeteEkleButonu = By.cssSelector("button[class='btn btnGrey addBasketUnify']");

    public By bilgisayarBilgisi = By.cssSelector("ins[class='newPrice']");

    public By sepetKontrolText = By.cssSelector("span[class='basketTotalNum']");

    public By sepetİkonu = By.cssSelector("i[class='icon iconBasket']");

    public String sepetteBeklenenText = "Sepetim";

    public By sepetteGercekDeger = By.cssSelector("section[class='basket box box--medium']>h3[class='box__title']");

    public String sepetBeklenenDeger = "1";

    public N11Web(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnElement(By elementPath){
        WebElement element = driver.findElement(elementPath);
        element.click();
    }

    public void sendKeysToTheElement(By elementPath, String keyText){
        WebElement element = driver.findElement(elementPath);
        element.sendKeys(keyText);
    }

    public void waitSeconds(long seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public String getTextOfAnElement (By elementPath){
        WebElement element = driver.findElement(elementPath);
        return element.getText();
    }

    public void validateIsEquals(String expectedCondition, String actualCondition)
    {
        Assert.assertEquals(expectedCondition,actualCondition);
    }


}