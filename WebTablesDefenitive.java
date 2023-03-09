import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesDefenitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
  WebDriver driver = new ChromeDriver();
  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
  driver.findElement(By.xpath("//span[@class='sort-icon sort-descending']")).click();
  
  
  List<WebElement> id=	driver.findElements(By.xpath("//tr//td[1]"));
  //System.out.println(name);
List <String> price =id.stream().filter(s->s.getText().contains("Chocolate"))
.map(s->getPriceVegg(s)).collect(Collectors.toList());

price.stream().forEach(s->System.out.println(s));

if (price.size()<1) {
	
	driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	//driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
	List<WebElement> id2=	driver.findElements(By.xpath("//tr//td[1]"));
	List <String> price1 =id2.stream().filter(s->s.getText().contains("Chocolate"))
			.map(s->getPriceVegg(s)).collect(Collectors.toList());

			price1.stream().forEach(s->System.out.println(s)); 
	
}




}
	public static String getPriceVegg(WebElement s ) {
	String value= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return value;
		
	}

}
