package TestCases;

import Utilities.BaseDriver;
import Utilities.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_06 extends BaseDriver {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void US_TC06() {
        driver.get("https://techno.study/tr");

        By[] clickableElements = {
                By.linkText("SDET Yazılım Test Mühendisi"),
                By.xpath("//div[text()='Android uygulama geliştirme']"),
                By.linkText("Veri bilimi"),
                By.xpath("//div[text()='Job Center & Arbeitsamt']"),
                By.linkText("Master's Program"),
                By.linkText("Kullanım Şartları"),
                By.linkText("Gizlilik Politikası"),
                By.linkText("Cookies Politikası"),

        };

        for (By elementLocator : clickableElements) {
            try {

                if( !elementLocator.equals(By.linkText("Kullanım Şartları")) &&
                        !elementLocator.equals(By.linkText("Gizlilik Politikası")) &&
                        !elementLocator.equals(By.linkText("Cookies Politikası"))) {

                    WebElement menuKurslar = driver.findElement(By.xpath("(//a[text()='Kurslar'])[1]"));
                    Actions action = new Actions(driver);
                    action.moveToElement(menuKurslar).perform();
                    Func.Wait(1);
                }

                if(elementLocator.equals(By.linkText("Kullanım Şartları")) ||
                        elementLocator.equals(By.linkText("Gizlilik Politikası")) ||
                        elementLocator.equals(By.linkText("Cookies Politikası")))
                {

                    WebElement elementToScroll = driver.findElement(elementLocator);
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScroll);
                    Func.Wait(2);
                }

                WebElement elementToClick = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
                elementToClick.click();
                Func.Wait(2);
                checkAndClickLogo();

                driver.navigate().to("https://techno.study/tr");
            } catch (NoSuchElementException e) {
                if (elementLocator.equals(By.xpath("//div[text()='Job Center & Arbeitsamt']"))) {
                    driver.navigate().to("https://techno.study/tr");
                } else {
                    break;
                }
            }
        }

        softAssert.assertAll();
    }


    private void checkAndClickLogo() {

        By logoSelector = By.cssSelector("img[alt='TechnoStudy']");

        WebElement logo = driver.findElement(logoSelector);

        softAssert.assertTrue(logo.isDisplayed(), "TechnoStudy logosu görüntülenemiyor."); //Bu satır, logo adlı öğenin görüntülenip görüntülenmediğini kontrol ediyor

        logo.click();

        //Bu satır, şu anki URL'nin "https://techno.study/tr" olup olmadığını kontrol ediyor.
        softAssert.assertEquals(driver.getCurrentUrl(), "https://techno.study/tr", "Logo'ya tıklanınca ana sayfaya yönlendirilmedi.");
    }
}

