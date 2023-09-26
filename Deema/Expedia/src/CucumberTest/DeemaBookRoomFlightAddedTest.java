package CucumberTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DeemaBookRoomFlightAddedTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;

public void deemaBookRoomFlightAdded() {
	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.navigate().to("");
 driver.manage().window().setSize(new Dimension(750, 502));
 driver.findElement(By.cssSelector(".uitk-fake-input")).click();
 {
   WebElement element = driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(2) .uitk-button"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 driver.findElement(By.id("location-field-destination")).sendKeys("cairo");
 driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(2) .uitk-button")).click();
 driver.findElement(By.id("d1-btn")).click();
 js.executeScript("window.scrollTo(0,0)");
 driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(3) tr:nth-child(1) > .uitk-date-picker-day-number:nth-child(7) > .uitk-date-picker-day")).click();
 driver.findElement(By.cssSelector(".uitk-no-outline")).click();
 driver.findElement(By.cssSelector(".uitk-button-floating-full-width")).click();
 driver.findElement(By.id("d2-btn")).click();
 js.executeScript("window.scrollTo(0,0)");
 driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(3) tr:nth-child(3) > .uitk-date-picker-day-number:nth-child(3) > .uitk-date-picker-day")).click();
 driver.findElement(By.cssSelector(".uitk-button-floating-full-width")).click();
 driver.findElement(By.id("add-flight-switch")).click();
 driver.findElement(By.cssSelector(".uitk-layout-grid-item > .uitk-layout-grid-item .uitk-fake-input")).click();
 {
   WebElement element = driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 driver.findElement(By.id("location-field-origin")).sendKeys("cai");
 driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button")).click();
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 driver.findElement(By.cssSelector(".uitk-layout-grid-item-has-column-start-by-medium > .uitk-button")).click();
 {
   WebElement element = driver.findElement(By.id("hotels-check-in-btn"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 driver.findElement(By.id("directFlights")).click();
 driver.findElement(By.cssSelector(".uitk-text > .uitk-button")).click();
 js.executeScript("window.scrollTo(0,166.39999389648438)");
 js.executeScript("window.scrollTo(0,530.4000244140625)");
}
}
