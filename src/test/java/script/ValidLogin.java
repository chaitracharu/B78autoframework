package script;

import org.testng.Assert;

import generic.BaseTest;
import page.LoginPage;
import page.EnterTimeTrackPage;

public class ValidLogin extends BaseTest {
	public  void testValidLogin()
	{
		//1.enter valid un
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName("admin");
		
		//2.enter valid pw
		loginPage.setPassword("manager");
		
		//3.click login button
		loginPage.clickButton();
		
		//4.home page should be displayed
		EnterTimeTrackPage ETTPage=new EnterTimeTrackPage(driver);
		boolean result = ETTPage.verifyHomePageIsDisplayed(wait);
		Assert.assertEquals(result,true);
		
	}
	
	

}
