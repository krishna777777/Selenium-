import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefeniteCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.cssSelector("input#datepicker")).click();

		String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

		String month = monthyear.split(" ")[0].trim();

		String year = monthyear.split(" ")[1].trim();

		// System.out.println(month);
		// System.out.println(year);

		while (!(month.equals("July") && year.equals("2024"))) {

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			month = monthyear.split(" ")[0].trim();
			year = monthyear.split(" ")[1].trim();

		}
		System.out.println(month);
		System.out.println(year);

		List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler]//a"));

		int count = dates.size();

		for (int i = 0; i < count; i++) {
			String ddate = driver.findElements(By.xpath("//td[@data-handler]//a")).get(i).getText();

			if (ddate.equalsIgnoreCase("1")) {

				driver.findElements(By.xpath("//td[@data-handler]//a")).get(i).click();
			}
		}

	}
}
