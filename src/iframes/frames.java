package iframes;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class frames {
	WebDriver driver;
  @Test
  public void iframes() throws InterruptedException {
	  Thread.sleep(3000);
	  
	 WebElement obj = driver.findElement(By.xpath("//h2[normalize-space()='The alert() Method']"));
	 driver.switchTo().frame(obj);
	 driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	  
  }

}
