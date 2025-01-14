package TestCases;

import Utilities.BaseDriver;
import Utilities.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AllTestCase extends BaseDriver {
    SoftAssert softAssert = new SoftAssert();
    @Test
    public void Test1() {
            Actions actionDriv=new Actions(driver);

            driver.get("https://techno.study/tr");
            WebElement coursesBar=driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
            Action act1= actionDriv.moveToElement(coursesBar).build();
            act1.perform();
            Func.Wait(1);

            WebElement sdet= driver.findElement(By.xpath("//div[@field='li_title__1607692272826']"));
            sdet.click();
            Func.Wait(1);

            Assert.assertTrue(driver.getCurrentUrl().contains("sdet"));
            Func.Wait(1);

            coursesBar=driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
            act1= actionDriv.moveToElement(coursesBar).build();
            act1.perform();
            Func.Wait(1);

            WebElement androidApp= driver.findElement(By.xpath("//div[@field='li_title__1607692276801']"));
            androidApp.click();
            Func.Wait(1);

            Assert.assertTrue(driver.getCurrentUrl().contains("androidapp"));
            Func.Wait(1);

            coursesBar=driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
            act1= actionDriv.moveToElement(coursesBar).build();
            act1.perform();
            Func.Wait(1);

            WebElement dataScience= driver.findElement(By.xpath("//div[@field='li_title__1607692281884']"));
            dataScience.click();
            Func.Wait(1);

            Assert.assertTrue(driver.getCurrentUrl().contains("data"));
            Func.Wait(1);

            coursesBar=driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
            act1= actionDriv.moveToElement(coursesBar).build();
            act1.perform();
            Func.Wait(1);

            WebElement jobCenter= driver.findElement(By.xpath("//div[@field='li_title__1663426353172']"));
            jobCenter.click();
            Func.Wait(1);

            Assert.assertTrue(driver.getCurrentUrl().contains("jobcenter"));
            Func.Wait(1);

            driver.navigate().back();
            Func.Wait(1);

            WebElement mastersProgram= driver.findElement(By.xpath("//div[@field='li_title__1691254947140']"));
            mastersProgram.click();
            Func.Wait(1);

            Assert.assertTrue(driver.getCurrentUrl().contains("masters"));
            Func.Wait(1);

            WebElement backHomePage=driver.findElement(By.xpath("(//div[@class='t228__right_langs_lang'])[2]/a"));
            backHomePage.click();
            Func.Wait(1);

        }


    @Test
    public void Test2() {

            driver.get("https://techno.study/tr");
            Func.Wait(2);

            WebElement login = driver.findElement(By.xpath("//td[text()='Campus Login']"));
            Assert.assertTrue( login.isEnabled(), "Login buton görünmedi");

            Func.Wait(2);
            login.click();

            Func.Wait(2);

            WebElement campusLoginPage = driver.findElement(By.xpath("//div[@class='logo']"));
            Assert.assertTrue(campusLoginPage.isEnabled(),"Campus giriş sayfası görülemedi");

    }

    @Test
    public void Test3() {
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

    @Test
    public void Test4() {
        driver.get("https://techno.study/tr");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll...
        js.executeScript("window.scrollTo(0,7000);");
        Func.Wait(1);

        WebElement sDet = driver.findElement(By.linkText("SDET Yazılım Test Mühendisi"));
        sDet.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("sdet"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

        WebElement androidApp = driver.findElement(By.linkText("Android Uygulama Geliştirme"));
        androidApp.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("androidapp"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

        WebElement dataScience = driver.findElement(By.linkText("Veri bilimi"));
        dataScience.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("data"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

        WebElement masterProgram = driver.findElement(By.linkText("Master's Program"));
        masterProgram.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("masters"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

    }

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

    @Test

    public void Test6() {

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
        SoftAssert softAssert = new SoftAssert();
        By logoSelector = By.cssSelector("img[alt='TechnoStudy']");

        WebElement logo = driver.findElement(logoSelector);

        softAssert.assertTrue(logo.isDisplayed(), "TechnoStudy logosu görüntülenemiyor.");
        logo.click();


        softAssert.assertEquals(driver.getCurrentUrl(), "https://techno.study/tr", "Logo'ya tıklanınca ana sayfaya yönlendirilmedi.");

    }

    @Test
    @Parameters("msg")

    public void Test7(String text) {

        driver.get("https://techno.study/tr");

        WebElement courses = driver.findElement(By.cssSelector("[href='#submenu:programs']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(courses).build().perform();

        switch (text) {
            case "SDET Yazılım Test Mühendisi":
                WebElement sdt = driver.findElement(By.cssSelector("[class=\"t966__menu-item-text\"]"));
                sdt.click();

                break;
            case "Android uygulama geliştirme":
                WebElement andro = driver.findElement(By.xpath("//div[text()='Android uygulama geliştirme']"));
                andro.click();

                break;
            case "Veri bilimi":
                WebElement veri = driver.findElement(By.xpath("//div[text()='Veri bilimi']"));
                veri.click();

                break;
            case "Job Center  Arbeitsamt":
                WebElement job = driver.findElement(By.xpath("//div[text()='Job Center & Arbeitsamt']"));
                job.click();
                try {

                    WebElement iframe = driver.findElement(By.xpath("//img[@alt=\"TechnoStudy\"]"));
                    new Actions(driver).
                            scrollToElement(iframe).
                            build().
                            perform();
                } catch (Exception ignored) {

                }

                break;
            case "Master's Program":
                WebElement master = driver.findElement(By.xpath("//div[text()=\"Master's Program\"]"));
                master.click();
                break;
        }
        try {

            WebElement logo = driver.findElement(By.xpath("//img[@alt=\"TechnoStudy\"]"));
            wait.until(driver -> logo.isDisplayed()).wait();
            Assert.assertTrue(logo.isDisplayed(), "Logo Yok");
        } catch (Exception ignored) {

        }

        WebElement btn = driver.findElement(By.xpath("//a[@class='tn-atom']"));
        btn.click();
    }

    @Test
    public void Test8() {
        driver.get("https://techno.study/tr");
        try{
            WebElement TermsOfUse = driver.findElement(By.xpath("//Span[text()='Şartları']"));
            TermsOfUse.click();

            WebElement page = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Kullanım Şartları']")));
            Assert.assertTrue(page.isEnabled(), "Sayfa bulunamadı");
        }catch (Exception e){
            System.out.println("Elementi bulamadı");
        }
    }
}
