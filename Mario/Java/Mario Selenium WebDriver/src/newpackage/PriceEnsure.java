package newpackage;
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

public class PriceEnsure {
	
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
		    driver.findElement(By.id("location-field-leg1-origin")).click();
		    driver.findElement(By.id("location-field-leg1-origin")).sendKeys("cairo");
		    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button")).click();
		    driver.findElement(By.cssSelector("#location-field-leg1-destination-menu .uitk-fake-input")).click();
		    driver.findElement(By.id("location-field-leg1-destination")).click();
		    driver.findElement(By.id("location-field-leg1-destination")).sendKeys("new york");
		    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(2) .uitk-button")).click();
		    driver.findElement(By.id("d1-btn")).click();
		    driver.findElement(By.cssSelector("tr:nth-child(1) > .uitk-date-picker-day-number:nth-child(7) > .uitk-date-picker-day")).click();
		    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
		    driver.findElement(By.id("d2-btn")).click();
		    driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(1) tr:nth-child(3) > .uitk-date-picker-day-number:nth-child(3) > .uitk-date-picker-day")).click();
		    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
		    driver.findElement(By.cssSelector(".uitk-layout-grid-item > .uitk-button")).click();
		    driver.findElement(By.cssSelector("#AQruAgrYAnY1LXNvcy0zOTNiMGQ4NTk2M2U0YzEwNTczNjFjNDNmYTQ1MTk2ZS0wLTAtMX4yLlN-QVFvQ0NBRVNCd2pVQkJBQkdBRW9BbGdDY0FBfkFRcFNDaWNJMHBRQkVnTTFNRElZZ2tBZ2dHTW9fUE9yQWpEUjlLc0NPRlpBQUZnQmFnWkZRMUJNVlZNS0p3alNsQUVTQXpJMk1SaUFZeUNwVVNpcjlhc0NNUEg2cXdJNFZrQUJXQUZxQmtWRFVFeFZVd3BVQ2lnSTBwUUJFZ015TmpJWXFWRWdnR01veE8yc0FqREU4cXdDT0U5QUFGZ0JhZ2RGUTFOQlZrVlNDaWdJMHBRQkVnTTFNRGNZZ0dNZ2drQW96ZmFzQWpDbjk2d0NPRTlBQVZnQmFnZEZRMU5CVmtWU0Vnb0lBUkFCR0FFcUFsSktHQUVpQkFnQkVBRW9BaWdES0FRd0FRERSuR-F6fIdAIgEBKgUSAwoBMRI_ChYKCjIwMjMtMDUtMDYSA0NBSRoDSkZLChYKCjIwMjMtMDUtMTYSA0pGSxoDQ0FJEgcSBUNPQUNIGgIQASAC .uitk-card-link")).click();

		    String text1 = driver.findElement(By.cssSelector(".uitk-layout-flex:nth-child(1) > .uitk-card .uitk-price-subtext")).getText();

		driver.findElement(By.cssSelector(".uitk-layout-flex:nth-child(1) > .uitk-card .uitk-button")).click();
		    driver.findElement(By.cssSelector("#AQrvAgrYAnY1LXNvcy0wMGE5ZDc5MWJiYmY3OTA2NjJmNDk1YTMyNWQzNTc3MS0wLTAtMX4yLlN-QVFvQ0NBRVNCd2pVQkJBQkdBRW9BbGdDY0FBfkFRcFNDaWNJMHBRQkVnTTFNRElZZ2tBZ2dHTW9fUE9yQWpEUjlLc0NPRlpBQUZnQmFnWkZRMUJNVlZNS0p3alNsQUVTQXpJMk1SaUFZeUNwVVNpcjlhc0NNUEg2cXdJNFZrQUJXQUZxQmtWRFVFeFZVd3BVQ2lnSTBwUUJFZ015TmpJWXFWRWdnR01veE8yc0FqREU4cXdDT0U5QUFGZ0JhZ2RGUTFOQlZrVlNDaWdJMHBRQkVnTTFNRGNZZ0dNZ2drQW96ZmFzQWpDbjk2d0NPRTlBQVZnQmFnZEZRMU5CVmtWU0Vnb0lBUkFCR0FFcUFsSktHQUVpQkFnQkVBRW9BaWdES0FRd0FRERSuR-F6fIdAIgIBAioFEgMKATESPwoWCgoyMDIzLTA1LTA2EgNDQUkaA0pGSwoWCgoyMDIzLTA1LTE2EgNKRksaA0NBSRIHEgVDT0FDSBoCEAEgAiAB .uitk-card-link")).click();
		    
		      List<WebElement> elements = driver.findElements(By.cssSelector("#AQruAgrYAnY1LXNvcy0zOTNiMGQ4NTk2M2U0YzEwNTczNjFjNDNmYTQ1MTk2ZS0wLTAtMX4yLlN-QVFvQ0NBRVNCd2pVQkJBQkdBRW9BbGdDY0FBfkFRcFNDaWNJMHBRQkVnTTFNRElZZ2tBZ2dHTW9fUE9yQWpEUjlLc0NPRlpBQUZnQmFnWkZRMUJNVlZNS0p3alNsQUVTQXpJMk1SaUFZeUNwVVNpcjlhc0NNUEg2cXdJNFZrQUJXQUZxQmtWRFVFeFZVd3BVQ2lnSTBwUUJFZ015TmpJWXFWRWdnR01veE8yc0FqREU4cXdDT0U5QUFGZ0JhZ2RGUTFOQlZrVlNDaWdJMHBRQkVnTTFNRGNZZ0dNZ2drQW96ZmFzQWpDbjk2d0NPRTlBQVZnQmFnZEZRMU5CVmtWU0Vnb0lBUkFCR0FFcUFsSktHQUVpQkFnQkVBRW9BaWdES0FRd0FRERSuR-F6fIdAIgEBKgUSAwoBMRI_ChYKCjIwMjMtMDUtMDYSA0NBSRoDSkZLChYKCjIwMjMtMDUtMTYSA0pGSxoDQ0FJEgcSBUNPQUNIGgIQASAC .uitk-card-link"));
		      
		if(elements.size() > 0)
		{
		                        System.out.println("Successfull!");
		                	}else{
		                        System.out.println("Unsuccessfull!");
		                }


		driver.findElement(By.cssSelector(".uitk-layout-flex:nth-child(1) > .uitk-card .uitk-button")).click();
		    driver.findElement(By.linkText("No thanks")).click();
		    driver.findElement(By.cssSelector(".uitk-button > span")).click();
		    driver.findElement(By.id("complete-booking")).click();

		    String text2 = driver.findElement(By.id("totalPriceForTrip")).getText();

			float number1 = Float.parseFloat(text1.substring(1, text1.indexOf(" ")));
		    
			float number2 = Float.parseFloat(text2.substring(2, text1.indexOf(" ")));
		    
		if(number1 == number2){
		                        System.out.println("Successfull!");
		                }else{
		                        System.out.println("Unsuccessfull!");
		                }




					
					driver.close();
					driver.quit();
	
	}

}
