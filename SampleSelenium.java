import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleSelenium {
	
	@Test
	public void sample() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
String x= driver.findElement(By.xpath("//span[@id='numb1']")).getText();
String y= driver.findElement(By.xpath("//span[@id='numb2']")).getText();

int num1 = Integer.parseInt(x);
 int num2 = Integer.parseInt(y);
 
 int num3 = num1+num2 ;
 
 driver.findElement(By.xpath("//input[@id='number']")).sendKeys((String.valueOf(num3)));

		
		
	}

}
