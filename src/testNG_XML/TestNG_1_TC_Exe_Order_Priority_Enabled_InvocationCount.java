package testNG_XML;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_1_TC_Exe_Order_Priority_Enabled_InvocationCount {
	WebDriver driver;
	 @Test
	  	public void twitter() {
		driver.get("https://www.x.com");
	  }
	@Test(priority=2)
	  	public void google() {
		driver.get("https://www.google.com");
	  }
	@Test(priority=10,invocationCount=3)
		public void xflackre() {
		driver.get("https://dev.flackre.com");
	}
	@Test(enabled=false)
	public void facebook() {
	driver.get("https://www.facebook.com");
}
	@Test(priority=1)
	public void techlearn() {
	driver.get("https://www.techlearn.in");
}
	@Test(priority = 0)
	public void selenium() {
	driver.get("https://www.selenium.dev");
}
	@BeforeTest
	public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	}

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
