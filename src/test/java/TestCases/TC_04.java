package TestCases;

import Utilities.BaseDriver;
import Utilities.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_04 extends BaseDriver {

    @Test(groups = {"First"})
    public void US_TC04(){

        driver.get("https://techno.study/tr");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        //Scroll...
        js.executeScript("window.scrollTo(0,7000);");
        Func.Wait(1);

        WebElement sDet=driver.findElement(By.linkText("SDET Yazılım Test Mühendisi"));
        sDet.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("sdet"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

        WebElement androidApp=driver.findElement(By.linkText("Android Uygulama Geliştirme"));
        androidApp.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("androidapp"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

        WebElement dataScience=driver.findElement(By.linkText("Veri bilimi"));
        dataScience.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("data"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

        WebElement masterProgram=driver.findElement(By.linkText("Master's Program"));
        masterProgram.click();
        Func.Wait(1);

        Assert.assertTrue(driver.getCurrentUrl().contains("masters"));
        Func.Wait(1);

        driver.navigate().back();
        Func.Wait(1);

    }
}
