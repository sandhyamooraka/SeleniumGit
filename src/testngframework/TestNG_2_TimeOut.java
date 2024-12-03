package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_2_TimeOut {
	WebDriver driver;
  @Test(priority=0,timeOut=9000)
  public void techLearn() throws InterruptedException {
	  driver.get("https://www.google.com");
	  driver.findElement(By.className("gLFyf")).sendKeys("TestNG");
	  driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
	  driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  driver.quit();
  }
  
  
}
