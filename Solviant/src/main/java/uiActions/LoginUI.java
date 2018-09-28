package uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUI {

		
		public static WebDriver driver;
		
		@FindBy(linkText="SIGN IN")
		WebElement signinButton;
		
		@FindBy(name="lEmail")
		WebElement emailID;
		
		@FindBy(name="lpassword")
		WebElement password;
		
		@FindBy(xpath="//*[@id=\"msform\"]/fieldset/input[2]")
		WebElement LoginButton;
		
		@FindBy(id="hamburger_icon")
		WebElement HamMenu;
		
		@FindBy(linkText="Log Out")
		WebElement LogOut;
				
		
		
		public LoginUI(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		public void startProcess() throws InterruptedException
		{
			signinButton.click();
			Thread.sleep(1500);
			emailID.sendKeys("pksinha7891@gmail.com");
			Thread.sleep(1500);
			password.sendKeys("solviant");
			Thread.sleep(1500);
			LoginButton.click();
			Thread.sleep(5000);
			HamMenu.click();
			Thread.sleep(1500);
			LogOut.click();

	}

}
