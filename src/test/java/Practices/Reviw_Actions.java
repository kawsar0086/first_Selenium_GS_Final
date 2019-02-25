package Practices;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Reviw_Actions {

    WebDriver driver;

    Actions act = new Actions(driver);
    public void example() throws InterruptedException {
        WebElement xx = null;
        act.moveToElement(xx);
        act.moveToElement(xx).perform();
        //in webelemnt we can do actions only one by one

        act.moveToElement(xx).click().sendKeys("xxxx").sendKeys(Keys.ENTER).perform();
        act.pause(300).perform();
        //.pause method: sleeps the webdriver
        Thread.sleep(300);
        // it makes the java to sleep




    }

}

