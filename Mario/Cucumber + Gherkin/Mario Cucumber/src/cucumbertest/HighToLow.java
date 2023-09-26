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

public class HighToLow {
	
	public static void main(String[] args) throws InterruptedException {
		//Change path based on where you store chromedriver.exe
		
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","D:\\University\\BUE Year 3\\SQA\\chromedriver.exe");  
	          
	    // Instantiate a ChromeDriver class to establish a connection       
	        WebDriver driver=new ChromeDriver();
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("https://www.expedia.com/");
			driver.manage().window().maximize();
			


    driver.findElement(By.linkText("Flights")).click();
    driver.findElement(By.cssSelector("#location-field-leg1-origin-menu .uitk-fake-input")).click();
    driver.findElement(By.id("location-field-leg1-origin")).click();
    driver.findElement(By.id("location-field-leg1-origin")).sendKeys("cairo");
    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button")).click();
    driver.findElement(By.cssSelector("#location-field-leg1-destination-menu .uitk-fake-input")).click();
    driver.findElement(By.id("location-field-leg1-destination")).click();
    driver.findElement(By.id("location-field-leg1-destination")).sendKeys("new york");
    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button")).click();
    driver.findElement(By.id("d1-btn")).click();
    driver.findElement(By.cssSelector("tr:nth-child(1) > .uitk-date-picker-day-number:nth-child(7) > .uitk-date-picker-day")).click();
    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
    driver.findElement(By.cssSelector(".uitk-layout-grid:nth-child(2)")).click();
    driver.findElement(By.id("d2-btn")).click();
    driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(1) tr:nth-child(3) > .uitk-date-picker-day-number:nth-child(3) > .uitk-date-picker-day")).click();
    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
    driver.findElement(By.cssSelector(".uitk-layout-grid-item > .uitk-button")).click();
    driver.findElement(By.id("sort-filter-dropdown-SORT")).click();
    WebElement dropdown = driver.findElement(By.id("sort-filter-dropdown-SORT"));
  dropdown.findElement(By.xpath("//option[. = 'Price (Highest)']")).click();


String text1 = driver.findElement(By.xpath("//*[@id=\"AQrcAgrGAnY1LXNvcy0yZGYzZGEzNmQ1NzEyNzk5MTBjZGY5YzcyNmE1NzBhZi03LTctMX4yLlN-QVFvRkNBRVExUThTQ0FqVUJCQUJHTGNLS0FKWUFuQUF-QVFwS0NpTUl4YklCRWdNMk5UZ1lna0FnZ0QwbzhQS3JBakM5OUtzQ09FSkFBRmdCYWdKWlJnb2pDTVd5QVJJRE1UQXpHSUE5SUtsUktQUDdxd0l3eW9Lc0FqaENRQUZZQVdvQ1dVWUtTd29qQ01XeUFSSURNVEF5R0tsUklJQTlLSmJxckFJd21QQ3NBamhaUUFCWUFXb0NXVVlLSkFqRnNnRVNCRFE1TURBWWdEMGdna0FvenZLc0FqQ2c5S3dDT0ZsQUFWZ0JhZ0paUmhJS0NBRVFBUmdCS2dKRldSZ0JJZ1FJQVJBQktBSW9CQ2dHTUFFERSuR-F6IKZAIgEBKgUSAwoBMRI_ChYKCjIwMjMtMDUtMDYSA0NBSRoDSkZLChYKCjIwMjMtMDUtMTYSA0pGSxoDQ0FJEgcSBUNPQUNIGgIQASACGgwIARIIGgAiBAgBEAE=\"]/div/div/div[1]/div[1]/div[1]/div[2]/div/div[2]/section/span[1]")).getText();
String text2 = driver.findElement(By.xpath("//*[@id=\"AQrvAgrZAnY1LXNvcy03ZTliNWE5MTkxYTQ4MzVjMTg3OTYzMTFlZDRhZDBjNi0yOC0yNC0xfjIuU35BUW9GQ0FFUTFROFNDQWpVQkJBQkdMY0tLQUpZQW5BQX5BUXBVQ2lnSXdvSUJFZ00wTURFWWdrQWc2NGtCS1BEeXF3SXc3UFdyQWpoWlFBQllBV29HVUVWR1RFVllDaWdJd29JQkVnTXhOemNZNjRrQklLbFJLTnIycXdJd3NQcXJBamhYUUFGWUJHb0dVRVZHVEVWWUNrNEtKUWpDZ2dFU0F6RXhOaGlwVVNEcmlRRW82dXlzQWpDWThLd0NPRXhBQUZnQmFnTkNRVWNLSlFqQ2dnRVNBek00TkJqcmlRRWdna0Fva1BHc0FqQ0E4NndDT0V4QUFWZ0JhZ05DUVVjU0NnZ0JFQUVZQVNvQ1FrRVlBU0lFQ0FFUUFTZ0NLQU1vQkRBQhHNzMzMzF-jQCIBASoFEgMKATESPwoWCgoyMDIzLTA1LTA2EgNDQUkaA0pGSwoWCgoyMDIzLTA1LTE2EgNKRksaA0NBSRIHEgVDT0FDSBoCEAEgAhoMCAESCBoAIgQIARAB\"]/div/div/div[1]/div[1]/div[1]/div[2]/div/div[2]/section/span[1]")).getText();


float number1 = Integer.parseInt(text1.substring(3));

float number2 = Integer.parseInt(text2.substring(3));

if(number1 < number2){
                        System.out.println("Successfull!");
                }else{
                        System.out.println("Unsuccessfull!");
                }

			
			driver.close();
			driver.quit();
	}
}
