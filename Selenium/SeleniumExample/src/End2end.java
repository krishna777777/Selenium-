import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End2end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Delhi (DEL)")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isDisplayed());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		
		for (int i=0;i<4;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
	WebElement b=	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	
      Select obj = new Select (b);
      obj.selectByValue("USD");
      
      driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	
		
		
	}

}
