package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Groups_TC_main {
  WebDriver driver;
	@Test
  public void googleSearch() {
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("redmine");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
  }
	@Test
	  public void redMine() {
			driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sandhya");
			driver.findElement(By.xpath("//input[@id='autologin']")).click();
			driver.findElement(By.xpath("//a[@class='lost_password']")).click();
			driver.findElement(By.xpath("//input[@id='mail']")).sendKeys("mooraka.sandhya010.gmail.com");
			driver.findElement(By.xpath("//input[@name='commit']")).click();
			
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.get("https://www.redmine.org");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
