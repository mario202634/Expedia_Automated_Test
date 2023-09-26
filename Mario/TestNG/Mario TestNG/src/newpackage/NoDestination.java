package newpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
public class NoDestination {
    public static WebDriver driver;
    String expectedText = "Please select a destination";

	@Test
	  public void main() 
	  {
		
		driver.findElement(By.cssSelector(".uitk-tab:nth-child(2) .uitk-tab-text")).click();
	    driver.findElement(By.cssSelector("#location-field-leg1-origin-menu .uitk-fake-input")).click();
	    driver.findElement(By.id("location-field-leg1-origin")).sendKeys("cai");
	    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button")).click();
	    driver.findElement(By.id("d1-btn")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) > .uitk-date-picker-day-number:nth-child(7) > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
	    driver.findElement(By.id("d2-btn")).click();
	    driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(1) tr:nth-child(3) > .uitk-date-picker-day-number:nth-child(3) > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-grid-item > .uitk-button")).click();

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
		  if(driver.findElement(By.id("undefined-error")).getText() == expectedText){
              System.out.println("Successfull!");
      }else{
              System.out.println("Unsuccessfull!");
      }

		  
	driver.close();
	driver.quit();
	  }

}
