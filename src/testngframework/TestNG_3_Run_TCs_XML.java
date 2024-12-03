package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_3_Run_TCs_XML {
	WebDriver driver;
	 @Test
	  	public void twitter() {
		driver.get("https://www.x.com");
	  }
	@Test()
	  	public void google() {
		driver.get("https://www.google.com");
	  }
	@Test()
		public void xflackre() {
		driver.get("https://dev.flackre.com");
	}
	@Test()
	public void facebook() {
	driver.get("https://www.facebook.com");
}
	@Test()
	public void techlearn() {
	driver.get("https://www.techlearn.in");
}
	@Test()
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
