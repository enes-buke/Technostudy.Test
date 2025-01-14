package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Utilities.BaseDriver.driver;

public class TC_05 {
    @Test
    public void Test5() {

        driver.get("https://techno.study/tr");

        String anaPencereHandle = driver.getWindowHandle();

        WebElement socialLinks = driver.findElement(By.xpath("//div[@class='t-sociallinks']"));
        Assert.assertTrue(socialLinks.isEnabled(), "Sosyal medya hesap logoları görülmedi");

        WebElement facebookLogo = driver.findElement(By.xpath("//*[@class='t-sociallinks__item t-sociallinks__item_facebook']"));
        Assert.assertTrue(facebookLogo.isEnabled(),"facebook simgesi görülmedi");

        WebElement instagramLogo = driver.findElement(By.xpath("//*[@class='t-sociallinks__item t-sociallinks__item_instagram']"));
        Assert.assertTrue(instagramLogo.isEnabled(),"instagram simgesi görülmedi");

        WebElement youtubeLogo = driver.findElement(By.xpath("//*[@class='t-sociallinks__item t-sociallinks__item_youtube']"));
        Assert.assertTrue(youtubeLogo.isEnabled(), "youtube simgesi görülmedi");

        WebElement linkedInLogo = driver.findElement(By.xpath("//*[@class='t-sociallinks__item t-sociallinks__item_linkedin']"));
        Assert.assertTrue(linkedInLogo.isEnabled(), "Linkedin simgesi görülmedi");

        facebookLogo.click();
        instagramLogo.click();
        youtubeLogo.click();
        linkedInLogo.click();


        for (String pencereHandle : driver.getWindowHandles()) {
            if (!pencereHandle.equals(anaPencereHandle)) {
                String pencereURL = driver.getCurrentUrl();

                Assert.assertFalse(pencereURL.isEmpty(), "Giriş sayfası görülmedi");
            }
        }
        driver.switchTo().window(anaPencereHandle);
    }
}
