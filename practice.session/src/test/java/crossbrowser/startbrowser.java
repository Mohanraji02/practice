package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class startbrowser {
	
	
	static WebDriver driver;
	public static WebDriver start(String url,String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohan raji\\Desktop\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.get(url);
			
		}
		
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohan raji\\Desktop\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get(url);
		}
	return driver;
	}

}
