import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//clicks one time 
		driver.findElement(By.id("divpaxinfo")).click();
		//adding the adult button 
		Thread.sleep(2000);
		for(int i=1;i<5;i++) {
		driver .findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		driver.findElement(By.xpath("//div/ul/li[8]")).click();
		
	}
		

}
