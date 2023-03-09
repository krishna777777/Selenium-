import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QualysAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
driver.get("https://qualysguard.p01.eng.sjc01.qualys.com/portal-front/");
driver.findElement(By.cssSelector("input#ext-comp-1005")).sendKeys("uw_uw");
driver.findElement(By.cssSelector("input#ext-comp-1006")).sendKeys("Qatest@123");
driver.findElement(By.id("ext-gen23")).click();
driver.switchTo().newWindow(WindowType.TAB);
Set<String> abc = driver.getWindowHandles();

Iterator<String> it= abc.iterator();
String parent = it.next();
String child = it.next();

driver.switchTo().window(child);
driver.get("https://qualysguard.p01.eng.sjc01.qualys.com/ioc/");




	}

}
