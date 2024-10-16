package seleniumproject1.selenium1;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	 
	public class Amazon_Homepage
	{
		WebDriver driver;
	//1
			@FindBy(xpath="//span[@class='nav-line-2 ']")
			WebElement accountsandlists;
			
			@FindBy(xpath="//span[.='Sign in']")
			WebElement signin;
	//2
		public void accountandlists(WebDriver driver)
		{
			Actions a1=new Actions(driver);
			a1.moveToElement(accountsandlists).perform();
		}
		public void signin()
		{
			signin.click();
		}
	//3
		public Amazon_Homepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	}


