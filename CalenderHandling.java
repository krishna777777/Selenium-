import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companion/");
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
List <WebElement> calender = driver.findElements(By.cssSelector("span.flatpickr-day"));


for (int i =0 ;i<calender.size();i++) {
	String text = driver.findElements(By.cssSelector("span.flatpickr-day")).get(i).getText();
	if(text.equalsIgnoreCase("23")) {
		driver.findElements(By.cssSelector("span.flatpickr-day")).get(i).click();
		break;
	}
	
	
	
}

	}

}
