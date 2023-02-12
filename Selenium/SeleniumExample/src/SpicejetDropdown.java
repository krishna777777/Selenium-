import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("divpaxinfo")).click();
		//adding one more adult 
		Thread.sleep(2000);
		//driver.findElement(By.id("hrefIncAdt")).click();
		//clicking on the submit button 
		//driver.findElement(By.id("btnclosepaxoption")).click();
		// let us consider a condition in which you want to click the adult button 4 times 
		// you have to loop that statement . 
		
		
	for(int i=1 ;i<5;i++) {
		
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
	
	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	driver.findElement(By.id("btnclosepaxoption")).click();
    
	}

}
