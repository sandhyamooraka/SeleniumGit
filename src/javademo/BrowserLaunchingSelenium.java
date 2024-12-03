package javademo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserLaunchingSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		WebDriver driver1= new FirefoxDriver();
		WebDriver driver2 = new EdgeDriver();
		WebDriver driver3 = new SafariDriver();
	}

}
