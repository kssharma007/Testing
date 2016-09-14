package Final;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Open 
{
	WebDriver wd;
	public Open(WebDriver wd)
	{
		this.wd=wd;
	}
	public void start()
	{
	wd.manage().window().maximize();
	wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	wd.get("http://google.com");
	}
	public void validText() 
	{
		start();
		String s[]={"Gmail", "Images"};
		WebElement w1=wd.findElement(By.xpath("//div[@class='gb_hf gb_R gb_wf gb_of']"));
		List<WebElement>lst=w1.findElements(By.xpath("div/a"));
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for (int i=0; i<=s.length; i++)
		{ 
			if(s[i].matches(lst.get(i).getText())) 
					
			{
				System.out.println("link matching"+s[i]);
			}
			else
			{
				System.out.println("link is not mathing"+s[i]);
			}
		}// end of for
	} // end of method
	public void validLink() throws Exception
	{
		start();
		WebElement w1=wd.findElement(By.xpath("//div[@class='gb_hf gb_R gb_wf gb_of']"));
		List<WebElement> we =w1.findElements(By.tagName("a"));
		Thread.sleep(8000);
		for(int i=0; i<=we.size();i++)
			{
				we.get(i).click();	
				System.out.println(wd.getTitle());
				wd.navigate().back();
				Thread.sleep(3000);
				w1=wd.findElement(By.xpath("//div[@class='gb_hf gb_R gb_wf gb_of']"));
				we =w1.findElements(By.tagName("a"));
			}// end of for
	} // end of valid
}
