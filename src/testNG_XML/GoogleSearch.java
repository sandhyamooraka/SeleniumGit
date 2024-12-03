package testNG_XML;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GoogleSearch {
	WebDriver driver;
  @Test
  public void googleSearch() {
	  driver.findElement(By.name("q")).sendKeys("sandhya");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
