package newpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BookCarTestNG {
	
	public static WebDriver driver;
  @Test
  public void main() {
	    driver.findElement(By.cssSelector(".uitk-tab:nth-child(3) .uitk-tab-text")).click();
	    driver.findElement(By.cssSelector("#location-field-locn-menu .uitk-fake-input")).click();
	    driver.findElement(By.id("location-field-locn")).sendKeys("denver");
	    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button")).click();
	    driver.findElement(By.id("d1-btn")).click();
	    driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(1) tr:nth-child(2) > .uitk-date-picker-day-number:nth-child(4) > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
	    driver.findElement(By.id("d2-btn")).click();
	    driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(1) tr:nth-child(2) > .uitk-date-picker-day-number:nth-child(6) > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-grid-item:nth-child(2) .uitk-field-select")).click();
	    {
	      WebElement dropdown = driver.findElement(By.cssSelector(".uitk-layout-grid-item:nth-child(2) .uitk-field-select"));
	      dropdown.findElement(By.xpath("//option[. = '11:00 am']")).click();
	    }
	    driver.findElement(By.cssSelector(".uitk-layout-grid-item:nth-child(3) .uitk-field-select")).click();
	    {
	      WebElement dropdown = driver.findElement(By.cssSelector(".uitk-layout-grid-item:nth-child(3) .uitk-field-select"));
	      dropdown.findElement(By.xpath("//option[. = '11:30 am']")).click();
	    }
	    driver.findElement(By.cssSelector(".uitk-button-fullWidth")).click();
	  
	    driver.findElement(By.xpath("//div[@id=\'offer-cards-list\']/ol/li/div/div/div[2]/div/div[2]/a/button")).click();
	    
	    driver.switchTo().window(("win9959").toString());
	    driver.findElement(By.name("reserve-btn")).click();
	    driver.findElement(By.name("tripPreferencesRequests[0].carTripPreferencesRequest.phoneCountryCode")).click();
	    {
	      WebElement dropdown = driver.findElement(By.name("tripPreferencesRequests[0].carTripPreferencesRequest.phoneCountryCode"));
	      dropdown.findElement(By.xpath("//option[. = 'Egypt +20']")).click();
	    }
	    driver.findElement(By.name("tripPreferencesRequests[0].carTripPreferencesRequest.phoneNumber")).click();
	    driver.findElement(By.name("tripPreferencesRequests[0].carTripPreferencesRequest.phoneNumber")).sendKeys("01098113411");
	    driver.findElement(By.id("no_insurance")).click();
	    driver.findElement(By.id("complete-booking")).click();
	    
	    driver.switchTo().frame(0);
	    driver.findElement(By.cssSelector(".icon")).click();
	    
	  
	     }
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.navigate().to("https://www.expedia.com/");
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  String text="Thank you! Your trip is booked."; 
	  if(driver.findElement(By.xpath("//*[@id=\"page-header\"]/h1")).getText()==text){
	    	System.out.print("Successful");
	    }
	    	else {
	    		
	    		System.out.print("Failed");
	    	
	    }
	  driver.close();
	    driver.quit();
  }

}
