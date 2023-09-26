package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MissingPickUpStepDef {
	public static WebDriver driver;
	List<WebElement> elements;
	@Given("^User is on Home Page$")
	public void Navigate() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.navigate().to("https://www.expedia.com/");
	      driver.manage().window().maximize();
		}

	@When("^User Navigate to Cars$")
	public void navigate_to_car() throws Throwable {
		driver.findElement(By.cssSelector(".uitk-tab:nth-child(3) .uitk-tab-text")).click();
		}

	

	@When("^User enters pickup date dropoff date pickup time and dropofftime$")
	public void user_search() throws Throwable {


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
		   
	  }
	

	@Then("^User successfully booked a car$")
	public void booked_car() throws Throwable {

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