package Final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Marking 
{
	WebDriver wd;
	public Marking(WebDriver wd)
	{
		this.wd=wd;
	}
	public void open() throws Exception
	{
		wd.manage().window().maximize();
		wd.get("https://mail.google.com");
		WebElement w1= wd.findElement(By.name("Email"));
		w1.sendKeys("kingufkings");
		wd.findElement(By.id("next")).click();
		Thread.sleep(5000);
		WebElement w2= wd.findElement(By.xpath("//input[@name='Passwd']"));
		w2.sendKeys("zlatanibrahmovic");
		WebElement w3= wd.findElement(By.xpath("//label/input[@id='PersistentCookie']"));
		w3.click();
		wd.findElement(By.id("signIn")).click();
	}
	public void marking() throws Exception
	{
		Thread.sleep(12000);
		wd.findElement(By.xpath("(//div[@role='checkbox'])[position()=1]")).click();
		wd.findElement(By.xpath("(//div[@role='checkbox'])[position()=2]")).click();
		wd.findElement(By.xpath("(//div[@role='checkbox'])[position()=4]")).click();
		wd.findElement(By.xpath("(//div[@role='checkbox'])[position()=5]")).click();
		wd.findElement(By.xpath("(//div[@role='checkbox'])[position()=6]")).click();
		wd.findElement(By.xpath("(//div[@role='checkbox'])[position()=7]")).click();
		Thread.sleep(5000);
		Actions a1= new Actions(wd);
		WebElement w4=wd.findElement(By.xpath("//span[@class='gb_7a gbii']"));
		a1.moveToElement(w4).perform();
		w4.click();
		wd.findElement(By.id("gb_71")).click();				
	}
}
