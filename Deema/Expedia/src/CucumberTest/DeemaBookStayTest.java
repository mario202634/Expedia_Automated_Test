package CucumberTest;

	import org.openqa.selenium.By;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.JavascriptExecutor;
	import java.util.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.concurrent.TimeUnit;
	
	public class DeemaBookStayTest {
	  private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  
	  public String waitForWindow(int timeout) {
	    try {
	      Thread.sleep(timeout);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    Set<String> whNow = driver.getWindowHandles();
	    Set<String> whThen = (Set<String>) vars.get("window_handles");
	    if (whNow.size() > whThen.size()) {
	      whNow.removeAll(whThen);
	    }
	    return whNow.iterator().next();
	  }
	  
	  public void deemaBookStay() {
	    driver.get("https://www.expedia.com/");
	    driver.manage().window().setSize(new Dimension(1552, 832));
	    driver.findElement(By.cssSelector(".uitk-fake-input")).click();
	    driver.findElement(By.id("location-field-destination")).sendKeys("cairo");
	    driver.findElement(By.cssSelector(".uitk-action-list-item:nth-child(1) .uitk-button")).click();
	    driver.findElement(By.id("d1-btn")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(1) > .uitk-date-picker-day-number:nth-child(7) > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-flex-item-flex-shrink-0 > .uitk-button")).click();
	    driver.findElement(By.id("d2-btn")).click();
	    driver.findElement(By.cssSelector(".uitk-date-picker-month:nth-child(1) tr:nth-child(3) > .uitk-date-picker-day-number:nth-child(3) > .uitk-date-picker-day")).click();
	    driver.findElement(By.cssSelector(".uitk-no-outline")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-grid-item > .uitk-button")).click();
	    {
	      List<WebElement> elements = driver.findElements(By.linkText("Opens InterContinental Cairo Citystars, an IHG Hotel in new tab, return to original tab to proceed"));
	      assert(elements.size() > 0);
	    }
	    vars.put("window_handles", driver.getWindowHandles());
	    driver.findElement(By.linkText("Opens InterContinental Cairo Citystars, an IHG Hotel in new tab, return to original tab to proceed")).click();
	    vars.put("win8202", waitForWindow(2000));
	    driver.switchTo().window(vars.get("win8202").toString());
	    js.executeScript("window.scrollTo(0,654.4000244140625)");
	    js.executeScript("window.scrollTo(0,712)");
	    js.executeScript("window.scrollTo(0,907.2000122070312)");
	    js.executeScript("window.scrollTo(0,602.4000244140625)");
	    js.executeScript("window.scrollTo(0,320)");
	    driver.findElement(By.cssSelector(".uitk-spacing-padding-inlineend-three > .uitk-button")).click();
	    driver.findElement(By.cssSelector(".uitk-layout-grid-item:nth-child(2) .uitk-card-content-section:nth-child(2) span:nth-child(1)")).click();
	  }
	}

	
	
