package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class Loginpage extends Basepage{
	@FindBy(xpath="//span[.='Hello, Sign in']")
	private WebElement signinbutton;
	
	@FindBy(id="ap_email")
	private WebElement emailaddress;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signin;
	
	public  Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void signinlink()
	{
		signinbutton.click();
	}
	
	public void emailaddresstb(String username)
	{
		emailaddress.sendKeys(username);
	}
	
	public void passwordtb(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void login()
	{
		signin.click();
	}

}
