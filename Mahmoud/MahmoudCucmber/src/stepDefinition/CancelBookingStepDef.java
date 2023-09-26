package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CancelBookingStepDef {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.navigate().to("https://www.expedia.com/");
	      driver.manage().window().maximize();
		}

	@When("^User Navigate to Support$")
	public void Navigate() throws Throwable {
		driver.findElement(By.cssSelector(".uitk-button:nth-child(4) > .uitk-text")).click();
		}

	

	@When("^User selects the card of the booking$")
	public void user_search() throws Throwable {

		 driver.findElement(By.cssSelector(".uitk-button:nth-child(4) > .uitk-text")).click();
		 driver.findElement(By.xpath("//div[@id=\'app-layer-base\']/div[2]/div/div/div/div/section/div/a")).click();
		    driver.findElement(By.cssSelector(".uitk-spacing:nth-child(5) .uitk-button > .uitk-icon")).click();
		    
	}

	
	@When("^user click on the options$")
	public void options() throws Throwable {
	    driver.findElement(By.cssSelector(".uitk-menu-open .uitk-list-item:nth-child(2) > .uitk-text")).click();
	}
	
	@Then("^User successfully cancel the booking$")
	public void booked_car() throws Throwable {
		driver.findElement(By.cssSelector(".uitk-button-primary")).click();
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

