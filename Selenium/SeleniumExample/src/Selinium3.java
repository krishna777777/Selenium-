import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




	


public class Selinium3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name ="krishna";
		WebDriver obj = new ChromeDriver();
		obj.get("https://rahulshettyacademy.com/locatorspractice/");
		obj.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);//
		obj.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		// object since my method is public 
		
		Selinium3 obj2= new Selinium3();
		String password = obj2.PasswordExtractor(obj);
		
		
		
		
		obj.findElement(By.cssSelector("button.go-to-login-btn")).click();
		obj.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		obj.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(password);
		//obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		obj.findElement(By.cssSelector("input#chkboxOne")).click();
		obj.findElement(By.cssSelector("input#chkboxTwo")).click();
		obj.findElement(By.cssSelector("button.signInBtn")).click();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    System.out.println(obj.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
		Assert.assertEquals(obj.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(), "You are successfully logged in.");
		//obj.findElement(By.xpath("//h2")).getText();
		Assert.assertEquals(obj.findElement(By.xpath("//h2")).getText(), "Hello "+name+",");
		obj.findElement(By.cssSelector("button.logout-btn")).click();
		//obj.close();
		
	}
	
	
	public String PasswordExtractor(WebDriver obj){
	   String s = obj.findElement(By.cssSelector("p.infoMsg")).getText();
	   //Please use temporary password 'rahulshettyacademy' to Login.
	   
	   String s1[]=s.split("'");
		String s2= s1[1];
		return s2;
		
		
	   
		
		
		
	}

}
