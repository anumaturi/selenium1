package seleniumproject1.selenium1;

import org.testng.annotations.Test;

public class TestCase1 extends LaunchAndQuit
{
	@Test
	public void login_to_amazon() throws InterruptedException
	{
		Amazon_Homepage homepage=new Amazon_Homepage(driver);
		homepage.accountandlists(driver);
		homepage.signin();
		
		Amazon_loginpage loginpage=new Amazon_loginpage(driver);
		loginpage.username();
		loginpage.continue_button();
		loginpage.password();
		loginpage.signin_button();
		
	}

}

	
