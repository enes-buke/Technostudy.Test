package TestCases;

import Utilities.BaseDriver;
import Utilities.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01 extends BaseDriver {

    @Test
    public void Us_Tec01(){
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

        coursesBar=driver.findElement(By.xpath("//a[@class='t-menu__link-item t966__tm-link']"));
        act1= actionDriv.moveToElement(coursesBar).build();
        act1.perform();
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
}

