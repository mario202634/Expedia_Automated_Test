package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class MissingLocationStepDefinition {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	public void setUp() {
	 driver = new ChromeDriver();
	 js = (JavascriptExecutor) driver;
	 vars = new HashMap<String, Object>();
	}

	public void tearDown() {
	 driver.quit();
	}
	
	
	@Given("^user is on home page")
	public void user_is_on_home_Page() throws Throwable{
		driver.get("https://www.expedia.com/");
		 driver.manage().window().setSize(new Dimension(750, 502));
		 js.executeScript("window.scrollTo(0,7.199999809265137)");
		 driver.findElement(By.id("d1-btn")).click();
		 driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(3) tr:nth-child(1) > .uitk-date-picker-day-number:nth-child(7) > .uitk-date-picker-day")).click();
		 driver.findElement(By.cssSelector(".uitk-button-floating-full-width")).click();
		 driver.findElement(By.id("d2-btn")).click();
		 js.executeScript("window.scrollTo(0,0)");
		 driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(3) tr:nth-child(3) > .uitk-date-picker-day-number:nth-child(3) > .uitk-date-picker-day")).click();
		 driver.findElement(By.cssSelector(".uitk-button-floating-full-width")).click();
		 driver.findElement(By.cssSelector(".uitk-layout-grid-item-has-column-start-by-medium > .uitk-button")).click();
		 
		 if (driver.findElement(By.id("undefined-error")).getText()== "Please select a destination") {
			 
		 }
	}
	
	@Then ("^error message appears")
    public void error_message() throws Throwable {
        System.out.println("Please choose location of stay");
    }

	

}
