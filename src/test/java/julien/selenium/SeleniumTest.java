package julien.selenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import tools.ScreenshotTestRule;
import tools.Browser;

@Listeners({ScreenshotTestRule.class})
public class SeleniumTest extends Browser{

	@Test(invocationCount=1)
	public void timeoutTest() {

	    for (int i = 0; i < 2000; i++)
	    {
	      System.out.println(i);

	      //remoteWebDriver.get("http://www.google.com");

	      /*remoteWebDriver.getWindowHandle();
	      remoteWebDriver.getCurrentUrl();
	      remoteWebDriver.getTitle();
	      remoteWebDriver.manage().timeouts().getScriptTimeout();*/
	      
	      //.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	      driver.get("http://www.google.com");
		  driver.getWindowHandle();
	      driver.getCurrentUrl();
	      driver.getTitle();
		  driver.manage().timeouts().getScriptTimeout();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     // WebElement myDynamicElement = driver.findElement(By.id("L2AGLb"));
	      //myDynamicElement.click();
	    }
	}
}
