import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[@id='nav-link-accountList'])[1]"))).build().perform();
      	driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("hel");
   List <WebElement> b= driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']//span[@class='s-heavy']"));
   
   for (WebElement e :b) {
	   if(e.getText().equalsIgnoreCase("met")) {
		   e.click();
			String x=e.getText();
			System.out.println(x);
			break;
	   }
   }
	}

}
