package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Locators {
	WebDriver driver;
  @Test(enabled=false)
  public void f() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id=':r0:']")).sendKeys("mooraka.sandhya010@gmail.com");
	  Thread.sleep(10000);
	  driver.findElement(By.xpath("//button[@id=':r1:']")).click();
	 
  }
  @Test
  public void google() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("harsha is a dirty fellow");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.get("https://dev.flackre.com");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
