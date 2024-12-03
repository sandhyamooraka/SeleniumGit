package locators;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LocaorsFlackre {
	WebDriver driver;
  @Test
  public void flackreLogin() throws InterruptedException {
	  driver.get("https://dev.flackre.com/");
	  Thread.sleep(5000);
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/input")).sendKeys("mooraka.sandhya010@gmail.com");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\":r1:\"]")).click();
	  
	  Thread.sleep(20000);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\":r3:\"]")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	driver = new ChromeDriver();
	
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
