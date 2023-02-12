import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropConti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		//driver.findElement(By.linkText("Chennai (MAA)")).click();
		
		// parent to child xpath traversal 
		driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_originStation1_CTNR\"] //a[@value='MAA']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();

	}

}
