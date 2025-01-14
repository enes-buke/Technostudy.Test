package TestCases;

import Utilities.BaseDriver;
import Utilities.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_02 extends BaseDriver {

    @Test
    public void Test2() {

        driver.get("https://techno.study/tr");
        Func.Wait(2);

        WebElement login = driver.findElement(By.xpath("//td[text()='Campus Login']"));
        Assert.assertTrue(login.isEnabled(), "Login buton görünmedi");

        Func.Wait(2);
        login.click();

        Func.Wait(2);

        WebElement campusLoginPage = driver.findElement(By.xpath("//div[@class='logo']"));
        Assert.assertTrue(campusLoginPage.isEnabled(), "Campus giriş sayfası görülemedi");
    }
}
