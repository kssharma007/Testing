package Final;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Login 
{
	WebDriver wd;
	public Login(WebDriver wd)
	{
		this.wd=wd;
	}
	public void start()
	{
		wd.manage().window().maximize();
		wd.get("http://google.com");
		wd.findElement(By.linkText("Gmail")).click();
	}
	public void valid_login() throws Exception, Exception 
	{
		String s;
		String a[];
		FileReader fr= new FileReader("E:\\selenium\\uidandpwd.txt");
		BufferedReader br= new BufferedReader(fr);
			while ((s=br.readLine())!= null)
			{
				a=s.split(",");
				Thread.sleep(5000);
				start();
				WebElement w3 =wd.findElement(By.name("Email"));
				w3.sendKeys(a[0]);
				wd.findElement(By.id("next")).click();
				wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement w4= wd.findElement(By.name("Passwd"));
				w4.sendKeys(a[1]);
				WebElement w5= wd.findElement(By.xpath("//label/input[@id='PersistentCookie']"));
				w5.click();
				wd.findElement(By.id("signIn")).click();
				Thread.sleep(12000);
				}// end of while
	}
	
	public void compose() throws Exception
	{
		Thread.sleep(12000);;
		WebElement w1= wd.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
		w1.click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement w2= wd.findElement(By.xpath("//textarea[@id=':13p']"));
		w2.sendKeys("kartik_pavanyahoo.co.in");
		wd.findElement(By.name("subjectbox")).sendKeys("Test mail");
		WebElement w3=wd.findElement(By.xpath("//div[@id=':14e']"));
		w3.sendKeys("This is to inform you that the mail has been sent succesfully using automation testing");
		wd.findElement(By.xpath("//div[@id=':12z']")).click();
		wd.findElement(By.name("ok")).click();
		WebElement w4 =wd.findElement(By.xpath("//div[@class='og T-I-J3']"));
		w4.click();
		String str=wd.findElement(By.xpath("//span[@class='bofITb']")).getText();
		System.out.println("Message:="+str);
	}
}
