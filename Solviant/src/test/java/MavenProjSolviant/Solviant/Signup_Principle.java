package MavenProjSolviant.Solviant;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testbase.TestBase1;
import uiActions.signup_principle;

public class Signup_Principle extends TestBase1 {
	
	signup_principle pageObj;
	
	@BeforeTest
	public void launch()throws InterruptedException 
	{
		init();
	}
	
	@Test
	public void signup ()throws Exception
	{
		pageObj=new signup_principle(driver);
		pageObj.startProcess1("full_name","email","password","cpassword");
		Select drp=new Select(driver.findElement(By.name("user_type")));
		drp.selectByVisibleText("Give a Solution");
		pageObj.startProcess2();		
	}	
}
