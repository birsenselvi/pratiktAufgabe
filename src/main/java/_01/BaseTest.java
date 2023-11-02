package _01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import java.time.Duration;

public class BaseTest extends Locators {

    WebDriver driver;
    WebDriverWait wait;
    String url = "https://demoblaze.com/";

    public BaseTest(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void goToHome(){

        driver.get(url);
    }
    public void click(By locator){

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        click(element);

    }
    public void click(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    public void isVisible(By locator){

        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed());
    }
    public void isInVisible(By locator){

        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.invisibilityOf(element));
        Assert.assertFalse(element.isDisplayed());
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
