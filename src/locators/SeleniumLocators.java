package locators;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SeleniumLocators {
	WebDriver  driver;
  @Test(enabled=false)
  public void hydLogin() {
	  driver.findElement(By.id("edit-name")).sendKeys("hilogin");
	  driver.findElement(By.name("pass")).sendKeys("hi");
	  driver.findElement(By.className("form-submit")).click();
  }
  @Test(enabled=false)
  public void hydLogin1() {
	  driver.findElement(By.id("edit-name")).sendKeys("hilogin");
	  driver.findElement(By.name("pass")).sendKeys("hi");
	  //driver.findElement(By.className("form-submit")).click();
	  driver.findElement(By.cssSelector("#edit-submit")).click();
  }
  @Test
  public void apsrtc() throws InterruptedException {
	  driver.findElement(By.id("fromPlaceName")).sendKeys("Bangalore");
	  driver.findElement(By.cssSelector("#toPlaceName")).sendKeys("Kanigir");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector(".chkavailabilityBtn")).click();
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver = new ChromeDriver();
	 // driver.get("http://hyderabadreport.com/user");
	  driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
	  Thread.sleep(3000);
  }

}
