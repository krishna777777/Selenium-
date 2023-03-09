import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("span.red-arrow-btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Chennai (MAA)")).click();
		// static elements handling .
	WebElement element =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select obj = new Select(element);
		obj.selectByIndex(1);
		System.out.println(obj.getFirstSelectedOption().getText());
		//selecting the option based upon the text visible in the text box .
		obj.selectByVisibleText("AED");
		System.out.println(obj.getFirstSelectedOption().getText());
		
	}

}
