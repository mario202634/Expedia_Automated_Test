package stepdefinition;
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
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NoDestination 
{
	String text1;
	String text2;
	float number1;
	float number2;
	
	public static WebDriver driver;
	String expectedText = "Please select a destination";

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","D:\\University\\BUE Year 3\\SQA\\chromedriver.exe");  
	          
	    // Instantiate a ChromeDriver class to establish a connection       
	        WebDriver driver=new ChromeDriver();
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("https://www.expedia.com/");
			driver.manage().window().maximize();
		}

	@When("^User goes to flights$")
	public void user_goes_to_flights() throws Throwable {
	    driver.findElement(By.linkText("Flights")).click();
		}
	
	@When("^User enters his origin and destinaton and depature and arrival$")
	public void user_enters_flight() throws Throwable {
	    driver.findElement(By.cssSelector("#location-field-leg1-origin-menu .uitk-fake-input")).click();
	    driver.findElement(By.id("location-field-leg1-origin")).click();
	    driver.findElement(By.id("location-field-leg1-origin")).sendKeys("cairo");
	    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button")).click();
	    driver.findElement(By.id("d1-btn")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) > .uitk-date-picker-day-number:nth-child(7) > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-grid:nth-child(2)")).click();
	    driver.findElement(By.id("d2-btn")).click();
	    driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(1) tr:nth-child(3) > .uitk-date-picker-day-number:nth-child(3) > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-grid-item > .uitk-button")).click();
		}


	@Then("^An error message saying please select destination should appear$")
	public void message_displayed_Logout_Successfully() throws Throwable {
		if(driver.findElement(By.id("undefined-error")).getText() == expectedText){
            System.out.println("Successfull!");
    }else{
            System.out.println("Unsuccessfull!");
    }

		
	}
}
