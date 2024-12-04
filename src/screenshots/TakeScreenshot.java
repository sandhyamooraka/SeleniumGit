package screenshots;

import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

import java.io.File;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.devtools.v128.filesystem.model.File;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot {
	WebDriver driver;
  @Test
  public void googleSerach() throws IOException, InterruptedException {
	  
	 driver.get("https://www.google.com/");
	 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("sandhya");
	 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	 Thread.sleep(9000);
	 //File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(f, new File("D:\\Sandhya\\Screenshots\\ErrorPage.png"));
	 Date date = new Date();
	 
	 File f = ((RemoteWebDriver)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f,new File("C:\\Users\\Harsha Y\\Documents\\screenshots\\sandhya_" +".png"));
	 
  }
  
  @Test
  public void googleSerachmethod() throws IOException, InterruptedException {
	  
	 driver.get("https://www.google.com/");
	 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("sandhya");
	 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	 Thread.sleep(3000);
	 TakeScreenShot();
	 
  }
  
  public void TakeScreenShot() throws IOException {
	// TODO Auto-generated method stub
	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_mmm_dd_HH_MM_SS");
			  Date date = new Date();
		String time = dateFormat.format(date);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Harsha Y\\Documents\\screenshots\\GoogleSearch_" + time + ".png"));
	
}

@BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
