package Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test1 
{
	WebDriver wd;
	@Test
	@Parameters({"browser"})
		public void build(String br)  throws Exception
		{
			if(br.matches("firefox"))
			{
				wd= new FirefoxDriver();
			}
		Login obj= new Login(wd);
		obj.valid_login();
		obj.compose();
	}
}
