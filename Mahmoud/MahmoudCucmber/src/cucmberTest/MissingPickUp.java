package cucmberTest;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MissingPickUp {
	public static WebDriver driver;
	List<WebElement> elements;
	  public void main() {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.navigate().to("https://www.expedia.com/");
	      driver.manage().window().maximize();
		  
		  driver.findElement(By.cssSelector(".uitk-tab:nth-child(3) .uitk-tab-text")).click();
		    
		    
		    driver.findElement(By.id("d1-btn")).click();
		    
		    driver.findElement(By.cssSelector(".start > .uitk-date-picker-day")).click();
		    driver.findElement(By.cssSelector(".uitk-button-floating-full-width")).click();
		    driver.findElement(By.id("d2-btn")).click();
		 
		    driver.findElement(By.cssSelector(".end > .uitk-date-picker-day")).click();
		    driver.findElement(By.cssSelector(".uitk-button-floating-full-width")).click();
		    driver.findElement(By.cssSelector(".uitk-layout-grid-item:nth-child(2) .uitk-field-select")).click();
		    driver.findElement(By.cssSelector(".uitk-layout-grid-item:nth-child(3) .uitk-field-select")).click();
		    {
		      WebElement dropdown = driver.findElement(By.cssSelector(".uitk-layout-grid-item:nth-child(3) .uitk-field-select"));
		      dropdown.findElement(By.xpath("//option[. = '11:30 pm']")).click();
		    }
		    driver.findElement(By.cssSelector(".uitk-layout-grid-item-has-column-start-by-medium > .uitk-button")).click();
		   
		    elements=driver.findElements(By.xpath("//*[@id=\"undefined-error\"]"));
		    
		    if(elements.size()>0) {
				  
				  System.out.print("Successful");
			  }else {
				  
				  System.out.print("Failed");
				  
			  
				  
			  }
		    
    
    driver.close();
    driver.quit();
	  }
}

