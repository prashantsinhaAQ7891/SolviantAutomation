package uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup_principle {

	public static WebDriver driver;
	
	@FindBy(linkText="SIGN IN")
	WebElement signin;
	
	@FindBy(id="signin")
	WebElement signup;
	
	@FindBy(name="full_name")
	WebElement name;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="cpassword")
	WebElement Confirm;
	
	@FindBy(name="next")
	WebElement Submit;
	
	@FindBy(id="global_close")
	WebElement close;
	
	@FindBy(css="#banner > div > div > div > div > div > ul > li:nth-child(1)")
	WebElement it;
	
	@FindBy(css="#cat_three0")
	WebElement software;
	
	@FindBy(id="cat_update")
	WebElement update;
	
		
	public signup_principle(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void startProcess1(String full_name,String email,String password,String cpassword) throws InterruptedException
	{
		signin.click();
		Thread.sleep(1500);
		signup.click();
		name.sendKeys("Automation User18");
		Email.sendKeys("autom31@gmail.com");
		Password.sendKeys("useruser");
		Confirm.sendKeys("useruser");
		
	}
	public void startProcess2()throws InterruptedException 
	{
		Submit.click();
		Thread.sleep(3500);
		close.click();
		Thread.sleep(1000);
		it.click();
		Thread.sleep(1000);
		software.click();
		Thread.sleep(5000);
		update.click();
	}
	
}
