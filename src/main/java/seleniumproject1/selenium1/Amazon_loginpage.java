package seleniumproject1.selenium1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_loginpage {

	WebDriver driver;
	@FindBy(id="ap_email")
	WebElement username;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(id="ap_password")
	WebElement password;
	//@FindBy(id="	signInSubmit")
	@FindBy(xpath="	//input[@class='a-button-input']")
	WebElement signin_button;
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	
	//2
	public void username()
	{
	username.sendKeys("anushagoud866@gmail.com");
	}
	public void continue_button()
	{
		continue_button.click();
	}
	public void password()
	{
		password.sendKeys("Amma@@15");
	}
	public void signin_button() 
	{
		signin_button.click();
	}
	public void SearchBox() 
	{
		SearchBox.sendKeys("Shoes",Keys.ENTER);
	}
	
//3
	public Amazon_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}

