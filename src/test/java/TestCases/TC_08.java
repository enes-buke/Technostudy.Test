package TestCases;


import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_08 extends BaseDriver {
    @Test(groups = {"First"})
    public void Test2(){
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
