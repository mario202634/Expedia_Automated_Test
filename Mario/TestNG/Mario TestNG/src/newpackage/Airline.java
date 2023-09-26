package newpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Airline {
    public static WebDriver driver;
    String text1;
    String text2;
    
	@Test
	  public void main() 
	  {
		driver.findElement(By.linkText("Flights")).click();
	    driver.findElement(By.cssSelector("#location-field-leg1-origin-menu .uitk-fake-input")).click();
	    driver.findElement(By.id("location-field-leg1-origin")).sendKeys("cairo");
	    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk button")).click();
	    driver.findElement(By.cssSelector("#location-field-leg1-destination-menu .uitk-fake-input")).click();
	    driver.findElement(By.id("location-field-leg1-destination")).sendKeys("new");
	    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button")).click();
	    driver.findElement(By.id("d1-btn")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) > .uitk-date-picker-day-number:nth-child(7) > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
	    driver.findElement(By.id("d2-btn")).click();
	    driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(1) tr:nth-child(3) > .uitk-date-picker-day-number:nth-child(3) > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-grid-item > .uitk-button")).click();
	    driver.findElement(By.cssSelector(".uitk-menu:nth-child(4) .uitk-layout-flex")).click();
	    driver.findElement(By.cssSelector(".uitk-menu:nth-child(4) .uitk-layout-flex")).click();
	    driver.findElement(By.linkText("Egyptair")).click();
	    driver.findElement(By.name("searchButton")).click();

	    text1 = driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[2]/div[1]/div/section/div/div[1]/div[4]/div[1]/button/div/div/span")).getText();

	    text2 = driver.findElement(By.xpath("//*[@id=\"AQr4AQriAXY1LXNvcy00OTllMWQ2MjFmMDEzNzIyMmE3ZDQ1YmIwZTI3ZTVmMC0wLTAtMX4yLlN-QVFvRkNBRVExUThTQ0FqVUJCQUJHTGNLS0FKWUFuQUF-QVFvbENpTUl6YVlCRWdNNU9EVVlna0FncVZFb3h2R3JBakNNOTZzQ09FaEFBRmdCYWdKSFJBb2xDaU1JemFZQkVnTTVPRFlZcVZFZ2drQW9nT21zQWpDQTdxd0NPRTFBQUZnQmFnSkhSQklLQ0FFUUFSZ0JLZ0pOVXhnQklnUUlBUkFCS0FJb0JDZ0dNQUURcT0K16MnlkAiAQEqBRIDCgExEkMKFgoKMjAyMy0wNS0wNhIDQ0FJGgNKRksKFgoKMjAyMy0wNS0xNhIDSkZLGgNDQUkSCwoCTVMSBUNPQUNIGgIQASAC\"]/div/div/div[1]/div[1]/div[1]/div[1]/div/div[3]/div[2]")).getText();
	  
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("https://www.expedia.com/");
			driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		    if(text1==text2){
                System.out.println("Successfull!");
        }else{
                System.out.println("Unsuccessfull!");
        }
		  
	driver.close();
	driver.quit();
	  }

}
