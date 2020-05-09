package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import crossbrowser.startbrowser;
public class facebook {
	
	
	
	@Parameters({"url","browser"})
	@Test
	public void execution(String url,String browser)
	{
		
		WebDriver driver=startbrowser.start(url,browser);
		facebookpom method=PageFactory.initElements(driver, facebookpom.class);
		method.login("billamohan02@gmail.com", "rajimohan");
		
	}
	

}
