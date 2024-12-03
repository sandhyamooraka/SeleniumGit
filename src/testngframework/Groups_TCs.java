package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Groups_TCs {
  WebDriver driver;
	@Test(groups="social")
  public void google() {
		driver.get("https://www.google.com");
  }
	@Test(groups="social")
	  public void redmine() {
			driver.get("https://www.redmine.org");
	  }
	@Test(groups="food")
	  public void swiggy() {
			driver.get("https://www.swiggy.com");
	  }
	@Test(groups="food")
	  public void zomato() {
			driver.get("https://www.zomato.com");
	  }
	
  @BeforeTest(groups="food")
  public void beforeTest() {
	  driver = new ChromeDriver();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
