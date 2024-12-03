package popups;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class alertok {
	WebDriver driver;
 
	@Test(priority=1)
  public void alertOk() throws InterruptedException {
		Thread.sleep(2000);
	  driver.get("https://www.techlearn.in/code/");
	  driver.findElement(By.xpath("//a[normalize-space()='How to handle alert box using selenium ?']")).click();
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  //driver.switchTo().alert().accept();
	  
	Alert alt = driver.switchTo().alert();
	alt.accept();
	  
  }
  
  @Test(priority=2)
  public void alertConfirmation() throws InterruptedException {
	  Thread.sleep(2000);	  
	  driver.findElement(By.xpath("//a[normalize-space()='Confirmation Dialog Box']")).click();
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  driver.switchTo().alert().accept();
  }
  
  @Test(priority=3)
  public void alertConfirmationCancel() throws InterruptedException {
	  Thread.sleep(2000);
	  
	  //driver.findElement(By.xpath("//a[normalize-space()='Confirmation Dialog Box']")).click();
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  driver.switchTo().alert().dismiss();
  }
  
  @Test()
  public void prompt() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Prompt Dialog Box']")).click();
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  driver.switchTo().alert().sendKeys("sandhya");
	  driver.switchTo().alert().accept();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.get("https://www.techlearn.in/code/");
	  driver.manage().window().maximize();
  }

}
