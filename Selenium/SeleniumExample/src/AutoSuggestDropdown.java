import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		// we are catching all the options so we use the list of web elements to store the list 
		List<WebElement> a =driver.findElements(By.xpath("//li[@class='ui-menu-item']//a[@class='ui-corner-all']"));
		
		/*   
		 * Java for-each Loop
The for-each loop is used to traverse array or collection in Java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.

It works on the basis of elements and not the index. It returns element one by one in the defined variable.

Syntax:

for(data_type variable : array_name){    
//code to be executed    
}    
		 */
		
		for(WebElement b :a) {
			if(b.getText().equalsIgnoreCase("India")) {
				b.click();
				String x=b.getText();
				System.out.println(x);
				break;
				}
			}
		}
		
		

	}


