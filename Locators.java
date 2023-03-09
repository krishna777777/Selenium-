import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriver obj = new ChromeDriver();
		// wait for 5 seconds syntax 
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		obj.get("https://rahulshettyacademy.com/locatorspractice/");
		//obj.close();
		obj.findElement(By.id("inputUsername")).sendKeys("krishna");// want to type krishna 
		//in username field . 
	    obj.findElement(By.name("inputPassword")).sendKeys("rahulshetty");
	    // to get the password 
	    obj.findElement(By.className("signInBtn")).click(); //clicking the signin button .

	    
	    obj.findElement(By.cssSelector("p.error")).getText();// Retrieving the error text .
	    
		//System.out.println(obj.findElement(By.cssSelector("p.error")).getText());
	    
	    //Forgot Password Flow 
	    obj.findElement(By.linkText("Forgot your password?")).click();
	    
	    // applying the stop time for the transition so the reset-password is not affected
	    Thread.sleep(1000);
	  //sending the username
	    obj.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("krishna");
	   // sending the email 
	   obj.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("abc@gmail.com");
	   // click on the Reset Login Button 
	   //obj.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	   
       //phone number flow 
	   obj.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("123456");
	   //click the rest password button 
	   obj.findElement(By.cssSelector(".reset-pwd-btn")).click();
	   //collecting the password
	  System.out.println(obj.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/p")).getText());   
	   //going back to the login screen and typing in the username 
	   obj.findElement(By.id("inputUsername")).sendKeys("krishna");
	   //typing the password 
	   obj.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys("rahulshettyacademy");
	   // clicking the go to login button 
	   obj.findElement(By.xpath("//button[.='Go to Login']")).click();
	   //Wait time for the login function to work 
	   Thread.sleep(1000);
	   //checking the checkboxes
	   obj.findElement(By.xpath("//*[@id=\"chkboxOne\"]")).click();
	   obj.findElement(By.xpath("//*[@id=\"chkboxTwo\"]")).click();
	   //waiting some seconds for the login to work 
	   obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   //click the login button 
	   obj.findElement(By.cssSelector("button.signInBtn")).click();
	   
	}
	

}
