package dropdown;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropdownSelectOption {
	WebDriver driver;
  @Test
  public void selectDropdownOption() throws InterruptedException {
	  driver.get("https://www.techlearn.in/");
	  driver.findElement(By.xpath("//a[@class='mega-menu-link'][normalize-space()='Code']")).click();
	  driver.findElement(By.xpath("//a[normalize-space()='Registration']")).click();
	  driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("sandhya");
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mooraka.sandhya010@gmail.com");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	  Thread.sleep(3000);
	 // driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/label[6]/input")).click();
	  
	  Select c = new Select(driver.findElement(By.xpath("//select[@id='countries']")));
	 // c.selectByVisibleText("Austria");
	  //c.selectByValue("AG");
	  c.selectByIndex(0);
  }
	  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
