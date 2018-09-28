package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase1 {
		
		public static WebDriver driver;
		
		String url="http://18.206.19.251:4000/#!/";
		String browser="chrome";
		
		public void init() throws InterruptedException
		{
			selectBrowser(browser);
			geturl(url);
		}
	private void selectBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			driver=new ChromeDriver();
		}
		}
	private void geturl(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	}
	}
	