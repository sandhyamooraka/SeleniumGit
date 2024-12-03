package isdisplyed_enabled_selected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Isdispled_enabled_selected {
	WebDriver driver;
  @Test
  public void isDisplayed() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  
	  Boolean help = driver.findElement(By.linkText("help@flackre.com")).isDisplayed();
	  
	  if(help){
		  
		  driver.findElement(By.linkText("help@flackre.com")).click();
	  }
	  else {
		  System.out.println("help not available");
	  }
  }
  
  @Test
  public void isEnableded() throws InterruptedException {
	  
	  Thread.sleep(3000);
	
	   driver.get("https://www.techlearn.in/admin");
	   boolean pswd = driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).isEnabled();
	   
	   if(pswd) {
		   
		   driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Password");
	   }
	   else {
		   System.out.println("password not enabled");
	   }
  }
  
  @Test
  public void isSelected() throws InterruptedException {
	  
	  Thread.sleep(3000);
	
	   driver.get("https://www.techlearn.in/admin");
	   
	   Boolean remind = driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).isSelected();
	   
	   if(remind) {
		   
		   System.out.println("remind me already selected");
	   }
	   else {
		   driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
	   }
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://dev.flackre.com/signin");
	  }

}
