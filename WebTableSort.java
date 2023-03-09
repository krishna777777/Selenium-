import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//span[@class='sort-icon sort-descending']")).click();
	List<WebElement> names = driver.findElements(By.xpath("//tbody//td[1]"));
// getting the name 	 
List<String> names2=names.stream().map(s->s.getText()).collect(Collectors.toList());
// new list 
List<String> sortedList = names2.stream().sorted().collect(Collectors.toList());
// asserting 
Assert.assertTrue(names2.equals(sortedList));


// get the cost of the wheat and print it in the output 










	

	

	
	
	

	}
}


