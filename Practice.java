import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver obj= new ChromeDriver();
		
	// For only the sign in part . 	
	   obj.get("https://rahulshettyacademy.com/locatorspractice/");
	   obj.findElement(By.id("inputUsername")).sendKeys("krishna");
	   obj.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys("rahulshettyacademy");
	   obj.findElement(By.xpath("//*[@id=\"chkboxOne\"]")).click();
	   obj.findElement(By.xpath("//*[@id=\"chkboxTwo\"]")).click();
	   obj.findElement(By.cssSelector("button.signInBtn")).click();
	   
		

	}

}
