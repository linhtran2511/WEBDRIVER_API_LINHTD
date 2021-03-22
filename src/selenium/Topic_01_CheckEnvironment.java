package selenium;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Topic_01_CheckEnvironment {
	WebDriver driver;
	
	  @BeforeTest
	  public void beforeTest() {
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("http://live.demoguru99.com/");
	  }

	  
  @Test
  public void TC_01_CheckUrl() {
	  String homePageUrl = driver.getCurrentUrl();
	  AssertJUnit.assertEquals(homePageUrl, "http://live.demoguru99.com/");
  }
  @Test
  public void TC_01_CheckTitle() {
	  String homePageTitle = driver.getTitle();
	  AssertJUnit.assertEquals(homePageTitle, "Home page");
  }


  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
