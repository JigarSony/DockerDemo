package docker;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxDockerDemo {
	
	@Test
	public void testApp() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName(BrowserType.FIREFOX);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"),cap);
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Learn Automation");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
}
