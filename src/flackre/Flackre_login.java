package flackre;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Flackre_login {
	WebDriver driver;
  @Test()
  public void Login() throws InterruptedException {
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\":r0:\"]")).sendKeys("mooraka.sandhya010@gmail.com");
	  driver.findElement(By.xpath("//button[@id=':r1:']")).click();
	  Thread.sleep(20000);
	  driver.findElement(By.xpath("//*[@id=\":r3:\"]")).click();
	  Thread.sleep(3000);
  }
  @Test(dependsOnMethods="Login")
  public void Lead() throws InterruptedException {
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(0));
	  Thread.sleep(40000);
	  driver.findElement(By.xpath("//*[text()='+ New Lead']")).click(); 
 	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id=':r6:']")).sendKeys("Project1");
	  driver.findElement(By.xpath("//textarea[@id=':r7:']")).sendKeys("New Project");
	  driver.findElement(By.xpath("//input[@id=':r8:']")).click();
	  driver.findElement(By.xpath("//li[@id=':r8:-option-0']")).click();
	  driver.findElement(By.xpath("//input[@id=':ra:']")).click();
	  driver.findElement(By.xpath("//li[@id=':ra:-option-0']")).click();
	  driver.findElement(By.xpath("//input[@id=':rc:']")).sendKeys("9.9");
	  driver.findElement(By.xpath("//input[@id=':rd:']")).sendKeys("7.6");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[text()='Save & Continue']")).click();
			  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://dev.flackre.com/");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
