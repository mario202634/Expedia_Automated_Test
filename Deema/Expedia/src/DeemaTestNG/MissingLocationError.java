package DeemaTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MissingLocationError {
	static{System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe"); }
	WebDriver driver=new ChromeDriver();
	private Map<String, Object> vars;
	JavascriptExecutor js;
  @Test
  public void f() {
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
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.expedia.com/");
	  driver.manage().window().setSize(new Dimension(750, 502));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
      driver.quit();
  }

}
