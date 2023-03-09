import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingRevamp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		int j=0 ; 

		List<WebElement> pname = driver.findElements(By.cssSelector("h4.product-name"));
		// button[text()='ADD TO CART']
		String fruits []= {"Brocolli", "Cucumber","Cauliflower"};
		List al = Arrays.asList(fruits);
		for (int i = 0; i < pname.size(); i++) {
			String[] name = pname.get(i).getText().split("-");
			String formattedname = name[0].trim();
			if (al.contains(formattedname)) {
				j++;
				
				System.out.println(formattedname);
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
				
				driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
				
				if (j==fruits.length) {
					break;
				}

			}

		}
	}
}
