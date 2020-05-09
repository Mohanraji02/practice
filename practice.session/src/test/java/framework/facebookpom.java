package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class facebookpom {
	
	WebDriver driver;
	public facebookpom(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
	@FindBy(id="email")
	WebElement username;
	
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id=" ")
	WebElement login;
	
	public void login(String user,String pass)
	{
		
		username.sendKeys(user);
		password.sendKeys(pass);
		login.click();
	}
	
	
	
	
}
