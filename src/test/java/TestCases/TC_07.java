package TestCases;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_07 extends BaseDriver {
    @Test(groups = {"Second"})
    @Parameters("msg")
    public void Test1(String text) {
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



}
