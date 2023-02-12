import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		//validating if we clicked the url returns true or false 
	System.out.println(	driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
/* locators for selecting all the checkbox in a page 
	input[type='checkbox'] */
	Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscounts")).isSelected());
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(3000);
	for(int i=1 ;i<5;i++) {
		
		driver.findElement(By.id("hrefIncAdt")).click();
		
	}


System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
driver.findElement(By.id("btnclosepaxoption")).click();
	
	
	}

}
