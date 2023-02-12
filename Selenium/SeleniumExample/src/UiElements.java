import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UiElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		//validating if we clicked the url returns true or false 
	System.out.println(	driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
     driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
    
     System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
     
     System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
     
     if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
     {
    	 System.out.println("it is enabled ");
    	 Assert.assertTrue(true);
     }
    
	
	}
	

}
