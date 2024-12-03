package navigationmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.manage().window().fullscreen();
		 Thread.sleep(2000);
		 driver.get("https://dev.flackre.com");
		 Thread.sleep(2000);
		 driver.navigate().to("https://www.google.com");
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 driver.close();
	}

}
