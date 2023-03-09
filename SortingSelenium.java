import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Carrot");
	List<WebElement> values=	driver.findElements(By.xpath("//tr//td[1]"));
	
	List<WebElement> value2 =values.stream().filter(s->s.getText().contentEquals("Carrot")).collect(Collectors.toList());

	 Assert.assertEquals(values.size(), value2.size());
	}

}
