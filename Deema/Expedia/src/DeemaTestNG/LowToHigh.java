package DeemaTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LowToHigh {
	static{System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe"); }
	WebDriver driver=new ChromeDriver();
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

  @Test
  public void main() {
	  {
		   WebElement element = driver.findElement(By.cssSelector(".uitk-tab:nth-child(6) .uitk-tab-text"));
		   Actions builder = new Actions(driver);
		   builder.moveToElement(element).perform();
		 }
		 {
		   WebElement element = driver.findElement(By.tagName("body"));
		   Actions builder = new Actions(driver);
		   builder.moveToElement(element, 0, 0).perform();
		 }
		 {
		   WebElement element = driver.findElement(By.cssSelector(".uitk-fake-input"));
		   Actions builder = new Actions(driver);
		   builder.moveToElement(element).perform();
		 }
		 driver.findElement(By.cssSelector(".uitk-fake-input")).click();
		 {
		   WebElement element = driver.findElement(By.tagName("body"));
		   Actions builder = new Actions(driver);
		   builder.moveToElement(element, 0, 0).perform();
		 }
		 driver.findElement(By.id("location-field-destination")).click();
		 driver.findElement(By.id("location-field-destination")).sendKeys("cairo");
		 driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(2) .uitk-button")).click();
		 driver.findElement(By.id("d1-btn")).click();
		 driver.findElement(By.cssSelector("tr:nth-child(1) > .uitk-date-picker-day-number:nth-child(7) > .uitk-date-picker-day")).click();
		 {
		   WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) > .uitk-date-picker-day-number:nth-child(7) > .uitk-date-picker-day"));
		   Actions builder = new Actions(driver);
		   builder.moveToElement(element).perform();
		 }
		 {
		   WebElement element = driver.findElement(By.tagName("body"));
		   Actions builder = new Actions(driver);
		   builder.moveToElement(element, 0, 0).perform();
		 }
		 driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
		 driver.findElement(By.id("d2-btn")).click();
		 {
		   WebElement element = driver.findElement(By.id("d2-btn"));
		   Actions builder = new Actions(driver);
		   builder.moveToElement(element).perform();
		 }
		 {
		   WebElement element = driver.findElement(By.tagName("body"));
		   Actions builder = new Actions(driver);
		   builder.moveToElement(element, 0, 0).perform();
		 }
		 driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(1) tr:nth-child(3) > .uitk-date-picker-day-number:nth-child(3) > .uitk-date-picker-day")).click();
		 driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
		 driver.findElement(By.cssSelector(".uitk-layout-grid-item > .uitk-button")).click();
		 driver.findElement(By.id("sort-filter-dropdown-sort")).click();
		 {
		   WebElement dropdown = driver.findElement(By.id("sort-filter-dropdown-sort"));
		   dropdown.findElement(By.xpath("//option[. = 'Price: low to high']")).click();
		 }
		 js.executeScript("window.scrollTo(0,166.17892456054688)");
		 String result1=driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[1]/main/div/div/div/div/div[2]/section[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/span/div")).getText();
		 String result2=driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[1]/main/div/div/div/div/div[2]/section[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/div/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/span/div")).getText();
		 
		 if ((Boolean) js.executeScript("return (arguments[0] < arguments[1])", vars.get("number1"),vars.get("number2"))) {
		 }
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.expedia.com/");
	  driver.manage().window().setSize(new Dimension(1552, 880));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
      driver.quit();
  }

}
