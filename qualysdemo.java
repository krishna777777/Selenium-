import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qualysdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.get("https://qualysguard.p01.eng.sjc01.qualys.com/portal-front/");
         driver.findElement(By.cssSelector("input#ext-comp-1005")).sendKeys("uw_uw");
         driver.findElement(By.cssSelector("input#ext-comp-1006")).sendKeys("Qatest@123");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.findElement(By.xpath("//*[@id=\"ext-comp-1010\"]/tbody/tr[2]/td[2]")).click();
		
	}

}
