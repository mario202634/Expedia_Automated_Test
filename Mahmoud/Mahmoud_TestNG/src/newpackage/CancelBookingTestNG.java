package newpackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CancelBookingTestNG{
	
	public static WebDriver driver;
  @Test
  public void main() {
	    driver.findElement(By.cssSelector(".uitk-button:nth-child(4) > .uitk-text")).click();
	    driver.findElement(By.cssSelector(".uitk-button:nth-child(4) > .uitk-text")).click();
	    driver.findElement(By.xpath("//div[@id=\'app-layer-base\']/div[2]/div/div/div/div/section/div/a")).click();
	    driver.findElement(By.cssSelector(".uitk-spacing:nth-child(5) .uitk-button > .uitk-icon")).click();
	    driver.findElement(By.cssSelector(".uitk-menu-open .uitk-list-item:nth-child(2) > .uitk-text")).click();
	    driver.findElement(By.cssSelector(".uitk-spacing:nth-child(4) > .uitk-spacing > .uitk-button")).click();
	    driver.findElement(By.cssSelector(".uitk-button-primary")).click();
	    
	 
	    }
	  
	     
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.navigate().to("https://www.expedia.com/");
      driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	   String text="Your booking was canceled.";
	    if(driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[2]/div[1]/div/div/div/section[1]/div[1]/div/div")).getText()==text) {
	    	
	    	
	      	System.out.print("Successful");
	    }
	    	else {
	    		
	    		System.out.print("Failed");
	    	
	    }
	  driver.close();
	    driver.quit();
  }

}
