package TestCases;

import Utilities.BaseDriver;
import Utilities.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_03 extends BaseDriver {
    @Test(groups = {"First"})
    public void US_TC03() {

        driver.get("https://techno.study/tr/");

        WebElement basvur = driver.findElement(By.linkText("BAŞVUR"));
        basvur.click();
        Func.Wait(2);

        WebElement ad = driver.findElement(By.xpath("//input[@name='name']"));
        ad.sendKeys("Test Can Can");
        Func.Wait(2);

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("Testcovaja5931@gameszox.com");
        Func.Wait(2);

        WebElement telefon = driver.findElement(By.xpath("//input[@name='tildaspec-phone-part[]']"));
        telefon.sendKeys("1111111111111");
        Func.Wait(2);

        WebElement ülkeAndorra = driver.findElement(By.cssSelector("[id='sb-1667664755026'] [value='Andorra']"));
        ülkeAndorra.click();
        Func.Wait(2);

        WebElement KursSecim = driver.findElement(By.cssSelector("[id='sb-1663337581601'] [value='SDET Türkçe']"));
        KursSecim.click();
        Func.Wait(2);

        WebElement NerdenDuydum = driver.findElement(By.cssSelector("[id='sb-1670423010572'] [value='Youtube']"));
        NerdenDuydum.click();
        Func.Wait(2);

        WebElement PromasyonKodu = driver.findElement(By.xpath("//input[@name='promo code']"));
        PromasyonKodu.sendKeys("Hikmet Anıl Öztekin");
        Func.Wait(2);

        WebElement Şartlar = driver.findElement(By.xpath("//div[@class='t-checkbox__indicator']"));
        Şartlar.click();
        Func.Wait(2);

        WebElement Gonder = driver.findElement(By.xpath("//button[@class='t-submit']"));
        Gonder.click();
        Func.Wait(2);


    }
}
