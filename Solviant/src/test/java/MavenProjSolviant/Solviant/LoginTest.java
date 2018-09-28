package MavenProjSolviant.Solviant;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testbase.TestBase1;
import uiActions.LoginUI;


public class LoginTest extends TestBase1 {
	LoginUI pageObj;
	
	@BeforeTest
	public void openBrowser()throws InterruptedException
	{
		init();
	}
	
	@Test
	public void Login()throws Exception
	{
		pageObj=new LoginUI(driver);
		System.out.println("Test Started");
		pageObj.startProcess();
		System.out.println("Test Passed");
		System.out.println("Login-Log Out Tested");
	}
	
	@AfterTest
	public void close()
	{
		//driver.close();
	}
}
