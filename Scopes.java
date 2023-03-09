import java.awt.Window;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int b = driver.findElements(By.tagName("a")).size();
		System.out.println(b);
		
		// changing the scope to footer 
		WebElement footer = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		int a = footer.findElements(By.tagName("a")).size();
		System.out.println(a);
    WebElement discountlink = driver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
    int c = discountlink.findElements(By.tagName("a")).size();
    System.out.println(c);
    
    for (int m =1 ;m<c;m++) {
    	
    String click = 	Keys.chord(Keys.CONTROL,Keys.ENTER);
    discountlink.findElements(By.tagName("a")).get(m).sendKeys(click);
    
    }
    
 Set<String> win=  driver.getWindowHandles();
 
 Iterator<String> it =win.iterator();
 
 while(it.hasNext()) {
	 driver.switchTo().window(it.next());
	 System.out.println(driver.getTitle());
	 
 }
 
 
 
		 
 

	}

}
