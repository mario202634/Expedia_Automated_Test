package cucumbertest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.*;
import org.openqa.selenium.devtools.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.openqa.selenium.WebElement;

public class NoDestination {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Change path based on where you store chromedriver.exe
		
				// System Property for Chrome Driver   
		        System.setProperty("webdriver.chrome.driver","D:\\University\\BUE Year 3\\SQA\\chromedriver.exe");  
			          
			    // Instantiate a ChromeDriver class to establish a connection       
			        WebDriver driver=new ChromeDriver();
					
					
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.navigate().to("https://www.expedia.com/");
					driver.manage().window().maximize();
					
					
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

		String expectedText = "Please select a destination";

		if(driver.findElement(By.id("undefined-error")).getText() == expectedText){
		                        System.out.println("Successfull!");
		                }else{
		                        System.out.println("Unsuccessfull!");
		                }


					
					driver.close();
					driver.quit();

			}
		
		
	}
