package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage {
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(text(),'Invalid')]")
	private WebElement errMSG;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickButton()
	{
		loginBTN.click();
	}
	
	public boolean verifyErrMsgIsDisplayed(WebDriverWait wait)
	{
		try
		{
		wait.until(ExpectedConditions.visibilityOf(errMSG));
		Reporter.log("Err Msg is Displayed");
		return true;
		}
		catch(Exception e)
		{
			Reporter.log("Err Msg is NOT Displayed");
			return false;
		}
	
     }
	
	
  }
