package cucmberTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PickUpSameAsDropoff {
	public static WebDriver driver;

	  public void main() {
		  

	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.navigate().to("https://www.expedia.com/");
     driver.manage().window().maximize();
     driver.findElement(By.cssSelector(".uitk-tab:nth-child(3) .uitk-tab-text")).click();   
	 
	   
     driver.findElement(By.id("location-field-locn")).sendKeys("denver");
	    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button")).click();
	  
	    driver.findElement(By.id("d2-btn")).click();
	
	   
	    driver.findElement(By.cssSelector(".start > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-button-floating-full-width")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-grid-item:nth-child(2) .uitk-field-select")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-grid-item:nth-child(3) .uitk-field-select")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-grid-item-has-column-start-by-medium > .uitk-button")).click();
	   
	  String text="Adjust your date and time to ensure there is at least 2 hour difference between pick-up and drop-off.";
	  if(driver.findElement(By.xpath("//*[@id=\"srp-search-wizard\"]/div/div/div/div/p")).getText()==text) {
		  
		System.out.print("Successful");
		}
	  else {
		  System.out.print("Failed");
	  }
	  
    
    driver.close();
    driver.quit();
	  }
}

