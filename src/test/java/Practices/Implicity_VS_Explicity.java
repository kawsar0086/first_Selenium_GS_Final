package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Implicity_VS_Explicity {

    //implicity wait: timeouts for HTML codes to be uploaded
    //properly so that the WebElement can be found only
    //applies to : FindElement(s).
    //Because FindElement is the only way to make the
    //WebElement out from the browser, in order to create the element You Must need HTML.
    public void method1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.facebook.com");

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.titleContains("Facebook"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='u_0_n'"))));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("xxx"))));




    }
}
