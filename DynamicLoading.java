import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//button")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		System.out.println(w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4)[2]"))).getText());

	}

}
