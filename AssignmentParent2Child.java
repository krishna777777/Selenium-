import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentParent2Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> iterator = s.iterator();
		String parent = iterator.next();
		String child = iterator.next();
		driver.switchTo().window(child);

		System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());

	}

}
