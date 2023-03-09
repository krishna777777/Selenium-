import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.cssSelector("input#ctl00_mainContent_view_date1")).click();
		
System.out.println(		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")).getText());
		
		
	List<WebElement> calender=	 driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
	
	for (int i=0;i<calender.size();i++) {
		String x = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
		
		if (x.equalsIgnoreCase("24")) {
			driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
			break;
			
			
		}
		
		
	}
	
	driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
	
	List<WebElement> endMon = driver.findElements(By.xpath("//td[@data-handler='selectDay']//a"));
	
	
	for (int j=0;j<endMon.size();j++) {
		String y = driver.findElements(By.xpath("//td[@data-handler='selectDay']//a")).get(j).getText();
		
		if (y.equalsIgnoreCase("10")) {
			
			driver.findElements(By.xpath("//td[@data-handler='selectDay']//a")).get(j).click();
			break;
			
		}
	}

	}

}
